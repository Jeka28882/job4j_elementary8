package ru.job4j.condition;

public class AlertDivByZero {
    public static void main(String[] args) {
        AlertDivByZero(4);
        AlertDivByZero(0);
        AlertDivByZero(-8);
    }

    public static void AlertDivByZero(int number) {
        if (number == 0) {
            System.out.println("Could not div by 0.");
        }
        if (number < 0) {
            System.out.println("This is negative number");
        }
    }
}
