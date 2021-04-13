
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class CountChar {

    public static void main(String[] args) throws IOException {

        //import file
        File file = new File("C:\\Users\\Dianna\\Desktop\\Alice's Adventures in Wonderland.txt");

        //create scanner object
        Scanner scan = new Scanner(file);

        //use Delimeter
        scan.useDelimiter("");

        //variables
        int upperCase = 0;
        int lowerCase = 0;
        int whiteSpace = 0;
        int punctuation = 0;
        int others = 0;

        //while loop that contains the if statements that use the Java Character class
        while (scan.hasNext()) {
            char ch = scan.next().charAt(0);

            if (Character.isUpperCase(ch)) {
                upperCase++;

            } else if (Character.isLowerCase(ch)) {
                lowerCase++;

            } else if (Character.isWhitespace(ch)) {
                whiteSpace++;

            } else if (ch == '.' || ch == '?' || ch == ',' || ch == '!' || ch == '\"' || ch == '\'' || ch == ';' || ch == ':') {
                punctuation++;

            } else {
                others++;
            }
        }//end while ifs
        
        //print statements
        System.out.println("Number of uppercase letters: " + upperCase);
        System.out.println("Number of lowercase letters: " + lowerCase);
        System.out.println("Number of white spaces : " + whiteSpace);
        System.out.println("Number of punctuations: " + punctuation);
        System.out.println("Number of others: " + others);
    }
}
