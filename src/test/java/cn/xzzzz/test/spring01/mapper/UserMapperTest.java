package cn.xzzzz.test.spring01.mapper;

import cn.xzzzz.test.spring01.pojo.RoleDO;
import cn.xzzzz.test.spring01.pojo.UserDO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class UserMapperTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void findUserById() {
        UserDO userDO = userMapper.findUserById(1);
        System.out.println(userDO);
        // TODO1: test demo;
        assertEquals(1, 1);
    }

    @Test
    public void findUserByName() {
        List<UserDO> userDOs = userMapper.findUserByName("xiaozhu");
        System.out.println(userDOs);
    }

    @Test
    public void addUser() {
        UserDO userDO = new UserDO();
        userDO.setAge(100);
        userDO.setUname("uname_test");
        userMapper.addUser(userDO);
    }
}