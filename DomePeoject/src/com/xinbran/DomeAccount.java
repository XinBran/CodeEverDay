package com.xinbran;

public class DomeAccount {
    public static void main(String[] args) {
        Account account = new Account("王鑫");
        System.out.println(account.getInfo());
        System.out.println(account.getBalance());
    }
}
class Account{
    private String name;
    private double balance;
    public Account(){}
    public Account(String name){
        this(name,0.00);
    }
    public Account(String name, double balance){
        this.name = name;
        this.balance = balance;
    }
    public void setName(String name){
        this.name = name;
    }
        public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return this.name;
    }

    public double getBalance() {
        return this.balance;
    }
    public String getInfo(){
        return "账户的姓名：" + this.name +"\n账户余额：" + this.balance ;
    }
}
