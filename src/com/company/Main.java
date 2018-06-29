
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

            int randomNum = ThreadLocalRandom.current().nextInt(1, 6);

            switch (randomNum){
                case 1: o.addition(o.getA(), o.getB());
                    break;
                case 2: o.subtraction(o.getA(), o.getB());
                    break;
                case 3: o.multiplication(o.getA(), o.getB());
                    break;
                case 4: o.division(o.getA(), o.getB());
                    break;
                case 5: o.modal(o.getA(), o.getB());
                    break;
                default:
                    break;
            }


            checkOperator(o.getText());

            while (true)
                try {
                    o.setAnswer(Integer.parseInt(test.nextLine()));
                    break;
                } catch (NumberFormatException nfe) {
                    System.out.print("You have entered an invalid input. Please try again: ");
                }

                System.out.print(o.list);

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

    private static void checkOperator(String text){

        Operations o = new Operations();

        System.out.print(o.getOperator());
        if (o.getText().contains("+") || o.getOperator().contains("-")){
            System.out.print("Test");
        }
        else if (o.getOperator().contains(" / ") || o.getOperator().contains("*")){
            System.out.print("To Test");
        }
    }

}
