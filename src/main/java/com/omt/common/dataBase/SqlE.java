package com.omt.common.dataBase;

import com.omt.common.page.PageParameter;
import com.omt.common.page.Result;
import org.apache.ibatis.reflection.DefaultReflectorFactory;
import org.apache.ibatis.reflection.MetaObject;
import org.apache.ibatis.reflection.ReflectorFactory;
import org.apache.ibatis.reflection.factory.DefaultObjectFactory;
import org.apache.ibatis.reflection.factory.ObjectFactory;
import org.apache.ibatis.reflection.wrapper.DefaultObjectWrapperFactory;
import org.apache.ibatis.reflection.wrapper.ObjectWrapperFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * Created by wangbl on 16/7/12.
 */
//@Repository //SqlExecute
@Component
public class SqlE {
    private static final ObjectFactory DEFAULT_OBJECT_FACTORY = new DefaultObjectFactory();
    private static final ObjectWrapperFactory DEFAULT_OBJECT_WRAPPER_FACTORY = new DefaultObjectWrapperFactory();
    private static final ReflectorFactory DEFAULT_REFLECTOR_WRAPPER_FACTORY = new DefaultReflectorFactory();
    @Autowired
    protected JdbcTemplate jdbcTemplate;

    @Autowired
    protected SqlSessionTemplate sqlSessionTemplate;

    //M标识mybatis
    public List selectM(String statement){
        List list=sqlSessionTemplate.selectList(statement);
        return list;
    }
    public List selectM(String statement,Object parameter){
        List list=sqlSessionTemplate.selectList(statement,parameter);
        return list;
    }

    public Map selectM(String statement,String mapKey){
        Map map=sqlSessionTemplate.selectMap(statement,mapKey);
        return map;
    }
    //分页查询
    public Result selectPage(String statement, Object parameter){
        MetaObject metaStatementHandler = MetaObject.forObject(parameter, DEFAULT_OBJECT_FACTORY,
                DEFAULT_OBJECT_WRAPPER_FACTORY,DEFAULT_REFLECTOR_WRAPPER_FACTORY);
        PageParameter page = (PageParameter)metaStatementHandler.getValue("page");
        page.setFlag(true);
        List list=sqlSessionTemplate.selectList(statement,parameter);
        Result result = new Result();
        result.setData(list);
        //设置查询结果的总记录数
        if(page.getRecordsTotal()>0){
            result.setRecordsTotal(page.getRecordsTotal());
        }else {
            //第一次查询用rowBounds类的limit属性记录查询结果的总记录数
            result.setRecordsTotal(page.getRecordsTotal());
        }
        result.setRecordsFiltered(page.getRecordsTotal());
        return result;
    }
    public int insertM(String statement){
        return  sqlSessionTemplate.insert(statement);
    }
    public int insertM(String statement,Object parameter){
        return  sqlSessionTemplate.insert(statement, parameter);
    }
    public int updateM(String statement){
        return  sqlSessionTemplate.update(statement);
    }
    public int updateM(String statement,Object parameter){
        return  sqlSessionTemplate.update(statement, parameter);
    }
    public int deleteM(String statement){
        return  sqlSessionTemplate.delete(statement);
    }
    public int deleteM(String statement,Object parameter){
        return  sqlSessionTemplate.delete(statement, parameter);
    }

    public List selectS(String sql){
        List list=jdbcTemplate.queryForList(sql);
        return list;
    }
}
