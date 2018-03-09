package com.zly.ovo.service;

import com.zly.ovo.mapper.UserBeanMapper;
import com.zly.ovo.model.UserBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {
    @Autowired
    private UserBeanMapper userBeanMapper;
    public String getUserName(){
        UserBean userBean = userBeanMapper.selectByPrimaryKey(1);
        return userBean.getUserName();
    }
}
