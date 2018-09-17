package com.omt.modbus.controller;

import com.omt.modbus.dto.ModbusDataDto;
import com.omt.modbus.service.ModbusService;
import com.omt.modbus.util.ModbusUtil;
import com.omt.modbus.util.PubUtil;
import com.serotonin.modbus4j.ModbusMaster;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * Created by QiaoJian on 2018/7/27.
 */
//@RestController
public class ModbusController {

    @Autowired
    ModbusService modbusService;

    /**
     * 读取数字型数据
     * @param ip
     * @param slaveId
     * @param start
     * @param len
     * @return
     */
    //@RequestMapping(value = "/getHoldModbusData")
    public synchronized static ModbusDataDto getHoldModbusData(String ip, int slaveId, int start, int len){

        ModbusDataDto dto = new ModbusDataDto();

        System.out.println(ip+","+slaveId+","+start+","+len);

        String str = "";

        ModbusMaster master = PubUtil.getRtuMaster();
        try{
            master.init();
            //读取数据去掉前后[]  start 16  len   10
            str = ModbusUtil.subStrFirstAndLast(ModbusUtil.readHoldingRegistersTest(master, 2, 0, 100));  ////读电压电流数据  ----//64
            //String str = "0,96,64,64,64,96,96,96,220,220,220,220,220,220,30,30,25,30,192,196,101,101,192,196,101,101,192,196,101,101,192,196,101,101,192,196,101,101,192,196,101,101,192,196,101,101,192,196,101,101,0000,0,2,6,7,3,5,4,1,0,1,2,3,4,5,6,7,96,96,96,96";
            String[] strs = str.split(",");
            dto.setWork_mode(strs[0]);      // 工作模式
            String[] pc_dos = PubUtil.getArrayReverse(strs[1].trim()); //pcdo
            String[] pc_dis = PubUtil.getArrayReverse(strs[71].trim()); //pcdi
            String[] F103_dos = PubUtil.getArrayReverse(strs[2].trim()); //f103 do
            String[] F103_dis = PubUtil.getArrayReverse(strs[3].trim()); //f103 di
            String[] canopy_lamp_fault = PubUtil.getArrayReverse(strs[4].trim()); //雨棚灯故障状态
            String[] traffic_light_fault = PubUtil.getArrayReverse(strs[5].trim()); //通行灯故障状态
            String[] railing_fault = PubUtil.getArrayReverse((strs[6].trim())); //栏杆机故障状态
            String[] hs_light_fault = PubUtil.getArrayReverse(strs[7].trim()); //黄闪灯故障状态
            dto.setHs_light_V1(strs[8].trim());    //黄闪电压1
            dto.setHs_light_V2(strs[9].trim());     //黄闪电压2
            dto.setTraffic_light_V1(strs[10].trim());  //通行电压1
            dto.setTraffic_light_V2(strs[11].trim());  //通行电压2
            dto.setCanopy_lamp_I1(strs[12].trim());    //雨棚电流1
            dto.setCanopy_lamp_V1(strs[13].trim());    //雨棚电压1
            dto.setCanopy_lamp_I2(strs[14].trim());    //雨棚电流2
            dto.setCanopy_lamp_V2(strs[15].trim());    //雨棚电压2
            dto.setTemp(strs[16].trim());              // 温度
            dto.setHumidity(strs[17].trim());          // 湿度

            // ip1
            dto.setIp1(strs[18].trim()+"."+strs[19].trim()+"."+strs[20].trim()+"."+strs[21].trim());
            dto.setIp2(strs[22].trim()+"."+strs[23].trim()+"."+strs[24].trim()+"."+strs[25].trim());
            dto.setIp3(strs[26].trim()+"."+strs[27].trim()+"."+strs[28].trim()+"."+strs[29].trim());
            dto.setIp4(strs[30].trim()+"."+strs[31].trim()+"."+strs[32].trim()+"."+strs[33].trim());
            dto.setIp5(strs[34].trim()+"."+strs[35].trim()+"."+strs[36].trim()+"."+strs[37].trim());
            dto.setIp6(strs[38].trim()+"."+strs[39].trim()+"."+strs[40].trim()+"."+strs[41].trim());
            dto.setIp7(strs[42].trim()+"."+strs[43].trim()+"."+strs[44].trim()+"."+strs[45].trim());
            dto.setIp8(strs[46].trim()+"."+strs[47].trim()+"."+strs[48].trim()+"."+strs[49].trim());

            //登陆工号
            dto.setLogin_no(strs[50].trim());
            //  do_K
            dto.setDo_idx0(strs[51].trim());       //雨棚绿K
            dto.setDo_idx1(strs[52].trim());       //雨棚红K
            dto.setDo_idx2(strs[53].trim());       //通行绿K
            dto.setDo_idx3(strs[54].trim());       //通行红K
            dto.setDo_idx4(strs[55].trim());       //栏杆抬K
            dto.setDo_idx5(strs[56].trim());       //栏杆落K
            dto.setDo_idx6(strs[57].trim());       //黄闪灯K
            dto.setDo_idx7(strs[58].trim());

            //  di_K
            dto.setDi_idx0(strs[59].trim());
            dto.setDi_idx1(strs[60].trim());
            dto.setDi_idx2(strs[61].trim());
            dto.setDi_idx3(strs[62].trim());
            dto.setDi_idx4(strs[63].trim());
            dto.setDi_idx5(strs[64].trim());
            dto.setDi_idx6(strs[65].trim());
            dto.setDi_idx7(strs[66].trim());

            //DO 工作标志
            String[] do_flags = PubUtil.getArrayReverse(strs[67].trim());
            dto.setDo0_flag(do_flags[0].trim());
            dto.setDo1_flag(do_flags[1].trim());
            dto.setDo2_flag(do_flags[2].trim());
            dto.setDo3_flag(do_flags[3].trim());
            dto.setDo4_flag(do_flags[4].trim());
            dto.setDo5_flag(do_flags[5].trim());
            dto.setDo6_flag(do_flags[6].trim());
            dto.setDo7_flag(do_flags[7].trim());

            //DI 工作标志
            String[] di_flags = PubUtil.getArrayReverse(strs[68].trim());
            dto.setDi0_flag(di_flags[0].trim());
            dto.setDi1_flag(di_flags[1].trim());
            dto.setDi2_flag(di_flags[2].trim());
            dto.setDi3_flag(di_flags[3].trim());
            dto.setDi4_flag(di_flags[4].trim());
            dto.setDi5_flag(di_flags[5].trim());
            dto.setDi6_flag(di_flags[6].trim());
            dto.setDi7_flag(di_flags[7].trim());

            //DO 高低位控制
            String[] do_ctls = PubUtil.getArrayReverse((strs[69].trim()));
            dto.setDo0_ctl(do_ctls[0].trim());
            dto.setDo1_ctl(do_ctls[1].trim());
            dto.setDo2_ctl(do_ctls[2].trim());
            dto.setDo3_ctl(do_ctls[3].trim());
            dto.setDo4_ctl(do_ctls[4].trim());
            dto.setDo5_ctl(do_ctls[5].trim());
            dto.setDo6_ctl(do_ctls[6].trim());
            dto.setDo7_ctl(do_ctls[7].trim());

            //DI 高低位控制
            String[] di_ctls = PubUtil.getArrayReverse(strs[70].trim());
            dto.setDi0_ctl(di_ctls[0].trim());
            dto.setDi1_ctl(di_ctls[1].trim());
            dto.setDi2_ctl(di_ctls[2].trim());
            dto.setDi3_ctl(di_ctls[3].trim());
            dto.setDi4_ctl(di_ctls[4].trim());
            dto.setDi5_ctl(di_ctls[5].trim());
            dto.setDi6_ctl(di_ctls[6].trim());
            dto.setDi7_ctl(di_ctls[7].trim());

            //PC DO输出
            dto.setPcdo_0(pc_dos[Integer.parseInt(dto.getDo_idx0())]);
            dto.setPcdo_1(pc_dos[Integer.parseInt(dto.getDo_idx1())]);
            dto.setPcdo_2(pc_dos[Integer.parseInt(dto.getDo_idx2())]);
            dto.setPcdo_3(pc_dos[Integer.parseInt(dto.getDo_idx3())]);
            dto.setPcdo_4(pc_dos[Integer.parseInt(dto.getDo_idx4())]);
            dto.setPcdo_5(pc_dos[Integer.parseInt(dto.getDo_idx5())]);
            dto.setPcdo_6(pc_dos[Integer.parseInt(dto.getDo_idx6())]);
            dto.setPcdo_7(pc_dos[Integer.parseInt(dto.getDo_idx7())]);

            //pc di
            dto.setPcdi_0(pc_dis[Integer.parseInt(dto.getDi_idx0())]);
            dto.setPcdi_1(pc_dis[Integer.parseInt(dto.getDi_idx1())]);
            dto.setPcdi_2(pc_dis[Integer.parseInt(dto.getDi_idx2())]);
            dto.setPcdi_3(pc_dis[Integer.parseInt(dto.getDi_idx3())]);
            dto.setPcdi_4(pc_dis[Integer.parseInt(dto.getDi_idx4())]);
            dto.setPcdi_5(pc_dis[Integer.parseInt(dto.getDi_idx5())]);
            dto.setPcdi_6(pc_dis[Integer.parseInt(dto.getDi_idx6())]);
            dto.setPcdi_7(pc_dis[Integer.parseInt(dto.getDi_idx7())]);

            //F103DI输入
            dto.setF103DI_0(F103_dis[0].trim());
            dto.setF103DI_1(F103_dis[1].trim());
            dto.setF103DI_2(F103_dis[2].trim());
            dto.setF103DI_3(F103_dis[3].trim());
            dto.setF103DI_4(F103_dis[4].trim());
            dto.setF103DI_5(F103_dis[5].trim());
            dto.setF103DI_6(F103_dis[6].trim());
            dto.setF103DI_7(F103_dis[7].trim());

            //F103DO
            dto.setF103DO_0(F103_dos[0].trim());
            dto.setF103DO_1(F103_dos[1].trim());
            dto.setF103DO_2(F103_dos[2].trim());
            dto.setF103DO_3(F103_dos[3].trim());
            dto.setF103DO_4(F103_dos[4].trim());
            dto.setF103DO_5(F103_dos[5].trim());
            dto.setF103DO_6(F103_dos[6].trim());
            dto.setF103DO_7(F103_dos[7].trim());

            //故障状态
            dto.setRailing_faultstatus(railing_fault);
            dto.setCanopy_lamp_faultstatus(canopy_lamp_fault);
            dto.setTraffic_light_faultstatus(traffic_light_fault);
            dto.setHs_light_faultstatus(hs_light_fault);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            master.destroy();
        }

        return dto;
    }

}
