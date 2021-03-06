package cn.xzzzz.test.spring01.pojo;

/**
 * 角色类(数据对象)
 *
 * @author zhuzhiwei
 * @since 10191772
 */
public class RoleDO {
    private String roleName;
    private String note;
    private int id;

    /** setter and getter **/
    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
