package com.bove.martin.calculator.model;

/**
 * Created by Martín Bove on 29-Sep-20.
 * E-mail: mbove77@gmail.com
 */
public class Sum extends Operation {

    private double sum;

    public Sum(double n1, double n2) {
        this.sum = n1 + n2;
        this.setResult(this.sum);
    }
}
