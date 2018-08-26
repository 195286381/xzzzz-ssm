package cn.xzzzz.test.spring01.pojo;

/**
 * 用户类(数据对象)
 */
public class UserDO {
    private int id;
    private String uname;
    private int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "UserDO{" +
                "id=" + id +
                ", uname='" + uname + '\'' +
                ", age=" + age +
                '}';
    }
}
