package ru.job4j.calculator;

public class Fit {
    public static double manWeight(short height) {
        double result = ((height - 100) * 1.15);
        return result;
    }

    public static double womanWeight(short height) {
        double result = ((height - 110) * 1.15);
        return result;
    }

    public static void main(String[] args) {
        short heightman = 180;
        short heightwoman = 170;
        double man = Fit.manWeight(heightman);
        double woman = Fit.womanWeight(heightwoman);
        System.out.println("Man 180 is " + man);
        System.out.println("Women 170 is " + woman);
    }
}