package com.bridgelabz.day3array;

public class SmallestElement {
    public static void main(String[]args){
        int[] arr = new int[] {10,20,30,40,60};
        int min = arr[0];
        for (int i = 0; i < arr.length; i++){
            if(arr[i] < min)
            min = arr[i];
        }
        System.out.println("Smallest Element of given array"+min);
    }



}
