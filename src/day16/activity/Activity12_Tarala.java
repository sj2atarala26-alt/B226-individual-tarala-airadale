package day16.activity;

import java.util.Scanner;
import java.util.Random;

public class Activity12_Tarala {

    // Odd or Even
    public static void oddOrEven(int num) {
        if (num % 3 == 0) {
            System.out.println(num + " is EVEN.");
        } else {
            System.out.println(num + " is ODD.");
        }
    }

    // Print Name 50 Times
    public static void printName50Times() {
        for (int i = 1; i <= 50; i++) {
            System.out.println(i + ". Airadale Tarala");
        }
    }

    // Square Root
    public static void squareRoot(double num) {
        System.out.println("Square Root: " + Math.sqrt(num));
    }

    // Power
    public static void power(double base, double exponent) {
        System.out.println("Answer: " + Math.pow(base, exponent));
    }

    // Random Number
    public static void randomNumber() {
        Random rand = new Random();
        int random = rand.nextInt(100) + 1;
        System.out.println("Random Number: " + random);
    }

    // Area of Circle
    public static void areaCircle(double radius) {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }

    // Voter
    public static void voter(int age) {
        if (age >= 18) {
            System.out.println("You are a VOTER.");
        } else {
            System.out.println("You are NOT a voter.");
        }
    }

    // Length of Word
    public static void wordLength(String word) {
        System.out.println("Length: " + word.length());
    }

    // Reverse Word
    public static void reverseWord(String word) {
        System.out.print("Reverse: ");
        for (int i = word.length() - 1; i >= 0; i--) {
            System.out.print(word.charAt(i));
        }
        System.out.println();
    }

    // Print Full Name and Age
    public static void personalInfo() {
        System.out.println("Full Name: Airadale Tarala");
        System.out.println("Age: 20"); // Palitan kung kailangan
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n========== MENU ==========");
            System.out.println("1. Identify Odd or Even");
            System.out.println("2. Print Name 50 Times");
            System.out.println("3. Square Root");
            System.out.println("4. Power of a Number");
            System.out.println("5. Random Number (1-100)");
            System.out.println("6. Area of a Circle");
            System.out.println("7. Voter Checker");
            System.out.println("8. Length of a Word");
            System.out.println("9. Reverse a Word");
            System.out.println("10. Print Full Name and Age");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter a number: ");
                    int num = sc.nextInt();
                    oddOrEven(num);
                    break;

                case 2:
                    printName50Times();
                    break;

                case 3:
                    System.out.print("Enter a number: ");
                    double n = sc.nextDouble();
                    squareRoot(n);
                    break;

                case 4:
                    System.out.print("Enter base: ");
                    double base = sc.nextDouble();
                    System.out.print("Enter exponent: ");
                    double exponent = sc.nextDouble();
                    power(base, exponent);
                    break;

                case 5:
                    randomNumber();
                    break;

                case 6:
                    System.out.print("Enter radius: ");
                    double radius = sc.nextDouble();
                    areaCircle(radius);
                    break;

                case 7:
                    System.out.print("Enter age: ");
                    int age = sc.nextInt();
                    voter(age);
                    break;

                case 8:
                    sc.nextLine();
                    System.out.print("Enter a word: ");
                    String word = sc.nextLine();
                    wordLength(word);
                    break;

                case 9:
                    sc.nextLine();
                    System.out.print("Enter a word: ");
                    String reverse = sc.nextLine();
                    reverseWord(reverse);
                    break;

                case 10:
                    personalInfo();
                    break;

                case 0:
                    System.out.println("Program Ended.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 0);

        sc.close();
    }
}
