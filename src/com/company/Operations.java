package com.company;

import java.util.ArrayList;

public class Operations {

    private int a, b, result, answer;

    private String text, operator;

    ArrayList<Integer> list = new ArrayList<>();


    String getText(){
        return text;
    }

    private void setText(String text){
        this.text = text;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    int getAnswer() {

        return answer;
    }

    void setAnswer(int answer) {
        this.answer = answer;

    }

    private int getA(){

        return a;
    }
    void setA(int a){

        this.a = a;
    }

    private int getB(){

        return b;
    }

    void setB(int b){
        this.b = b;

    }
    int getResult(){

        return result;
    }
    private void setResult(int result){

        this.result = result;
    }

    private void addition(int a, int b){

        setResult(a + b);
        setText("What is " + a + " + " + b + " ? ");

    }
    private void subtraction(int a, int b){

        setResult(a - b);
       setText("What is " + a + " - " + b + " ? ");

    }
    private void multiplication(int a, int b){

        setResult(a * b);
        setText("What is " + a + " * " + b + " ? ");

    }
    private void division(int a, int b){

        setResult(a / b);
        setText("What is " + a + " / " + b + " ? ");

    }
    private void modal(int a, int b){

        setResult(a % b);
        setText("What is " + a + " % " + b + " ? ");

    }
    void operator(int randomNum){
        switch (randomNum){
            case 1: addition(getA(), getB());
                break;
            case 2: subtraction(getA(), getB());
                break;
            case 3: multiplication(getA(), getB());
                break;
            case 4: division(getA(), getB());
                break;
            case 5: modal(getA(), getB());
                break;
            default:
                break;
        }
    }

}
