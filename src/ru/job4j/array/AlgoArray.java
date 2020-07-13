package ru.job4j.array;

public class AlgoArray {
    public static void main(String[] args) {
        int[] array = new int[] {5, 3, 2, 1, 4};

        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0 && array[j] < array[j - 1]; j--) {
                int temp = array[j - 1]; /* переменная для временного хранения значение ячейки с индексом 0. */
                array[j - 1] = array[j]; /* записываем в ячейку с индексом 0 значение ячейки с индексом 3. */
                array[j] = temp; /* записываем в ячейку с индексом 3 значение временной переменной. */
            }
        }

        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }
}
