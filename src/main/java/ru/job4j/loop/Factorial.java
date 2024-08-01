package ru.job4j.loop;


public class Factorial {
    public static int calculate(int number) {
        int result = 1;
        if (number == 0) {
            return result;
        } else {
            for (int index = 1; index <= number; index++) {
                result  = result * index;
            }
        }
        return result;
    }
}


