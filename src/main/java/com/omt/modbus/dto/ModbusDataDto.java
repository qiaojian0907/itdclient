package com.omt.modbus.dto;

/**
 * Created by QiaoJian on 2018/8/20.
 */
public class ModbusDataDto {
    String work_mode = "";              //工作模式
    String pcdo_0 = "";                 //PC(严华)DO
    String pcdo_1 = "";
    String pcdo_2 = "";
    String pcdo_3 = "";
    String pcdo_4 = "";
    String pcdo_5 = "";
    String pcdo_6 = "";
    String pcdo_7 = "";

    String pcdi_0 = "";
    String pcdi_1 = "";
    String pcdi_2 = "";
    String pcdi_3 = "";
    String pcdi_4 = "";
    String pcdi_5 = "";
    String pcdi_6 = "";
    String pcdi_7 = "";
    String F103DO_0 = "";               //0路DO
    String F103DO_1 = "";
    String F103DO_2 = "";
    String F103DO_3 = "";
    String F103DO_4 = "";
    String F103DO_5 = "";
    String F103DO_6 = "";
    String F103DO_7 = "";               //7路DO
    String F103DI_0 = "";               //0路DI
    String F103DI_1 = "";
    String F103DI_2 = "";
    String F103DI_3 = "";
    String F103DI_4 = "";
    String F103DI_5 = "";
    String F103DI_6 = "";
    String F103DI_7 = "";               //7路DI
    String canopy_lamp_status = "";     //雨棚灯状态
    String[] canopy_lamp_faultstatus;     //雨棚灯故障状态
    String traffic_light_status = "";   //通行灯状态
    String[] traffic_light_faultstatus;   //通行灯故障状态
    String railing_status = "";         // 栏杆机状态
    String[] railing_faultstatus;         // 栏杆机状故障态
    String hs_light_status = "";        //黄闪灯状态
    String[] hs_light_faultstatus;        //黄闪灯故障状态
    String hs_light_V1 = "";            //黄闪灯电压1
    String hs_light_V2 = "";            //黄闪灯电压2
    String traffic_light_V1 = "";       //通行灯电压1
    String traffic_light_V2 = "";       //通行灯电压2
    String canopy_lamp_V1 = "";         //雨棚灯电压1
    String canopy_lamp_V2 = "";         //雨棚灯电压2
    String canopy_lamp_I1 = "";         //雨棚灯电流1
    String canopy_lamp_I2 = "";         //雨棚灯电流2
    String temp = "";                   //温度
    String humidity = "";               //湿度
    String ip1 = "";                    //ip1
    String ip2 = "";                    //ip2
    String ip3 = "";                    //ip3
    String ip4 = "";                    //ip4
    String ip5 = "";                    //ip5
    String ip6 = "";                    //ip6
    String ip7 = "";                    //ip7
    String ip8 = "";                    //ip8
    String login_no = "";               //工号
    String co2 = "";                    //二氧化碳
    String pm25 = "";                   //pm2.5
    String pm10 = "";                   //pm10
    String noise = "";                  //噪音
    String do_idx0 = "";                //雨棚绿k
    String do_idx1 = "";                //雨棚红K
    String do_idx2 = "";                //通行绿K
    String do_idx3 = "";                //通行红K
    String do_idx4 = "";                //栏杆抬K
    String do_idx5 = "";                //栏杆落K
    String do_idx6 = "";
    String do_idx7 = "";
    String di_idx0 = "";
    String di_idx1 = "";
    String di_idx2 = "";
    String di_idx3 = "";
    String di_idx4 = "";
    String di_idx5 = "";
    String di_idx6 = "";
    String di_idx7 = "";
    String do0_flag = "";               //DO工作标志   1开启 0 关闭
    String do1_flag = "";
    String do2_flag = "";
    String do3_flag = "";
    String do4_flag = "";
    String do5_flag = "";
    String do6_flag = "";
    String do7_flag = "";
    String di0_flag = "";               //DI工作表示   1开启  0 关闭
    String di1_flag = "";
    String di2_flag = "";
    String di3_flag = "";
    String di4_flag = "";
    String di5_flag = "";
    String di6_flag = "";
    String di7_flag = "";
    String do0_ctl = "";                //DO高低位控制  1 高  0 低
    String do1_ctl = "";
    String do2_ctl = "";
    String do3_ctl = "";
    String do4_ctl = "";
    String do5_ctl = "";
    String do6_ctl = "";
    String do7_ctl = "";
    String di0_ctl = "";                //DI高低位控制  1 高  0 低
    String di1_ctl = "";
    String di2_ctl = "";
    String di3_ctl = "";
    String di4_ctl = "";
    String di5_ctl = "";
    String di6_ctl = "";
    String di7_ctl = "";

