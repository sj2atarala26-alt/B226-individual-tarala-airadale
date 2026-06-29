package day10.activity;

import java.util.Scanner;

public class Activity6_Tarala_Part_1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        System.out.println("Multiplication Table of " + number);
        for (int i = 0; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
        input.close();
    }
}
