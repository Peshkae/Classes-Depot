// WRITE YOUR CODE HERE

import java.util.*;

public class Menu {

    public static void main(String[] args) {

        int selector;
        long firstVal, secondVal;
        boolean close = false;
        String answer;

        Scanner sc = new Scanner(System.in);

        try {
            while (!close) {

                System.out.println("""
                        What would you like to do?
                         > 1. Sum of 2 Integers
                         > 2. Product of 2 Integers
                         > 3. Determine if 2 Integers are Divisible
                         > 0. Exit
                        """);

                selector = sc.nextInt();

                if (selector == 0) {
                    System.out.println("Goodbye");
                    close = true;

                } else if (selector > 3) {
                    System.out.println("Your choice should be between 0 and 3.");
                } else {
                    System.out.println("Enter first number: ");
                    firstVal = sc.nextLong();

                    System.out.println("Enter second number: ");
                    secondVal = sc.nextLong();

                    switch (selector) {
                        case 1:
                            answer = sum2Values(firstVal, secondVal);
                            System.out.println(answer);

                        case 2:
                            answer = prod2Values(firstVal, secondVal);
                            System.out.println(answer);

                        case 3:
                            answer = mod2Values(firstVal, secondVal);
                            System.out.println(answer);
                    }
                }
            }
        } catch (InputMismatchException error) {
            System.out.println("Input format error, please enter a whole number.");
            System.out.println("Something went wrong!");
            System.out.println("The error: " + error);
        }

        sc.close();
    }

    static String sum2Values(long valOne, long valTwo) {
        long answerSum;
        answerSum = valOne + valTwo;
        return "The answer to the sum of " + valOne + " and " + valTwo + " is " + answerSum + ".";
    }

    static String prod2Values(long valOne, long valTwo) {
        long answerProd;
        answerProd = valOne * valTwo;
        return "The answer to the product of " + valOne + " and " + valTwo + " is " + answerProd + ".";
    }

    static String mod2Values(long valOne, long valTwo) {
        if (valTwo == 0) {
            return "The denominator cannot be zero.";
        }
        if (valOne % valTwo == 0) {
            long answerDiv;
            answerDiv = valOne / valTwo;
            return valOne + " and " + valTwo + " are divisible. The answer is " + answerDiv + ".";

        } else {
            return valOne + " and " + valTwo + " are not divisible.";
        }
    }
}


