package com.omt.common.security;

import com.omt.common.dataBase.SqlE;
import com.omt.systemManagement.dto.LoginInfoDto;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by wangbl on 16/8/23.
 */
@Repository
public class UserService {
    @Autowired
    SqlE sqlE;
    private static Logger logger = Logger.getLogger(UserService.class);
    public UserDto getUserInfo(String username) {
        UserDto userDto = new UserDto();
        userDto.setUsername(username);
        try {
            LoginInfoDto param =new LoginInfoDto();
            param.setLogin_no(username);
            List list=sqlE.selectM("selectPassword",param);
            if(list.size()>0) {
                userDto.setPassword(list.get(0).toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        userDto.setRole("ROLE_USER");
        return userDto;
    }
}
