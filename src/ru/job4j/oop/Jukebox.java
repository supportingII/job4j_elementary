package ru.job4j.oop;

public class Jukebox {

    public static void main(String[] args) {
        Jukebox obj = new Jukebox();
        obj.music(1);
        obj.music(2);
        obj.music(3);
    }

    public void music(int position) {
        switch (position) {
            case 1: System.out.println("Пусть бегут неуклюже"); break;
            case 2: System.out.println("Спокойной ночи"); break;
            default: System.out.println("Песня не найдена"); break;
        }
    }

}
