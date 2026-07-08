package day17.activity;

class Ballpen {

    // Attributes
    String brand;
    String color;
    String inkType;
    double length;

    // Constructor
    public Ballpen(String brand, String color, String inkType, double length) {
        this.brand = brand;
        this.color = color;
        this.inkType = inkType;
        this.length = length;
    }

    // Methods
    public void write() {
        System.out.println(brand + " ballpen is writing.");
    }

    public void openCap() {
        System.out.println(brand + " ballpen cap is opened.");
    }

    public void closeCap() {
        System.out.println(brand + " ballpen cap is closed.");
    }

    // Display attributes
    public void displayInfo() {
        System.out.println("Brand    : " + brand);
        System.out.println("Color    : " + color);
        System.out.println("Ink Type : " + inkType);
        System.out.println("Length   : " + length + " cm");
    }
}
