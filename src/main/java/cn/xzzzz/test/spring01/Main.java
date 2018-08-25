package cn.xzzzz.test.spring01;

import cn.xzzzz.test.spring01.mapper.RoleMapper;
import cn.xzzzz.test.spring01.pojo.Role;
import cn.xzzzz.test.spring01.utils.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
        mybatisTest();
    }

    private static void mybatisTest() {
        SqlSession sqlSession = SqlSessionFactoryUtils.getSqlSession();
        RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
        List<Role> roles = roleMapper.findRoles();
        System.out.println(roles.toString());
        System.out.println(roles.get(0).getId());
        System.out.println(roles.get(0).getNote());
        System.out.println(roles.get(0).getRoleName());
        roleMapper.deleteRole(333L);
        Role role = new Role();
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
