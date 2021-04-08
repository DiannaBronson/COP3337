/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dianna
 */
interface calculateAreaCircle {

    double Area();

}
//extends to inherit class Shape. implements to get interface
public class Circle extends Shape implements calculateAreaCircle {

    double radius;

    public Circle(double radius) {
        radius = 1.0;
    }
    //the method from the interface
     @Override
    public double Area() {
        return radius * Math.PI;
         
    }
    
    public void displayInfo() {
        System.out.println("The area of the Circle is:" + Area());
    }

}
