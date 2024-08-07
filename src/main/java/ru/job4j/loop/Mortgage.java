package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, int salary, double percent) {
        int year = 1;
        amount += amount * percent / 100;
        while (salary < amount) {
        amount += amount * percent / 100;
        amount = amount - salary;
        year += 1;
    }
        return year;
    }
}
