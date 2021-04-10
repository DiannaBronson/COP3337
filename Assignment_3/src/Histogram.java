/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dianna
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Histogram {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        File file;
        file = new File("C:\\Users\\Dianna\\Downloads\\test1.txt");
        Scanner scan = new Scanner(file);

        while (scan.hasNextInt()) {
            int value = scan.nextInt();
            
            if (value <= 10){
            System.out.println("*");
            }

        }
        System.out.println(scan.nextInt());

    }
}
