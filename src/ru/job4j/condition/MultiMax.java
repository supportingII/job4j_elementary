package ru.job4j.condition;

public class MultiMax {
    public static int max(int first, int second, int third) {
        int max = first;

        if (second > max) {
            max = second;
        }

        if (third > max) {
            max = third;
        }

        /* Это если нужно решение через тернарный оператор
        (но первый вариант по мне лучше, там не будет лишнего присваивания переменной в случае если условие не истино)
        max = second > max ? second : max;
        max = third > max ? third : max;
        */

        return max;
    }
}
