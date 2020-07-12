package ru.job4j.loop;

public class Mortgage {
    public static int year(int amount, int salary, double percent) {
        int year = 0;
        double creditSumm = amount;
        while (creditSumm > 0) {
            creditSumm = creditSumm + (creditSumm * percent / 100) - salary;
            year++;
        }

        return year;
    }
}