    public String getLogin_no() {
        return login_no;
    }

    public void setLogin_no(String login_no) {
        this.login_no = login_no;
    }

    public String getWork_mode() {
        return work_mode;
    }

    public void setWork_mode(String work_mode) {
        this.work_mode = work_mode;
    }

    public String getPcdo_0() {
        return pcdo_0;
    }

    public void setPcdo_0(String pcdo_0) {
        this.pcdo_0 = pcdo_0;
    }

    public String getPcdo_1() {
        return pcdo_1;
    }

    public void setPcdo_1(String pcdo_1) {
        this.pcdo_1 = pcdo_1;
    }

    public String getPcdo_2() {
        return pcdo_2;
    }

    public void setPcdo_2(String pcdo_2) {
        this.pcdo_2 = pcdo_2;
    }

    public String getPcdo_3() {
        return pcdo_3;
    }

    public void setPcdo_3(String pcdo_3) {
        this.pcdo_3 = pcdo_3;
    }

    public String getPcdo_4() {
        return pcdo_4;
    }

    public void setPcdo_4(String pcdo_4) {
        this.pcdo_4 = pcdo_4;
    }

    public String getPcdo_5() {
        return pcdo_5;
    }

    public void setPcdo_5(String pcdo_5) {
        this.pcdo_5 = pcdo_5;
    }

    public String getPcdo_6() {
        return pcdo_6;
    }

    public void setPcdo_6(String pcdo_6) {
        this.pcdo_6 = pcdo_6;
    }

    public String getPcdo_7() {
        return pcdo_7;
    }

    public void setPcdo_7(String pcdo_7) {
        this.pcdo_7 = pcdo_7;
    }

    public String getF103DO_0() {
        return F103DO_0;
    }

    public void setF103DO_0(String f103DO_0) {
        F103DO_0 = f103DO_0;
    }

    public String getF103DO_1() {
        return F103DO_1;
    }

    public void setF103DO_1(String f103DO_1) {
        F103DO_1 = f103DO_1;
    }

    public String getF103DO_2() {
        return F103DO_2;
    }

    public void setF103DO_2(String f103DO_2) {
        F103DO_2 = f103DO_2;
    }

    public String getF103DO_3() {
        return F103DO_3;
    }

    public void setF103DO_3(String f103DO_3) {
        F103DO_3 = f103DO_3;
    }

    public String getF103DO_4() {
        return F103DO_4;
    }

    public void setF103DO_4(String f103DO_4) {
        F103DO_4 = f103DO_4;
    }

    public String getF103DO_5() {
        return F103DO_5;
    }

    public void setF103DO_5(String f103DO_5) {
        F103DO_5 = f103DO_5;
    }

    public String getF103DO_6() {
        return F103DO_6;
    }

    public void setF103DO_6(String f103DO_6) {
        F103DO_6 = f103DO_6;
    }

    public String getF103DO_7() {
        return F103DO_7;
    }

    public void setF103DO_7(String f103DO_7) {
        F103DO_7 = f103DO_7;
    }

    public String getF103DI_0() {
        return F103DI_0;
    }

