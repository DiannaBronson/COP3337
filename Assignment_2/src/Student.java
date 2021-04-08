/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dianna
 */
public class Student extends Person {

    
    protected String major;

    public Student(String name, int age, String major) {
        super(name, age);
        this.major = major;

    }

    @Override
    public String getName() {
        //overrides getName from Person
        
        return super.getName()+ ", FIU student";
    }

    @Override
    public String toString() {
        //overrides toString from Person
        return "(Student) (Person) " + getName() + ", " + getAge() + " years old, majored in " + major;
    }

}
    