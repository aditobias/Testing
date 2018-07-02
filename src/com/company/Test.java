package com.company;



public class Test {

    public static void main(String[] args) {


        String text = "What is 2 + 3 - ? ";
        String match = "-";
        String match2 = "+";
        String match3 = "/";
        String match4 = "*";

        int index = text.indexOf(match);
        int index2 = 0;
        int matchLength = match.length();

        while (index >= 0) {  // indexOf returns -1 if no match found
            System.out.println(index);

            if (index != -1){
                index2 = index;

            }
            index = text.indexOf(match, index + matchLength);
        }



    }
}
