package pl.akademiakodu.AK_Spring_ExerciseMethod_BasicCalculator.models;

public class CalculatorAverage {

    public int squareOf(int a) {
//        //todo implement method
//
        return a * a;
    }

    public int elementOf(int a) {
        //todo implement method
        return (int) Math.sqrt(a);
    }


    public int factorial(int a) {
        //todo implement method
        int sum = 1;

        for (int i = 1; i <= a; i++) {
            sum = sum * i;
        }

        return sum;
    }

    public boolean isPrimeNumber(int a) {
        for (int i = 2; i < a; i++) {
            if ((a % i == 0)) {
                return false;
            }

        }
        return true;
    }


}
