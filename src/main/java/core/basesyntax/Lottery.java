package core.basesyntax;

import java.util.Random;

public class Lottery {
    private Random rg = new Random();
    private ColorSupplier cs = new ColorSupplier();

    public Ball getRandomBall() {
        return new Ball(cs.getRandomColor(), rg.nextInt(101));
    }
}
