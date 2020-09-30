package com.bove.martin.calculator.model;

import java.text.DecimalFormat;

/**
 * Created by Martín Bove on 29-Sep-20.
 * E-mail: mbove77@gmail.com
 */
public class Operation {
    private DecimalFormat df = new DecimalFormat("#.##########");
    private double result;

    public void setResult(double res) {
        this.result = res;
    }

    public String showResult() {
        return df.format(result);
    }
}

