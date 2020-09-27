package cn.zedongw.springmvcstudy.entity;

import java.util.Date;

/**
 * @ClassName: User
 * @Description: User实体类
 * @Author: ZeDongW
 * @Date: 2020/9/27 0027 22:17
 * @Version: v
 * @Modified By:
 * @Modified Time:
 **/
public class User {
    private String userName;
    private Date birthDay;

    public User() {
    }

    public User(String userName, Date birthDay) {
        this.userName = userName;
        this.birthDay = birthDay;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", birthDay=" + birthDay +
                '}';
    }
}
