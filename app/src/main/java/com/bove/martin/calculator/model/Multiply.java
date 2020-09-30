package com.bove.martin.calculator.model;

/**
 * Created by Martín Bove on 29-Sep-20.
 * E-mail: mbove77@gmail.com
 */
public class Multiply extends Operation {

    private double multiply;

    public Multiply(double n1, double n2) {
        this.multiply = n1 * n2;
        this.setResult(this.multiply);
    }
}
