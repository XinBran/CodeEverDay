package com.xinbran;
public class DomeArray {
    public static void main(String[] args) {
        //int data [] = new int [] {1,3,5,7,9};
        //for(int temp : data){
         //   System.out.print(temp + "\t");
        //}
        //二维数组演示
        int day [] [] = new int [] [] {{1,2,3,4,5},{4,5,6},{7,8,9,10}};
        for(int x = 0; x < day.length; x ++){
            for(int y =0; y < day[x].length;y++){
                System.out.println("day[" + x + "][" + y + "] \t" + day[x][y]);
            }
            System.out.println();
        }
    }
}
