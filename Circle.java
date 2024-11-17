import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        double radius;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter radius: ");
        radius = sc.nextDouble();

        // Create an object of CircleRedInContructor2 class
        CircleRedInContructor2 obj = new CircleRedInContructor2();

        // Set the radius using the setter method
        obj.setRadius(radius);

        // Output the radius and the computed area
        System.out.println("The area of the circle with radius " + obj.getRadius() + " is: " + obj.computeArea());

        // Close the scanner object
        sc.close();
    }
}

// Separate class to define circle with radius and area calculation
class CircleRedInContructor2 {
    // Private field for radius
    private double radius;

    // Constructor (no arguments, radius is set using the setter)
    public CircleRedInContructor2() {}

    // Setter method for radius
    public void setRadius(double rad) {
        this.radius = rad;
    }

    // Getter method for radius
    public double getRadius() {
        return this.radius;
    }

    // Method to compute the area of the circle
    public double computeArea() {
        return Math.PI * radius * radius; // Corrected the calculation
    }
}
