package cn.xzzzz.test.spring01;

import cn.xzzzz.test.spring01.mapper.RoleMapper;
import cn.xzzzz.test.spring01.pojo.RoleDO;
import cn.xzzzz.test.spring01.utils.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @author 10191772
 * 程序入口类
 */
public class Main {
    // 获取 logger 工具.
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    /**
     * 主程序入口
     * @param args
     */
    public static void main(String[] args) {
//        mybatisTest();
        mybatisSpringTest();
    }

    private static void mybatisSpringTest() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 从 applicationContext 中得到 mapper
        RoleMapper roleMapper = ctx.getBean(RoleMapper.class);
        RoleDO role = new RoleDO();
        role.setNote("xxx");
        role.setRoleName("xiaozhu1990");
        roleMapper.insertRole(role);
    }

    private static void mybatisTest() {
        SqlSession sqlSession = SqlSessionFactoryUtils.getSqlSession();
        RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
        List<RoleDO> roles = roleMapper.findRoles();
        System.out.println(roles.toString());
        System.out.println(roles.get(0).getId());
        System.out.println(roles.get(0).getNote());
        System.out.println(roles.get(0).getRoleName());
        roleMapper.deleteRole(333L);
        RoleDO role = new RoleDO();
        role.setId(334);
        role.setNote("xiaozhu");
        role.setRoleName("xiaozhu_new");
        int ret = roleMapper.modifyRole(role);
        logger.warn(Integer.toString(ret));
        sqlSession.commit();
        sqlSession.close();
    }

    /**
     * 加载数据库测试.
     */
    private static void originalJDBCTest() {
        // 加载数据库驱动.
//        Class.forName("org.jdbc")
    }

    /**
     * Spring Bean 测试.
     */
    private static void springTest() {

    }

}
