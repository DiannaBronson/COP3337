/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Employee;

/**
 *
 * @author Dianna
 */
public class Employee {
    private String name;
    private String gender;
    double salary;
    static int id = 1;

public Employee(){
    this.name = "Alice";
    this.gender = "Female";
    this.salary = 45000;
}
public Employee(String name, String gender, double salary ){
    this ();
    id++;
    this.name = name;
    this.gender = gender;
    this.salary = salary;

}
public void displayInfo(){
       System.out.printf("name = " + name + ",");
       System.out.printf("ID = " + id + ",");
       System.out.printf("gender = " + gender + ",");
       System.out.printf("salary = " + salary);
       System.out.println();
}
public void displayInfo2 (){
        System.out.println("next available ID is "+ ++id);
}
}

