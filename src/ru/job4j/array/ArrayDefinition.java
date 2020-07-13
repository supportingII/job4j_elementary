package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] firstArray = new short[10];
        String[] secondArray = new String[10];
        float[] lastArray = new float[40];

        String[] names = new String[4];
        names[0] = "Petr";
        names[1] = "Ivan";
        names[2] = "Serega";
        names[3] = "Olya";

        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
    }
}
