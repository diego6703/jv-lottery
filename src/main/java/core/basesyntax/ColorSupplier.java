package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random rg = new Random();

    public String getRandomColor() {
        return (Colors.values()[rg.nextInt(Colors.values().length)]).toString();
    }
}
