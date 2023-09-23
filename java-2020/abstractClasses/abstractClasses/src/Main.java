public class Main {
    public static void main(String[] args) {
        GameCalculator gameCalculator = new ChildrenGameCalculator();
        gameCalculator.calculate();
        gameCalculator.gameOver();

    }
}