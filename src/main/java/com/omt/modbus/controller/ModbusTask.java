package com.omt.modbus.controller;

import com.omt.ITD.dto.FaultLogDto;
import com.omt.ITD.dto.ITDFaultDto;
import com.omt.ITD.service.FaultLogService;
import com.omt.ITD.service.ITDFaultService;
import com.omt.modbus.dto.ModbusLogDto;
import com.omt.modbus.service.ModbusService;
import com.omt.modbus.util.ModbusUtil;
import com.omt.modbus.util.PubUtil;
import com.serotonin.modbus4j.ModbusMaster;
import com.serotonin.modbus4j.exception.ModbusInitException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by QiaoJian on 2018/8/25.
 */
@Component
public class ModbusTask {

    @Autowired
    ModbusService modbusService;
    @Autowired
    ITDFaultService itdFaultService;
    @Autowired
    FaultLogService faultLogService;
    /*
     第一位，表示秒，取值0-59
     第二位，表示分，取值0-59
     第三位，表示小时，取值0-23
     第四位，日期天/日，取值1-31
     第五位，日期月份，取值1-12
     第六位，星期，取值1-7，星期一，星期二...，注：不是第1周，第二周的意思
     另外：1表示星期天，2表示星期一。
     第7为，年份，可以留空，取值1970-2099*/

    /*(*)星号：可以理解为每的意思，每秒，每分，每天，每月，每年...
    (?)问号：问号只能出现在日期和星期这两个位置，表示这个位置的值不确定，每天3点执行，所以第六位星期的位置，我们是不需要关注的，就是不确定的值。同时：日期和星期是两个相互排斥的元素，通过问号来表明不指定值。比如，1月10日，比如是星期1，如果在星期的位置是另指定星期二，就前后冲突矛盾了。
    (-)减号：表达一个范围，如在小时字段中使用“10-12”，则表示从10到12点，即10,11,12
    (,)逗号：表达一个列表值，如在星期字段中使用“1,2,4”，则表示星期一，星期二，星期四
    (/)斜杠：如：x/y，x是开始值，y是步长，比如在第一位（秒） 0/15就是，从0秒开始，每15秒，最后就是0，15，30，45，60

    0 0 3 * * ?     每天3点执行
    0 5 3 * * ?     每天3点5分执行
    0 5 3 ? * *     每天3点5分执行，与上面作用相同
    0 5/10 3 * * ?  每天3点的 5分，15分，25分，35分，45分，55分这几个时间点执行
    0 10 3 ? * 1    每周星期天，3点10分 执行，注：1表示星期天
    0 10 3 ? * 1#3  每个月的第三个星期，星期天 执行，#号只能出现在星期的位置
    */

