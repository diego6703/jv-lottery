package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        final int BALL_COUNT = 3;
        Lottery lottery = new Lottery();
        Ball[] balls = new Ball[BALL_COUNT];
        for (int i = 0; i < BALL_COUNT; i++) {
            balls[i] = lottery.getRandomBall();
            System.out.println(balls[i]);
        }
    }
}
