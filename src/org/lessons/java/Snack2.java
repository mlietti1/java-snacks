package org.lessons.java;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Snack2 {
    public static void main(String[] args) {
        String[] names = {"Adam", "John", "Anna", "Elizabeth", "Sarah", "Jack", "Josh", "George"};
        String[] lastNames = {"Green", "White", "Gatsby", "Shelby", "Reynolds", "Smith", "Williams", "Reed"};

        Random random = new Random();

        Scanner scan = new Scanner(System.in);
        System.out.print("How many guests? ");
        int guestNum = Integer.parseInt(scan.nextLine());
        String[] guests = new String[guestNum];

        for(int i = 0; i < guests.length; i++){
            int randomNameIndex = random.nextInt(names.length);
            int randomLastNameIndex = random.nextInt(lastNames.length);
            String generatedGuest = names[randomNameIndex] + " " + lastNames[randomLastNameIndex];
            guests[i] = generatedGuest;
        }

        System.out.println(Arrays.toString(guests));
        scan.close();
    }
}
