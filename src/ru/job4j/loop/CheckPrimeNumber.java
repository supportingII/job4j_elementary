package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = number > 1;

        /*if (number == 1) {
            return false;
        }*/

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                prime = false;
                break;
            }
        }

        return prime;
    }
}
