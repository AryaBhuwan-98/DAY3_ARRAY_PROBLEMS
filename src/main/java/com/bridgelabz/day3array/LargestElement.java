package com.bridgelabz.day3array;

public class LargestElement {
    public static void main(String[]args){
        int[] arr = new int[] {25,11,15,71,85};
        int max = arr[0];
        for (int i = 0; i<arr.length;i++){
            if (arr[i]>max)
            max = arr[i];
        }
        System.out.println("Largest Element present in given array:"+max);
    }
}
