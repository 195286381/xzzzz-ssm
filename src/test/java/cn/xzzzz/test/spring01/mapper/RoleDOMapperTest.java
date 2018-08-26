package cn.xzzzz.test.spring01.mapper;

import cn.xzzzz.test.spring01.pojo.RoleDO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * RoleDOMapperTest
 *
 * @author 10191772
 * @since 2018/08/26
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class RoleDOMapperTest {

    @Autowired
    private RoleMapper roleMapper;

    @Test
    public void findRoles() {
        RoleDO role = new RoleDO();
        role.setRoleName("age");
        role.setNote("24");
        roleMapper.insertRole(role);
    }

    @Test
    public void deleteRole() {
        roleMapper.deleteRole(359L);

    }

    @Test
    public void insertRole() {
    }

    @Test
    public void modifyRole() {
    }
}