package cn.xzzzz.test.spring01.mapper;

import cn.xzzzz.test.spring01.pojo.Role;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoleMapper {
    // TODO Auto-generated method stub

    /**
     * 获取所有的角色信息
     *
     * @return
     */
    public List<Role> findRoles();

    /**
     * 删除角色
     * @param id
     * @return
     */
    public int deleteRole(@Param("id") Long id);

    /**
     * 插入角色
     * @param role
     * @return
     */
    public int insertRole( Role role);

    /**
     * 修改角色信息
     * @param role
     * @return
     */
    public int modifyRole(Role role);
}