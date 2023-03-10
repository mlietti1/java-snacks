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


        if(arrLength1 == arrLength2){
            System.out.println("The two arrays have the same length.");
        }else {
            String[] longer = new String[Math.max(arrLength1, arrLength2)];
            String[] shorter = new String[Math.min(arrLength1, arrLength2)];
            String[] arrayCustom = {"purple", "blue", "green", "yellow", "orange", "red", "pink", "white", "black", "brown"};

            int lengthDiff = longer.length - shorter.length;

            for(int i = 0; i < lengthDiff; i++) {
                int index = new Random().nextInt(arrayCustom.length);
                String newItem = arrayCustom[index];
                System.out.println(i + 1 + ": " + newItem);

            }
        }

        scan.close();
    }
}
