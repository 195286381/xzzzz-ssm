package cn.xzzzz.test.spring01.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author zhuzhiwei
 * @since 2018/08/24
 * SqlSessionFactory工具,用来生成单例的SqlSessionFactory
 */
public class SqlSessionFactoryUtils {
    private static Logger logger = LoggerFactory.getLogger(SqlSessionFactoryUtils.class);
    private static final Class<SqlSessionFactoryUtils> LOCK = SqlSessionFactoryUtils.class;
    private static SqlSessionFactory sqlSessionFactory;
    private SqlSessionFactoryUtils() {}

    /**
     * 获取SqlSessionFactory单例
     * @return
     */
    public static SqlSessionFactory getSqlSessionFactory() {
        synchronized (LOCK) {
            if (sqlSessionFactory == null) {
                initSqlSessionFactory();
            }
        }
        return sqlSessionFactory;
    }

    /**
     * 获取SqlSession对象.
     */
    public static SqlSession getSqlSession() {
        SqlSession sqlSession;
        sqlSessionFactory = getSqlSessionFactory();
        sqlSession = sqlSessionFactory.openSession();
        return sqlSession;
    }

    /**
     * 初始化sqlSessionFactory
     */
    private static void initSqlSessionFactory() {
        final String RESOURCE = "mybatis-config.xml";
        InputStream inputStream;
        try {
            inputStream = Resources.getResourceAsStream(RESOURCE);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
