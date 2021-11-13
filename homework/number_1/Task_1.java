package com.homework.number_1;

import java.util.Scanner;

public class Task_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Integer firstValue = null;
        Integer secondValue = null;

        //checking that numbers were entered
        while (true) {
            System.out.println("Enter an integer");
            int count = 0;                                    //we need 2 numbers, so we create a counter
            if (count < 2) {

                if (sc.hasNextInt()) {                        //if not a mistake and you entered a number
                    firstValue = sc.nextInt();
                    count++;
                    System.out.println("Enter another integer");
                }

                if (sc.hasNextInt() && count == 1) {          //if not a mistake too and you entered a second number
                    secondValue = sc.nextInt();
                    count++;
                    break;
                }

                while (!sc.hasNextInt()) {                    //if you entered not numbers
                    System.out.println("It's not an integer! \n" +
                            "Try to enter again");
                    sc.next();

                    if ((sc.hasNextInt() && count == 0)) {    //if not a mistake and you entered a number
                        firstValue = sc.nextInt();
                        count++;
                        System.out.println("Enter another integer");
                    }

                    if ((sc.hasNextInt() && count == 1)) {    //if not a mistake too and you entered a second number
                        secondValue = sc.nextInt();
                        count++;
                        break;
                    }
                }
            }
        }

        Integer sum = firstValue + secondValue;

        if (firstValue > secondValue) {
            System.out.format("""
                            The number %s more than %s\s
                            Sum of numbers: %s\s
                            """,
                              firstValue, secondValue, sum);

        } else if (firstValue < secondValue) {
            System.out.format("""
                            The number %s less than %s\s
                            Sum of numbers: %s\s
                            """,
                    firstValue, secondValue, sum);
        }

        if (firstValue.equals(secondValue)) {
            System.out.format("""
                    The numbers are equal!
                    Sum of numbers: %s\s
                    """, sum );
        }
    }
}