import java.util.*;

public class Converter {
    public static void main(String[]args) {

        Scanner sc = new Scanner(System.in);
        char charInput, charOutput;
        int intInput;

        System.out.println("Please enter a Character: ");
        charInput = sc.next().charAt(0);

        intInput = (int)(charInput);

        if(intInput >= 65 && intInput <= 90) {
            System.out.println("The ASCII value of '" + charInput + "' is: " + intInput);
            charOutput = (char)(intInput + 32);
            System.out.println("The lowercase value of '" + charInput + "' is: '" + charOutput + "'");

        } else if(intInput >= 97 && intInput <= 122) {
            System.out.println("The ASCII value of '" + charInput + "' is: " + intInput);
            charOutput = (char)(intInput - 32);
            System.out.println("The uppercase value of '" + charInput + "' is: '" + charOutput + "'");

        } else {
            System.out.println("Error");

        }
        sc.close();
    }
}
