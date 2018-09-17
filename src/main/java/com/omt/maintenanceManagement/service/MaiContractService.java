package com.omt.maintenanceManagement.service;

import com.omt.common.dataBase.SqlE;
import com.omt.common.page.Result;
import com.omt.maintenanceManagement.dto.maiContractDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by zuoyue on 2018/6/21.
 */
@Repository
public class MaiContractService {
    @Autowired
    SqlE sqlE;
    Result result = new Result();

    //维保合同信息查询
    public Result maiContractQuery(maiContractDto param){
        result  = sqlE.selectPage("maiContractQuery",param);
        return result;
    }


    public int maiContractEntry(maiContractDto param){
        return sqlE.insertM("maiContractEntry",param);
    }
}
