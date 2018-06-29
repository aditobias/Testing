package com.company;

public class Operations {

    public int a, b, result, answer;

    public int getAnswer() {
        return answer;
    }

    public void setAnswer(int answer) {
        this.answer = answer;
    }

    public int getA(){
        return a;
    }
    public void setA(int a){
        this.a = a;
    }

    public int getB(){
        return b;
    }

    public void setB(int b){
        this.b = b;


    }
    public int getResult(){
        return result;
    }
    public void setResult(int result){
        this.result = result;
    }

    public void addition(int a, int b){

        setResult(a + b);
        System.out.print("What is " + a + " + " + b + " ? ");

    }
    public void subtraction(int a, int b){

        setResult(a - b);
        System.out.print("What is " + a + " - " + b + " ? ");

    }
    public void multiplication(int a, int b){

        setResult(a * b);
        System.out.print("What is " + a + " * " + b + " ? ");

    }
    public void division(int a, int b){

        setResult(a / b);
        System.out.print("What is " + a + " / " + b + " ? ");

    }
    public void modal(int a, int b){

        setResult(a % b);
        System.out.print("What is " + a + " % " + b + " ? ");

    }

}