    public void setF103DI_0(String f103DI_0) {
        F103DI_0 = f103DI_0;
    }

    public String getF103DI_1() {
        return F103DI_1;
    }

    public void setF103DI_1(String f103DI_1) {
        F103DI_1 = f103DI_1;
    }

    public String getF103DI_2() {
        return F103DI_2;
    }

    public void setF103DI_2(String f103DI_2) {
        F103DI_2 = f103DI_2;
    }

    public String getF103DI_3() {
        return F103DI_3;
    }

    public void setF103DI_3(String f103DI_3) {
        F103DI_3 = f103DI_3;
    }

    public String getF103DI_4() {
        return F103DI_4;
    }

    public void setF103DI_4(String f103DI_4) {
        F103DI_4 = f103DI_4;
    }

    public String getF103DI_5() {
        return F103DI_5;
    }

    public void setF103DI_5(String f103DI_5) {
        F103DI_5 = f103DI_5;
    }

    public String getF103DI_6() {
        return F103DI_6;
    }

    public void setF103DI_6(String f103DI_6) {
        F103DI_6 = f103DI_6;
    }

    public String getF103DI_7() {
        return F103DI_7;
    }

    public void setF103DI_7(String f103DI_7) {
        F103DI_7 = f103DI_7;
    }

    public String getCanopy_lamp_status() {
        return canopy_lamp_status;
    }

    public void setCanopy_lamp_status(String canopy_lamp_status) {
        this.canopy_lamp_status = canopy_lamp_status;
    }

    public String getTraffic_light_status() {
        return traffic_light_status;
    }

    public void setTraffic_light_status(String traffic_light_status) {
        this.traffic_light_status = traffic_light_status;
    }

    public String getRailing_status() {
        return railing_status;
    }

    public void setRailing_status(String railing_status) {
        this.railing_status = railing_status;
    }

    public String getHs_light_status() {
        return hs_light_status;
    }

    public void setHs_light_status(String hs_light_status) {
        this.hs_light_status = hs_light_status;
    }

    public String getHs_light_V1() {
        return hs_light_V1;
    }

    public void setHs_light_V1(String hs_light_V1) {
        this.hs_light_V1 = hs_light_V1;
    }

    public String getHs_light_V2() {
        return hs_light_V2;
    }

    public void setHs_light_V2(String hs_light_V2) {
        this.hs_light_V2 = hs_light_V2;
    }

    public String getTraffic_light_V1() {
        return traffic_light_V1;
    }

    public void setTraffic_light_V1(String traffic_light_V1) {
        this.traffic_light_V1 = traffic_light_V1;
    }

    public String getTraffic_light_V2() {
        return traffic_light_V2;
    }

    public void setTraffic_light_V2(String traffic_light_V2) {
        this.traffic_light_V2 = traffic_light_V2;
    }

    public String getCanopy_lamp_V1() {
        return canopy_lamp_V1;
    }

    public void setCanopy_lamp_V1(String canopy_lamp_V1) {
        this.canopy_lamp_V1 = canopy_lamp_V1;
    }

    public String getCanopy_lamp_V2() {
        return canopy_lamp_V2;
    }

    public void setCanopy_lamp_V2(String canopy_lamp_V2) {
        this.canopy_lamp_V2 = canopy_lamp_V2;
    }

    public String getCanopy_lamp_I1() {
        return canopy_lamp_I1;
    }

    public void setCanopy_lamp_I1(String canopy_lamp_I1) {
        this.canopy_lamp_I1 = canopy_lamp_I1;
    }

    public String getCanopy_lamp_I2() {
        return canopy_lamp_I2;
    }

    public void setCanopy_lamp_I2(String canopy_lamp_I2) {
        this.canopy_lamp_I2 = canopy_lamp_I2;
    }

    public String getIp1() {
        return ip1;
    }

    public void setIp1(String ip1) {
        this.ip1 = ip1;
    }

    public String getIp2() {
        return ip2;
    }

