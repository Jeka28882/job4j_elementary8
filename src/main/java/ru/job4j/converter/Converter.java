package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float result = value / 70;
        return result;
    }
    public static int rubleToDollar(int value) {
        int result = value / 60;
        return result;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        float inEuro = 140;
        float exEuro = 2;
        float outputEuro = Converter.rubleToEuro(inEuro);
        boolean passedEuro = exEuro == outputEuro;
        System.out.println("140 rubles are " + euro + " euro. Test result : " + passedEuro);

        float dollar = Converter.rubleToDollar(140);
        System.out.println("140 rubles are " + dollar + " dollar");
        int inDollar = 140;
        float exDollar = 2;
        float outputDollar = Converter.rubleToDollar(inDollar);
        boolean passedDollar = exDollar == outputDollar;
        System.out.println("140 rubles are " + dollar + " euro. Test result : " + passedDollar);

    }
}
