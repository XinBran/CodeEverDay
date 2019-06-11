package com.xinbran;

public class JavaDomeDog {
    public static void main(String[] args) {
        Dog dog = new Dog("Laifu","Black",3);
        System.out.println(dog.getInfo());

    }
}
class Dog{
    private String name;
    private String color;
    private int age;
    public Dog(){}
    public Dog(String name,String color,int age){
        this.name = name;
        this.color = color;
        this.age = age;
    }
    public String getInfo(){
        return  "DogName:" + this.name + "\nDogColor:" + this.color + "\nDogAge:" + this.age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }
}
