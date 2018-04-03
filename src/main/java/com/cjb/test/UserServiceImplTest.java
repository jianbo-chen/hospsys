package com.cjb.test;

import com.cjb.dao.UserMapperCustom;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mvc.xml","classpath:spring-mybatis.xml"})
@Transactional
public class UserServiceImplTest {

    @Autowired
    private UserMapperCustom userMapperCustom;
    @Test
    public void login() {
        userMapperCustom.adminLogin("陈建波","cjb");
    }
}