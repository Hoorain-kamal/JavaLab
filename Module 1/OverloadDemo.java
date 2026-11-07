
/* To write a Java program to demonstrate
method overloading. */

class Overload {

    double length, breadth; // class variable

    void area(int l, int b) {
        // Area of rectangle
        System.out.println("Area of rectangle : " + l * b);
    }

    void area(double b, double h) {
        // Area of triangle
        System.out.println("Area of triangle : " + 0.5 * b * h);
    }

    void area(int l) {
        // Area of square
        System.out.println("Area of square : " + l * l);
    }

    void area(double l) {
        // Area of circle
        System.out.println("Area of circle : " + 3.14 * l * l);
    }
}

public class OverloadDemo {

    public static void main(String[] args) {

        Overload obj = new Overload();

        obj.area(10, 20);       // arguments
        obj.area(10.5, 20.5);
        obj.area(20);
        obj.area(10.5);
    }
}
