package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int maxMatch = 11;
        int numberOfPlayers = 0;
        String[] players = initializingPlayers();
        System.out.println("Добро пожаловать в игру 11 спичек!");

        while (true) {
            System.out.println("- - - - - - - - - - - - - - - - -");
            System.out.println("Ходит " + players[numberOfPlayers]);

            int select = Integer.parseInt(input.nextLine());

            if (select < 1 || select > 3) {
                System.out.println("Число не входит в диапазон от 1 до 3. Повторите набор.");
                continue;
            }

            maxMatch -= select;

            if (maxMatch <= 0) {
                System.out.println("Победил " + players[numberOfPlayers]);
                break;
            } else {
                System.out.println("Спичек осталось - " + maxMatch);
            }

            numberOfPlayers = numberOfPlayers == 0 ? 1 : 0;

        }
    }

    public static String[] initializingPlayers() {
        String[] returnList = new String[2];
        returnList[0] = "первый игрок";
        returnList[1] = "второй игрок";

        return returnList;
    }
}
