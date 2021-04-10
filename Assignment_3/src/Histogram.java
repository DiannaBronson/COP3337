
/*
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

        //variables for the histogram
        int lessThanTen = 0;
        int lessThanTwenty = 0;
        int lessThanThirty = 0;
        int lessThanForty = 0;
        int lessThanFifty = 0;
        int lessThanSixty = 0;
        int lessThanSeventy = 0;
        int lessThanEighty = 0;
        int lessThanNinety = 0; 
        int lessThanHundred = 0;
        int others = 0;
        int numberOfInts = 0;

        //accessing and scanning through the first text file
        File file = new File("C:\\Users\\Dianna\\Downloads\\test1.txt"); //change this to "test2.txt" and "test3.txt" for the other outputs
        Scanner scan = new Scanner(file);

        //loop that counts the values and appropriately increments the variables
        while (scan.hasNextInt()) {
            int value = scan.nextInt();

            if (value >= 1 && value <= 10) {
                lessThanTen++;
            }
            if (value >= 11 && value <= 20) {
                lessThanTwenty++;
            }
            if (value >= 21 && value <= 30) {
                lessThanThirty++;
            }
            if (value >= 31 && value <= 40) {
                lessThanForty++;
            }
            if (value >= 41 && value <= 50) {
                lessThanFifty++;
            }
            if (value >= 51 && value <= 60) {
                lessThanSixty++;
            }
            if (value >= 61 && value <= 70) {
                lessThanSeventy++;
            }
            if (value >= 71 && value <= 80) {
                lessThanEighty++;
            }
            if (value >= 81 && value <= 90) {
                lessThanNinety++;
            }
            if (value >= 91 && value <= 100) {
                lessThanHundred++;
            }
            if (value !=1 && value >= 101) {
                others++;
            } 
            if (value >=1 && value <= 100){
                numberOfInts++;
            }
            else {

            }
            
        }
        
        
        //print statements
        System.out.println("Reading Integers From File: C:\\Users\\Dianna\\Downloads\\test1.txt ");
        System.out.println("Number of Integers in the interval [1 - 100]: " + numberOfInts);
        System.out.println("Others: " + others);
        System.out.println("Histogram");
        System.out.println("1 - 10 | " + lessThanTen);
        System.out.println("11 - 20 | " + lessThanTwenty);
        System.out.println("21 - 30 | " + lessThanThirty);
        System.out.println("31 - 40 | " + lessThanForty);
        System.out.println("41 - 50 | " + lessThanFifty);
        System.out.println("51 - 60 | " + lessThanSixty);
        System.out.println("61 - 70 | " + lessThanSeventy);
        System.out.println("71 - 80 | " + lessThanEighty);
        System.out.println("81 - 90 | " + lessThanNinety);
        System.out.println("91 - 100 | " + lessThanHundred);
    }
}
//output for txt1
/*run:
Reading Integers From File: C:\Users\Dianna\Downloads\test1.txt 
Number of Integers in the interval [1 - 100]: 80
Others: 54
Histogram
1 - 10 | 6
11 - 20 | 8
21 - 30 | 7
31 - 40 | 7
41 - 50 | 7
51 - 60 | 11
61 - 70 | 6
71 - 80 | 10
81 - 90 | 9
91 - 100 | 9
BUILD SUCCESSFUL (total time: 0 seconds)
*/

//output for txt2
/*run:
Reading Integers From File: C:\Users\Dianna\Downloads\test2.txt 
Number of Integers in the interval [1 - 100]: 52
Others: 48
Histogram
1 - 10 | 5
11 - 20 | 6
21 - 30 | 4
31 - 40 | 7
41 - 50 | 5
51 - 60 | 4
61 - 70 | 7
71 - 80 | 7
81 - 90 | 2
91 - 100 | 5
BUILD SUCCESSFUL (total time: 0 seconds)
*/

//output for txt3
/*
run:
Reading Integers From File: C:\Users\Dianna\Downloads\test3.txt 
Number of Integers in the interval [1 - 100]: 1
Others: 2
Histogram
1 - 10 | 0
11 - 20 | 1
21 - 30 | 0
31 - 40 | 0
41 - 50 | 0
51 - 60 | 0
61 - 70 | 0
71 - 80 | 0
81 - 90 | 0
91 - 100 | 0
BUILD SUCCESSFUL (total time: 0 seconds)
*/