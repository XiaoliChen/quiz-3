package MainPackage;

import java.util.*;

public class TestTriangle  {
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter side1 of the Triangle");
        double side1 = input.nextDouble();
        System.out.println("Enter side2 of the Triangle");
        double side2 = input.nextDouble();
        System.out.println("Enter side3 of the Triangle");
        double side3 = input.nextDouble();

    {
        Triangle Triangle= new Triangle(side1, side2, side3);
        //How do i get the information into theTriangle?

        System.out.println("The Triangle Sides are \n side 1: " + side1 + "\n Side 2: " + side2 + "\n Side 3: " + side3);
        System.out.println("The Triangle's Perimeter is"+Triangle.getPerimeter());
        System.out.println("The Triangle's Area is " + Triangle.getArea());
        
        

    }
}
}