package com.rajputs.calcengine;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        performCalculations();
    }

    static void performCalculations() {

        MathEquation[] equations = new MathEquation[4];
        equations[0] = create(100, 50,  'd');
        equations[1] = create(25, 92, 'a');
        equations[2] = create(225, 17, 's');
        equations[3] = create(11, 3, 'm');

        for (MathEquation equation: equations) {
            equation.execute();
            System.out.println("result = " + equation.result);
        }
    }

    private static MathEquation create(double leftVal, double rightVal, char opCode){
        MathEquation equation = new MathEquation();
        equation.leftVal = leftVal;
        equation.rightVal = rightVal;
        equation.opCode = opCode;
        return equation;
    }

}


