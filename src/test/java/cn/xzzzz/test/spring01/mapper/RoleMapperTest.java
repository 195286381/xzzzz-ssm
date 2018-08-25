package cn.xzzzz.test.spring01.mapper;

import cn.xzzzz.test.spring01.pojo.Role;
import cn.xzzzz.test.spring01.utils.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class RoleMapperTest {

    @Autowired
//    private RoleMapper roleMapper;

    @Test
    public void findRoles() {
        SqlSession sqlSession = SqlSessionFactoryUtils.getSqlSession();
        RoleMapper mapper = sqlSession.getMapper(RoleMapper.class);
        Role role = new Role();
        role.setRoleName("age");
        role.setNote("24");
        mapper.insertRole(role);
        mapper.deleteRole(349L);
        sqlSession.commit();
        sqlSession.close();
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