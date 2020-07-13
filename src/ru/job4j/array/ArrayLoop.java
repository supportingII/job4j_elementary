package ru.job4j.array;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] data = new int[5];

        for (int i = 0; i < data.length; i++) {
            data[i] = i * 2 + 3;
        }

        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }
    }
}
