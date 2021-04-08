/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dianna
 */
public class UndergradStudent extends Student {

    
    private String hobby;

    public UndergradStudent(String name, int age, String major, String hobby) {
        super(name, age, major);
        
        this.hobby = hobby;
    }

    public void setMajor(String major) {
      
        System.out.println("(Student) (Person) " + getName() + ", has changed major from " + this.major + " to " + major);
        this.major = major;
    }
    @Override
    public void setAge(int age){
        System.out.println("(UndergradStudent) " + getName() + ", has changed age from " + super.getAge() + " to " + age); 
        super.setAge(age);
    }
    
     @Override
    public String toString(){
       return "(UndergradStudent) (Student) (Person) " + getName() + ", " + super.getAge() + " years old, majored in " + major + ", likes " + hobby;
    }
}

