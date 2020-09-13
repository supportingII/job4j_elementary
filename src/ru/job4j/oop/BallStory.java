package ru.job4j.oop;

public class BallStory {
    public static void main(String[] args) {
        Hare hare = new Hare();
        Ball ball = new Ball();
        Wolf wolf = new Wolf();
        Fox fox = new Fox();
        fox.tryEat(ball);
        wolf.tryEat(ball);
        hare.tryEat(ball);
    }
}
