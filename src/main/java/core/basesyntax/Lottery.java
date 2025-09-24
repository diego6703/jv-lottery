package core.basesyntax;
import java.util.Random;

public class Lottery {
    private static final int MAX_NUMBER = 100;
    private final Random rg = new Random();
    private final ColorSupplier cs = new ColorSupplier();
    public Ball getRandomBall() {
        return new Ball(cs.getRandomColor(), rg.nextInt(MAX_NUMBER + 1));
    }
}
