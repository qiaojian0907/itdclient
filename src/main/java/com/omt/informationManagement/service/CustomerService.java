package com.omt.informationManagement.service;


import com.omt.common.dataBase.SqlE;
import com.omt.common.page.Result;
import com.omt.informationManagement.dto.CustomerServStatDto;
import com.omt.maintenanceManagement.dto.maiContractDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CustomerService {
    @Autowired
    SqlE sqlE;
    Result result = new Result();

    //service建一个list 方法
    //调取XML里的ID；
    public List customerStatitics(CustomerServStatDto Par) {
        List custo = sqlE.selectM("customerServiceData", Par);
        return custo;

    }

    public int customerServiceData(maiContractDto param) {
        return sqlE.insertM("customerServiceData", param);
    }

    public List MaintenanceChange(CustomerServStatDto Par) {
        List maint = sqlE.selectM("MaintenanceChange", Par);
        System.out.print("20180822++++++++++++++++++++");
        System.out.print(maint);
        return maint;

    }
}