package com.rajputs.calcengine;

public class Subtractor extends CalculateBase {
    @Override
    public void calculate(){
        double value = getLeftVal() - getResult();
        setResult(value);
    }
}
