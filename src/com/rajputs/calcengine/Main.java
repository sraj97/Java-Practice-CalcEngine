package com.rajputs.calcengine;

public class Main {

    public static void main(String[] args) {
        // performCalculations();
        Divider divider = new Divider();
        doCalculation(divider, 100, 50);
        Adder adder = new Adder();
        doCalculation(adder, 25, 92);
    }

    static void doCalculation(CalculateBase calculation, double leftVal, double rightVal){
        calculation.setLeftVal(leftVal);
        calculation.setRightVal(rightVal);
        calculation.calculate();
        System.out.println("Calculation result = " + calculation.getResult());
    }

    static void performCalculations() {

        MathEquation[] equations = new MathEquation[4];
        equations[0] = new MathEquation( 'd', 100, 50);
        equations[1] = new MathEquation('a', 25, 92);
        equations[2] = new MathEquation('s', 225, 17);
        equations[3] = new MathEquation('m', 11, 3);

        for (MathEquation equation: equations) {
            equation.execute();
            System.out.println("result = " + equation.getResult());
        }

        System.out.println("Average result = " + MathEquation.getAverageResult());

        MathEquation equationOverload = new MathEquation('d');

        double leftDouble = 9;
        double rightDouble = 4;
        equationOverload.execute(leftDouble, rightDouble);
        System.out.println("Overloaded result with doubles: " + equationOverload.getResult());


        int leftInt = 9;
        int rightInt = 4;

        equationOverload.execute(leftInt, rightInt);
        System.out.println("Overloaded result with ints : " + equationOverload.getResult());
    }



}


