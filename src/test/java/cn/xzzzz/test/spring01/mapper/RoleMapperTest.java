package cn.xzzzz.test.spring01.mapper;

import cn.xzzzz.test.spring01.pojo.Role;
import cn.xzzzz.test.spring01.utils.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * RoleMapperTest
 *
 * @author 10191772
 * @since 2018/08/26
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class RoleMapperTest {

    @Autowired
    private RoleMapper roleMapper;

    @Test
    public void findRoles() {
        Role role = new Role();
        role.setRoleName("age");
        role.setNote("24");
        roleMapper.insertRole(role);
    }

    @Test
    public void deleteRole() {
        SqlSession sqlSession = SqlSessionFactoryUtils.getSqlSession();

    }

    @Test
    public void insertRole() {
    }

    @Test
    public void modifyRole() {
    }
}