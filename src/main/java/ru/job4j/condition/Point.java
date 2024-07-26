package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double x  = Math.pow((x1 - x2), 2);
        double y = Math.pow((y1 - y2), 2);
        double result = Math.sqrt((x + y));
        return result;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        double result1 = Point.distance(1, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
        System.out.println("result (0, 0) to (2, 0) " + result1);
    }
}
