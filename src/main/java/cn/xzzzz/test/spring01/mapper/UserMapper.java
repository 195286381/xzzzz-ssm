package cn.xzzzz.test.spring01.mapper;

import cn.xzzzz.test.spring01.pojo.UserDO;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author zhuzhiwei
 * @since 2018/08/26
 */
@Repository
public interface UserMapper {
    // TODO Auto-generated method stub

    /**
     * 根据用户ID查找用户
     * @param id
     * @return
     */
    public UserDO findUserById(int id);

    /**
     * 根据用户姓名查找用户
     * @param uname
     * @return
     */
    public List<UserDO> findUserByName(String uname);

    /**
     * 添加用户
     * @param userDO
     * @return
     */
    public int addUser(UserDO userDO);
}
