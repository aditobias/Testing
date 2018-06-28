
package com.company;
import jdk.internal.util.xml.impl.Input;

import java.util.InputMismatchException;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.lang.Math;
import java.util.concurrent.ThreadLocalRandom;


public class Main {

    public static void main(String[] args) {

        Scanner test = new Scanner (System.in);

        int num1 = 0, num2 = 0,result = 0;
        int resultOperator;
        int countWrong = 0;
        boolean input;
        int answer = 0;

        do{


            num1 = ThreadLocalRandom.current().nextInt(1,30);
            num2 = ThreadLocalRandom.current().nextInt(1,30);

            int randomNum = ThreadLocalRandom.current().nextInt(1, 5);

            if (randomNum == 1) {
                result = num1 + num2;

                System.out.print("What is " + num1 + " + " + num2 + " ? ");
            }
            else if (randomNum == 2) {

                result = num1 - num2;

                System.out.print("What is " + num1 + " - " + num2 + " ? ");
            }
            else if (randomNum == 3){

                result = num1 / num2;

                System.out.print("What is " + num1 + " / " + num2 + " ? ");
            }
            else if (randomNum == 4){

                result = num1 * num2;

                System.out.print("What is " + num1 + " * " + num2 + " ? ");
            }



            while (true)
                try {
                    answer = Integer.parseInt(test.nextLine());
                    break;
                } catch (NumberFormatException nfe) {
                    System.out.print("You have entered an invalid input. Please try again: ");
                }

            if (answer == result){
                System.out.println("Correct!");
            }
            else{
                countWrong++;
                System.out.println("WRONG");
            }

        } while (countWrong <= 2);

        if (countWrong > 2){
            System.out.print("\nYou lose");
        }
	// write your code here
    }


}
