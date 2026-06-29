package day10.activity;

public class Activity6_Tarala_Part_2 {

    public static void main(String[] args) {

        System.out.println("MULTIPLICATION TABLES");

        for (int table = 1; table <= 10; table++) {
            System.out.println("Multiplication Table of " + table);

            for (int i = 0; i <= 10; i++) {
                System.out.println(table + " x " + i + " = " + (table * i));
            }
        }
    }
}
