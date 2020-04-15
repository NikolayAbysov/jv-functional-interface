package core.basesyntax;

/**
 * <p>Имплементируйте необходимый функциональный интерфейс и его метод для случайного
 * выбора цвета</p>
 */
public class RandomColor implements ColorRandomise {
    private static final String[] COLORS = {"red", "green", "blue", "yellow", "pink",
            "black", "white"};

    @Override
    public String get() {
        int a = 0;
        int b = 7;
        return COLORS[a + (int) (Math.random() * b)];
    }
}
