package day17.activity;

public class Activity13_Tarala_Main {

    public static void main(String[] args) {

        // Create three Ballpen objects
        Ballpen pen1 = new Ballpen("Pilot", "Blue", "Gel", 14.0);
        Ballpen pen2 = new Ballpen("HBW", "Black", "Ballpoint", 13.5);
        Ballpen pen3 = new Ballpen("Dong-A", "Red", "Gel", 14.5);

        // Ballpen 1
        System.out.println("=== Ballpen 1 ===");
        pen1.displayInfo();
        pen1.openCap();
        pen1.write();
        pen1.closeCap();

        System.out.println();

        // Ballpen 2
        System.out.println("=== Ballpen 2 ===");
        pen2.displayInfo();
        pen2.openCap();
        pen2.write();
        pen2.closeCap();

        System.out.println();

        // Ballpen 3
        System.out.println("=== Ballpen 3 ===");
        pen3.displayInfo();
        pen3.openCap();
        pen3.write();
        pen3.closeCap();
    }
}
