
package com.company;


import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;


public class Main {

    public static void main(String[] args) {

        Scanner test = new Scanner (System.in);

        int countWrong = 0;

        Operations o = new Operations();

        do{

            o.setA(ThreadLocalRandom.current().nextInt(1,31));
            o.setB(ThreadLocalRandom.current().nextInt(1,31));
            o.operator(ThreadLocalRandom.current().nextInt(1, 6));

            System.out.print(o.getText());

            while (true)
                try {
                    o.setAnswer(Integer.parseInt(test.nextLine()));
                    break;
                } catch (NumberFormatException nfe) {
                    System.out.print("You have entered an invalid input. Please try again: ");
                }

            if (o.getAnswer() == o.getResult()){
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
