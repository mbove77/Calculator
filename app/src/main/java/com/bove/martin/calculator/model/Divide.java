package com.bove.martin.calculator.model;

/**
 * Created by Martín Bove on 29-Sep-20.
 * E-mail: mbove77@gmail.com
 */
public class Divide extends Operation {

    private double divide;

    public Divide(double n1, double n2) throws ArithmeticException  {
        if(n2==0) {
            throw new ArithmeticException();
        }
        else {
            this.divide = n1 / n2;
        }
        this.setResult(this.divide);
    }
}
