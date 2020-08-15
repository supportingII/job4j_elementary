package ru.job4j.oop;

public class Student {
    public static void main(String[] args) {
        Student petya = new Student();
        petya.song();
        petya.music();
        petya.song();
        petya.music();
        petya.song();
        petya.music();
    }

    public void song() {
        System.out.println("I believe I can fly");
    }

    public void music() {
        System.out.println("Tra tra tra");
    }
}