    /**
     * 登录日志、温湿日志、故障日志记录
     */
    @Scheduled(cron = "0/5 * * * * *")
    public void getModbusLog(){

        System.out.println("定时任务开始");
        ModbusLogDto dto = new ModbusLogDto();
        ModbusMaster master = PubUtil.getRtuMaster();
        String str = "";
        try {
            master.init();
            str = ModbusUtil.subStrFirstAndLast(ModbusUtil.readHoldingRegistersTest(master, 2, 0, 100));  ////读电压电流数据  ----//64
            //str="0, 0, 1, 0, 0, 0, 1, 0, 229, 0, 229, 231, 22, 230, 0, 229, 27, 54, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0";
            String[] strs = str.split(",");
            String login_no = strs[50].trim(); //登录工号

            System.out.println("login_no--"+login_no);

            dto.setLogin_no(login_no);
            if(!"0".equals(login_no)){
                List list = modbusService.loginLogQry(dto);
                if(list.size() == 0){
                    modbusService.addLoginLog(dto);
                }
            }
            if("0".equals(login_no)){
                modbusService.updateLoginLog(dto);
            }

            String[] hs_light_fault = PubUtil.getArrayReverse(strs[7].trim()); //黄闪灯故障状态 0
            String[] canopy_lamp_fault = PubUtil.getArrayReverse(strs[4].trim()); //雨棚灯故障状态 type 1
            String[] traffic_light_fault = PubUtil.getArrayReverse(strs[5].trim()); //通行灯故障状态 2
            String[] railing_fault = PubUtil.getArrayReverse((strs[6].trim())); //栏杆机故障状态 3

            addFaultLog(hs_light_fault,"0");
            addFaultLog(canopy_lamp_fault,"1");
            addFaultLog(traffic_light_fault,"2");
            addFaultLog(railing_fault,"3");

            //温湿日志记录
            ModbusLogDto dto1 = new ModbusLogDto();
            dto1.setTemp("1");
            String temp = strs[16].trim();
            String hum = strs[17].trim();

            List list = modbusService.tempAndHumLogLogQry(dto1);
            if(list.size() == 0){
                dto1.setTemp(temp);
                dto1.setHumidity(hum);
                modbusService.addTempAndHumLog(dto1);
            }
            if(list.size() != 0){
                dto1 = modbusService.tempAndHumLogLogQry(dto1).get(0);
                String Mtemp = dto1.getTemp();
                String Mhum = dto1.getHumidity();

                boolean a = Integer.parseInt(temp)-Integer.parseInt(Mtemp)>=2;
                boolean b = Integer.parseInt(Mtemp)-Integer.parseInt(temp)>=2;
                boolean c = Integer.parseInt(hum)-Integer.parseInt(Mhum)>=2;
                boolean d = Integer.parseInt(Mhum)-Integer.parseInt(hum)>=2;
                if(a ||b ||c||d){
                    dto1.setTemp(temp);
                    dto1.setHumidity(hum);
                    modbusService.addTempAndHumLog(dto1);
                }
            }



        } catch (ModbusInitException e) {
            e.printStackTrace();
        }finally {
            System.out.println("定时任务结束");
            master.destroy();
        }
    }

    public void addFaultLog(String[] strs,String type){

        int num = 0;
        ITDFaultDto faultDto = new ITDFaultDto();
        String fault_code = "";
        String fault_des = "";
        FaultLogDto faultLogDto = new FaultLogDto();
        faultLogDto.setFault_equipment(type);
        faultLogDto.setFault_name("郑州站1号车道出口");
        faultLogDto.setStatus1("1");
        List<FaultLogDto> list = faultLogService.qryFaultLogInfo(faultLogDto);
        if(list.size()==0){
            for(int i = 0; i < strs.length; i++){
                if("1".equals(strs[i])){
                    num++;
                }
            }
            System.out.println("num1111---"+num);
            if(num>0){
                for(int i = 0; i < strs.length; i++){
                    if("1".equals(strs[i])){
                        faultDto.setEquipment_type("1"); //雨棚
                        faultDto.setFault_code(String.valueOf(i));
                        String fault_name = itdFaultService.getFaultName(faultDto);
                        fault_code = fault_code+","+Integer.valueOf(i);
                        fault_des = fault_des+","+fault_name;
                    }
                }
                faultLogDto.setFault_name("郑州站1号车道出口");
                faultLogDto.setProblem_description(fault_des.substring(1,fault_des.length()));
                faultLogDto.setFault_code(fault_code.substring(1,fault_code.length()));
                faultLogService.addFaultLogInfo(faultLogDto);
            }

        }else{
            FaultLogDto dto = list.get(0);
            for(int i = 0; i < strs.length; i++){
                if("0".equals(strs[i])){
                    num++;
                }
            }
            System.out.println("num---"+num);
            if(num == 8){
                faultLogDto.setId(dto.getId());
                faultLogDto.setEnd_time("1");
                faultLogDto.setStatus("3");
                faultLogService.updateFaultLogInfo(faultLogDto);
            }
        }


    }

}
