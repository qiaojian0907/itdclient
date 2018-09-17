package com.omt.common.aop;


import com.omt.common.opLog.OPLogDto;
import com.omt.common.opLog.OPLogService;
import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Map;

/**
 * Created by wangbl on 2017/2/15.
 */
//@Aspect
//@Component
public class OPLogAspect {
    @Autowired
    OPLogService opLogService;
    private Logger logger = Logger.getLogger(OPLogAspect.class);
    @Pointcut("@annotation(org.springframework.web.bind.annotation.RequestMapping)")
    public void OPLog(){}
    @Before("OPLog()")
    public void doBefore(JoinPoint joinPoint) throws Throwable {
        // 接收到请求，记录请求内容
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        //从session中取登陆工号信息
        HttpSession session = request.getSession();
        Map user = (Map) session.getAttribute("userMap");
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        method.getAnnotation(RequestMapping.class).value();
        // 记录下请求内容
        OPLogDto opLogDto = new OPLogDto();
        if(user==null){
            logger.info("session为空");
            opLogDto.setLogin_no("session为空");
        }else{
            //logger.info("LOGIN_NO : " + user.get("login_no").toString());
            //opLogDto.setLogin_no(user.get("login_no").toString());
        }
        //获取系统时间
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SS");
        logger.info("OP_DATE : "+sdf.format(new Date()));
        logger.info("URL : " + request.getRequestURL().toString());
        logger.info("HTTP_METHOD : " + request.getMethod());
        //logger.info("IP : " + request.getRemoteHost());
        logger.info("IP : " + request.getRemoteHost()+request.getRemoteUser()+request.getRemotePort());
        logger.info("CLASS_METHOD : " + joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName());
        logger.info("ARGS : " + Arrays.toString(joinPoint.getArgs()));
        //
        if(method.getAnnotation(RequestMapping.class).value().length==0){}else {
            logger.info("RequestMapping.value: " + method.getAnnotation(RequestMapping.class).value()[0]);
            opLogDto.setOpDetails(method.getAnnotation(RequestMapping.class).value()[0]);
        }
        opLogDto.setOpDate(sdf.format(new Date()));
        opLogDto.setIp(request.getRemoteAddr());
        opLogDto.setUrl(request.getRequestURL().toString());
        if(joinPoint.getArgs().length>0){
            opLogDto.setParam(reflect(joinPoint.getArgs()[0]));
            logger.info(reflect(joinPoint.getArgs()[0]));
        }
        logger.info("OPLOG_RESULT : "+opLogService.insert(opLogDto));
    }
    @AfterReturning(returning = "ret", pointcut = "OPLog()")
    public void doAfterReturning(Object ret) throws Throwable {
        // 处理完请求，返回内容
        logger.info("RESPONSE : " + ret);
    }
    //通过反射机制获取方法参数值
    public static String reflect(Object obj) {
        if (obj == null) return "";
        StringBuffer stringBuffer=new StringBuffer();
        Field[] fields = obj.getClass().getDeclaredFields();
        for (int j = 0; j < fields.length; j++) {
            fields[j].setAccessible(true);
            // 字段名
            stringBuffer.append("{"+fields[j].getName() + "=");
            // 字段值
            if (fields[j].getType().getName().equals(
                    String.class.getName())) {
                // String type
                try {
                    stringBuffer.append(fields[j].get(obj)+ "},");
                } catch (IllegalArgumentException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            } else if (fields[j].getType().getName().equals(
                    Integer.class.getName())
                    || fields[j].getType().getName().equals("int")) {
                // Integer type
                try {
                    stringBuffer.append(fields[j].get(obj)+ "},");
                } catch (IllegalArgumentException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
            // 其他类型。。。
        }
        return stringBuffer.toString();
    }
}
