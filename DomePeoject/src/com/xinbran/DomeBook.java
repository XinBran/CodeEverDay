/*
图书简单Java类，能录如书名，价钱，自动给图书编号，计算总共录入的图书数量
 */
package com.xinbran;

public class DomeBook {
    public static void main(String[] args) {
        Book b1 = new Book("Java  ",89.2);
        Book b2 = new Book("Oracle",39.2);
        Book b3 = new Book("Python",99.2);

        System.out.println(b1.getInfo());
        System.out.println(b2.getInfo());
        System.out.println(b3.getInfo());
        System.out.println(Book.getCount());

    }
}
class Book{
    private  int bid; //图书编号
    private String  title; //图书的名字；
    private double price;
    private static int count = 0;
    public Book(){
    }
    public Book(String title,double price){
        this.bid = count +1;
        this.title = title;
        this.price = price;
        count ++;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }
    public static int getCount(){
        return count;
    }
    public String getInfo(){
        return "Book id :" + this.bid + "\tBook Name:" + this.title + "\tBook Price:" + this.price;
    }
}
