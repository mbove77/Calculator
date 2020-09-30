package com.bove.martin.calculator.model;

/**
 * Created by Martín Bove on 29-Sep-20.
 * E-mail: mbove77@gmail.com
 */
public class Minus extends Operation {

    private double minus;

    public Minus(double n1, double n2) {
        this.minus = n1 - n2;
        this.setResult(this.minus);
    }
}
