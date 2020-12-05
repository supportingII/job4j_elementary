package ru.job4j.tracker;

import java.util.Scanner;

public class ConsoleInput implements Input {

    private Scanner scanner = new Scanner(System.in);

    @Override
    public String askStr(String msg) {
        System.out.println(msg);
        return scanner.nextLine();
    }

    @Override
    public int askInt(String msg) {
        return Integer.parseInt(askStr(msg));
    }
}
