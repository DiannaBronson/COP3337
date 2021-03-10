/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dianna
 */
import java.util.Scanner;
import Employee.Employee;

public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Employee e1 = new Employee();
       e1.displayInfo();
       Employee e2 = new Employee("Bob", "Male",48000 );
       e2.displayInfo();
       Employee e3 = new Employee("Chris", "Male", 41000);
       e3.displayInfo();
       Employee e4 = new Employee("David", "Male", 48000);
       e4.displayInfo();
       Employee e5 = new Employee("Emma", "Female", 42000);
       e5.displayInfo();
       Employee nextEmployee = new Employee();
       nextEmployee.displayInfo2();
    }
    
}
