/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dianna
 */
public class Driver {

    ;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //I am trying to create new instance variables of the objects with their input values  
        
        Circle circle1 = new Circle(1);
        Triangle triangle1 = new Triangle(2, 3);
        Square square1 = new Square(2);

        // I am trying to access the displayInfo methods in each subclass that is passed from the new variables
        circle1.displayInfo();
        triangle1.displayInfo();
        square1.displayInfo();
       
    }

}
