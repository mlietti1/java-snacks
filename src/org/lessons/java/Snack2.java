package org.lessons.java;

import java.util.Random;

public class Snack2 {
    public static void main(String[] args) {
        String[] names = {"Adam", "John", "Anna", "Elizabeth", "Sarah", "Jack", "Josh", "George"};
        String[] lastNames = {"Green", "White", "Gatsby", "Shelby", "Reynolds", "Smith", "Williams", "Reed"};

        Random random = new Random();
        for (String name : names) {
            int index = random.nextInt(lastNames.length);
            String lastName = lastNames[index];
            System.out.println(name + " " + lastName);
        }
    }
}
