/*
一个User类，类中有用户名，用户的密码，用户的总个数
* */
package com.xinbran;

public class DomeUser {
    public static void main(String[] args) {
        User user1 = new User();
        System.out.println(user1.getInfo());
        User user2 = new User("Brandan");
        System.out.println(user2.getInfo());
        User user3 = new User("Xin","123wan");
        System.out.println(user3.getInfo());
        System.out.println(User.getCount());
    }

}
class User{
    private String uid;
    private String password;
    private static int count = 0;
    public User(){
        this("NoUser","123456");
    }
    public User(String uid){
        this(uid,"123456");
    }
    public User(String uid,String password){
        this.uid = uid;
        this.password = password;
        count ++;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUid() {
        return this.uid;
    }

    public String getPassword() {
        return this.password;
    }

    public static int getCount() {
        return count;
    }
    public String getInfo(){
        return "UserID:" + this.uid + "\nUserPasswd:" + this.password;
    }
}