    public void setIp2(String ip2) {
        this.ip2 = ip2;
    }

    public String getIp3() {
        return ip3;
    }

    public void setIp3(String ip3) {
        this.ip3 = ip3;
    }

    public String getIp4() {
        return ip4;
    }

    public void setIp4(String ip4) {
        this.ip4 = ip4;
    }

    public String getIp5() {
        return ip5;
    }

    public void setIp5(String ip5) {
        this.ip5 = ip5;
    }

    public String getIp6() {
        return ip6;
    }

    public void setIp6(String ip6) {
        this.ip6 = ip6;
    }

    public String getIp7() {
        return ip7;
    }

    public void setIp7(String ip7) {
        this.ip7 = ip7;
    }

    public String getIp8() {
        return ip8;
    }

    public void setIp8(String ip8) {
        this.ip8 = ip8;
    }

    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }

    public String getHumidity() {
        return humidity;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    public String getCo2() {
        return co2;
    }

    public void setCo2(String co2) {
        this.co2 = co2;
    }

    public String getPm25() {
        return pm25;
    }

    public void setPm25(String pm25) {
        this.pm25 = pm25;
    }

    public String getPm10() {
        return pm10;
    }

    public void setPm10(String pm10) {
        this.pm10 = pm10;
    }

    public String getNoise() {
        return noise;
    }

    public void setNoise(String noise) {
        this.noise = noise;
    }

    public String getDo_idx0() {
        return do_idx0;
    }

    public void setDo_idx0(String do_idx0) {
        this.do_idx0 = do_idx0;
    }

    public String getDo_idx1() {
        return do_idx1;
    }

    public void setDo_idx1(String do_idx1) {
        this.do_idx1 = do_idx1;
    }

    public String getDo_idx2() {
        return do_idx2;
    }

    public void setDo_idx2(String do_idx2) {
        this.do_idx2 = do_idx2;
    }

    public String getDo_idx3() {
        return do_idx3;
    }

    public void setDo_idx3(String do_idx3) {
        this.do_idx3 = do_idx3;
    }

    public String getDo_idx4() {
        return do_idx4;
    }

    public void setDo_idx4(String do_idx4) {
        this.do_idx4 = do_idx4;
    }

    public String getDo_idx5() {
        return do_idx5;
    }

    public void setDo_idx5(String do_idx5) {
        this.do_idx5 = do_idx5;
    }

    public String getDo_idx6() {
        return do_idx6;
    }

    public void setDo_idx6(String do_idx6) {
        this.do_idx6 = do_idx6;
    }

    public String getDo_idx7() {
        return do_idx7;
    }

    public void setDo_idx7(String do_idx7) {
        this.do_idx7 = do_idx7;
    }

    public String getDi_idx0() {
        return di_idx0;
    }

    public void setDi_idx0(String di_idx0) {
        this.di_idx0 = di_idx0;
    }

    public String getDi_idx1() {
        return di_idx1;
    }

    public void setDi_idx1(String di_idx1) {
        this.di_idx1 = di_idx1;
    }

    public String getDi_idx2() {
        return di_idx2;
    }

    public void setDi_idx2(String di_idx2) {
        this.di_idx2 = di_idx2;
    }

    public String getDi_idx3() {
        return di_idx3;
    }

    public void setDi_idx3(String di_idx3) {
        this.di_idx3 = di_idx3;
    }

    public String getDi_idx4() {
        return di_idx4;
    }

    public void setDi_idx4(String di_idx4) {
        this.di_idx4 = di_idx4;
    }

    public String getDi_idx5() {
        return di_idx5;
    }

    public void setDi_idx5(String di_idx5) {
        this.di_idx5 = di_idx5;
    }

    public String getDi_idx6() {
        return di_idx6;
    }

    public void setDi_idx6(String di_idx6) {
        this.di_idx6 = di_idx6;
    }

    public String getDi_idx7() {
        return di_idx7;
    }

    public void setDi_idx7(String di_idx7) {
        this.di_idx7 = di_idx7;
    }

    public String getDo0_flag() {
        return do0_flag;
    }

    public void setDo0_flag(String do0_flag) {
        this.do0_flag = do0_flag;
    }

    public String getDo1_flag() {
        return do1_flag;
    }

    public void setDo1_flag(String do1_flag) {
        this.do1_flag = do1_flag;
    }

    public String getDo2_flag() {
        return do2_flag;
    }

    public void setDo2_flag(String do2_flag) {
        this.do2_flag = do2_flag;
    }

    public String getDo3_flag() {
        return do3_flag;
    }

    public void setDo3_flag(String do3_flag) {
        this.do3_flag = do3_flag;
    }

    public String getDo4_flag() {
        return do4_flag;
    }

    public void setDo4_flag(String do4_flag) {
        this.do4_flag = do4_flag;
    }

    public String getDo5_flag() {
        return do5_flag;
    }

    public void setDo5_flag(String do5_flag) {
        this.do5_flag = do5_flag;
    }

    public String getDo6_flag() {
        return do6_flag;
    }

    public void setDo6_flag(String do6_flag) {
        this.do6_flag = do6_flag;
    }

    public String getDo7_flag() {
        return do7_flag;
    }

    public void setDo7_flag(String do7_flag) {
        this.do7_flag = do7_flag;
    }

    public String getDi0_flag() {
        return di0_flag;
    }

    public void setDi0_flag(String di0_flag) {
        this.di0_flag = di0_flag;
    }

    public String getDi1_flag() {
        return di1_flag;
    }

    public void setDi1_flag(String di1_flag) {
        this.di1_flag = di1_flag;
    }

    public String getDi2_flag() {
        return di2_flag;
    }

    public void setDi2_flag(String di2_flag) {
        this.di2_flag = di2_flag;
    }

    public String getDi3_flag() {
        return di3_flag;
    }

    public void setDi3_flag(String di3_flag) {
        this.di3_flag = di3_flag;
    }

    public String getDi4_flag() {
        return di4_flag;
    }

    public void setDi4_flag(String di4_flag) {
        this.di4_flag = di4_flag;
    }

    public String getDi5_flag() {
        return di5_flag;
    }

    public void setDi5_flag(String di5_flag) {
        this.di5_flag = di5_flag;
    }

    public String getDi6_flag() {
        return di6_flag;
    }

    public void setDi6_flag(String di6_flag) {
        this.di6_flag = di6_flag;
    }

    public String getDi7_flag() {
        return di7_flag;
    }

    public void setDi7_flag(String di7_flag) {
        this.di7_flag = di7_flag;
    }

    public String getDo0_ctl() {
        return do0_ctl;
    }

    public void setDo0_ctl(String do0_ctl) {
        this.do0_ctl = do0_ctl;
    }

    public String getDo1_ctl() {
        return do1_ctl;
    }

    public void setDo1_ctl(String do1_ctl) {
        this.do1_ctl = do1_ctl;
    }

    public String getDo2_ctl() {
        return do2_ctl;
    }

    public void setDo2_ctl(String do2_ctl) {
        this.do2_ctl = do2_ctl;
    }

    public String getDo3_ctl() {
        return do3_ctl;
    }

    public void setDo3_ctl(String do3_ctl) {
        this.do3_ctl = do3_ctl;
    }

    public String getDo4_ctl() {
        return do4_ctl;
    }

    public void setDo4_ctl(String do4_ctl) {
        this.do4_ctl = do4_ctl;
    }

    public String getDo5_ctl() {
        return do5_ctl;
    }

    public void setDo5_ctl(String do5_ctl) {
        this.do5_ctl = do5_ctl;
    }

    public String getDo6_ctl() {
        return do6_ctl;
    }

    public void setDo6_ctl(String do6_ctl) {
        this.do6_ctl = do6_ctl;
    }

    public String getDo7_ctl() {
        return do7_ctl;
    }

    public void setDo7_ctl(String do7_ctl) {
        this.do7_ctl = do7_ctl;
    }

    public String getDi0_ctl() {
        return di0_ctl;
    }

    public void setDi0_ctl(String di0_ctl) {
        this.di0_ctl = di0_ctl;
    }

    public String getDi1_ctl() {
        return di1_ctl;
    }

    public void setDi1_ctl(String di1_ctl) {
        this.di1_ctl = di1_ctl;
    }

    public String getDi2_ctl() {
        return di2_ctl;
    }

    public void setDi2_ctl(String di2_ctl) {
        this.di2_ctl = di2_ctl;
    }

    public String getDi3_ctl() {
        return di3_ctl;
    }

    public void setDi3_ctl(String di3_ctl) {
        this.di3_ctl = di3_ctl;
    }

    public String getDi4_ctl() {
        return di4_ctl;
    }

    public void setDi4_ctl(String di4_ctl) {
        this.di4_ctl = di4_ctl;
    }

    public String getDi5_ctl() {
        return di5_ctl;
    }

    public void setDi5_ctl(String di5_ctl) {
        this.di5_ctl = di5_ctl;
    }

    public String getDi6_ctl() {
        return di6_ctl;
    }

    public void setDi6_ctl(String di6_ctl) {
        this.di6_ctl = di6_ctl;
    }

    public String getDi7_ctl() {
        return di7_ctl;
    }

    public void setDi7_ctl(String di7_ctl) {
        this.di7_ctl = di7_ctl;
    }

    public String[] getCanopy_lamp_faultstatus() {
        return canopy_lamp_faultstatus;
    }

    public void setCanopy_lamp_faultstatus(String[] canopy_lamp_faultstatus) {
        this.canopy_lamp_faultstatus = canopy_lamp_faultstatus;
    }

    public String[] getTraffic_light_faultstatus() {
        return traffic_light_faultstatus;
    }

    public void setTraffic_light_faultstatus(String[] traffic_light_faultstatus) {
        this.traffic_light_faultstatus = traffic_light_faultstatus;
    }

    public String[] getRailing_faultstatus() {
        return railing_faultstatus;
    }

    public void setRailing_faultstatus(String[] railing_faultstatus) {
        this.railing_faultstatus = railing_faultstatus;
    }

    public String[] getHs_light_faultstatus() {
        return hs_light_faultstatus;
    }

    public void setHs_light_faultstatus(String[] hs_light_faultstatus) {
        this.hs_light_faultstatus = hs_light_faultstatus;
    }

    public String getPcdi_0() {
        return pcdi_0;
    }

    public void setPcdi_0(String pcdi_0) {
        this.pcdi_0 = pcdi_0;
    }

    public String getPcdi_1() {
        return pcdi_1;
    }

    public void setPcdi_1(String pcdi_1) {
        this.pcdi_1 = pcdi_1;
    }

    public String getPcdi_2() {
        return pcdi_2;
    }

    public void setPcdi_2(String pcdi_2) {
        this.pcdi_2 = pcdi_2;
    }

    public String getPcdi_3() {
        return pcdi_3;
    }

    public void setPcdi_3(String pcdi_3) {
        this.pcdi_3 = pcdi_3;
    }

    public String getPcdi_4() {
        return pcdi_4;
    }

    public void setPcdi_4(String pcdi_4) {
        this.pcdi_4 = pcdi_4;
    }

    public String getPcdi_5() {
        return pcdi_5;
    }

    public void setPcdi_5(String pcdi_5) {
        this.pcdi_5 = pcdi_5;
    }

    public String getPcdi_6() {
        return pcdi_6;
    }

    public void setPcdi_6(String pcdi_6) {
        this.pcdi_6 = pcdi_6;
    }

    public String getPcdi_7() {
        return pcdi_7;
    }

    public void setPcdi_7(String pcdi_7) {
        this.pcdi_7 = pcdi_7;
    }
}
