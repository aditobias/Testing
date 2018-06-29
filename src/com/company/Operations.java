package com.company;

import java.util.ArrayList;

public class Operations {

    public int a, b, result, answer;

    public String text, operator;

    ArrayList<Integer> list = new ArrayList<>();


    public String getText(){
        return text;
    }

    public void setText(String text){
        this.text = text;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

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

    void addition(int a, int b){

        setResult(a + b);
        setText("What is " + a + " + " + b + " ? ");

    }
    void subtraction(int a, int b){

        setResult(a - b);
       setText("What is " + a + " - " + b + " ? ");

    }
    void multiplication(int a, int b){

        setResult(a * b);
        setText("What is " + a + " * " + b + " ? ");

    }
    void division(int a, int b){

        setResult(a / b);
        setText("What is " + a + " / " + b + " ? ");

    }
    void modal(int a, int b){

        setResult(a % b);
        setText("What is " + a + " % " + b + " ? ");

    }

}
