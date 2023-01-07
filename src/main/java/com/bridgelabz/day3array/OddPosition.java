package com.bridgelabz.day3array;

public class OddPosition {
    public static void main(String[]args){
      int []arr = new int []{2,3,7,11,8,10};
     System.out.println("Element Present in Odd Position:");
     for (int i = 0;i < arr.length;i = i+2){
        System.out.println(arr[i]);
     }
    }   
}
