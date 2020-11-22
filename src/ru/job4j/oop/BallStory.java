package ru.job4j.oop;

public class BallStory {
    public static void main(String[] args) {
        Ball ball = new Ball();
        Hare hare = new Hare();
        Wolf wolf = new Wolf();
        Fox fox = new Fox();
        ball.singingASong(hare);
        hare.tryEat(ball);
        ball.leftFrom(hare);
        ball.singingASong(wolf);
        wolf.tryEat(ball);
        ball.leftFrom(wolf);
        fox.tryEat(ball);
        fox.eat(ball);
    }
}
