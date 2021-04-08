/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dianna
 */
interface calculateAreaSquare {

    double Area();
}
//extends to inherit class Shape. implements to get interface
public class Square extends Shape implements calculateAreaSquare {

    double sidelength;

    public Square(double sidelength) {
        sidelength = 2;
    }

    Square() {

    }

    //the method from the interface
    @Override
    public double Area() {
        return sidelength * sidelength;
    }

    public void displayInfo() {
        System.out.println("The area of the Square is:" + Area());
    }
}
