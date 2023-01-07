package com.bridgelabz.day3array;

public class DuplicateElement {
    public static void main(String[]args){
        int []arr = new int[] {2,3,3,4,5,5,1,5};
        System.out.println("Duplicate Element in an Array: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    System.out.println(arr[j]);
            }
        }
    }
}
