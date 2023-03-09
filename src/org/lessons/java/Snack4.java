package org.lessons.java;

import java.util.Random;
import java.util.Scanner;

public class Snack4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Length of the first array: ");
        int arrLength1 = Integer.parseInt(scan.nextLine());
        System.out.print("Length of the second array: ");
        int arrLength2 = Integer.parseInt(scan.nextLine());

        String[] array1 = new String[arrLength1];
        String[] array2 = new String[arrLength2];
        String[] array3 = {"purple", "blue", "green", "yellow", "orange", "red", "pink", "white", "black", "brown"};



        if(array1.length > array2.length){
            int lengthDiff = array1.length - array2.length;
            System.out.println("Length difference: " + lengthDiff);
            for(int i = 0; i < lengthDiff; i++){
                int index = new Random().nextInt(array3.length);
                String newItem = array3[index];
                System.out.println(i+1 + ": " + newItem);
            }
        } else if (array1.length < array2.length) {
            int lengthDiff = array2.length - array1.length;
            System.out.println("Length difference: " + lengthDiff);
            for(int i = 0; i < lengthDiff; i++){
                int index = new Random().nextInt(array3.length);
                String newItem = array3[index];
                System.out.println(i+1 + ": " + newItem);
            }
        }else {
            System.out.println("The two arrays have the same length.");
        }
        scan.close();
    }
}
