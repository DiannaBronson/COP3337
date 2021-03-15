
 //* @author Dianna
import java.util.HashMap;
import java.util.Scanner;

public class Zip_Code_Encoder { 
    static HashMap<Integer, String> digitToCodeMap = new HashMap<>(){{
        put(1,":::||");
        put(2,"::|:|");
        put(3,"::||:");
        put(4,":|::|");
        put(5,":|:|:");
        put(6,":||::");
        put(7,"|:::|");
        put(8,"|::|:");
        put(9,"|:|::");
        put(0,"||:::");
   
}};
    static HashMap<String, Integer> codeToDigitMap = new HashMap<>(){{
        put(":::||",1);
        put("::|:|",2);
        put("::||:",3);
        put(":|::|",4);
        put(":|:|:",5);
        put(":||::",6);
        put("|:::|",7);
        put("|::|:",8);
        put("|:|::",9);
        put("||:::",0);
    }};
    public static void main(String[] args) {
        // Take in user input
        System.out.printf("Enter a five digit zipcode: ");
        Scanner scn = new Scanner(System.in);
        String zip = scn.nextLine();
        // Validate user input
        
        if (zip.matches("[0-9]+") && zip.length()== 5){
            // Translate zipcode into barcode
            String barcode = "|";
            int sum = 0;
            for (int i = 0; i < zip.length(); i++){
                char c = zip.charAt(i);
                int num = c - '0';
                sum = sum + num;
                String code = Zip_Code_Encoder.digitToCodeMap.get(num);
                barcode = barcode.concat(code);
            }
            int checkDigit = ((int)Math.ceil(sum/10.0)*10)- sum;
            String checkDigitCode = Zip_Code_Encoder.digitToCodeMap.get(checkDigit);
            barcode = barcode.concat(checkDigitCode);
            barcode = barcode.concat("|");
            System.out.print(barcode);
        }else{
            System.out.println("not a valid zip code");
            
        }
    }
    }
