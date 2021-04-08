/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dianna
 */
interface calculateAreaTriangle {

    double Area();
}
//extends to inherit class Shape. implements to get interface
public class Triangle extends Shape implements calculateAreaTriangle {

    double base;
    double height;

    public Triangle(double base, double height) {
       
        base = 2;
        height = 3;
    }

    //the method from the interface
    @Override
    public double Area() {
        return height * (1 / 2 * base);
    }

    public void displayInfo() {
        System.out.println("The area of the Triangle is:" + Area());
    }
}
