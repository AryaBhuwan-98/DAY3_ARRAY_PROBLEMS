package com.bridgelabz.day3array;

public class EvenPosition {
    public static void main(String[]args){
        int [] arr = new int [] {1,2,3,4,5,6};
        System.out.println("Element of given array present in even position: ");


        for (int i = 1; i < arr.length; i = i + 2) {
            System.out.println(arr[i]);
        }
    }
}
