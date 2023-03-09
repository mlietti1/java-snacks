package org.lessons.java;

import java.util.Scanner;

public class Snack1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Type a number: ");
        int num = Integer.parseInt(scan.nextLine());
        if(num % 2 == 0){
            System.out.println(num + " è un numero pari.");
        }else{
            System.out.println(num + "è un numero dispari.");
        }
        scan.close();
    }
}
