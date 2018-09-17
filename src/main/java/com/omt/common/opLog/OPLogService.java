package com.omt.common.opLog;

import com.omt.common.dataBase.SqlE;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by wangbl on 2017/2/15.
 */
@Repository
public class OPLogService {
    @Autowired
    SqlE sqlE;
    private static Logger logger = Logger.getLogger(OPLogService.class);
    //新增操作
    public int insert(OPLogDto parameter){
        return sqlE.insertM("insertOPLog",parameter);
    }
}
