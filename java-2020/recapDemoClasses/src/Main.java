public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Toplama " + calculator.summation(3, 5));
        System.out.println("çıkarma "+ calculator.subtraction(5,1));
        System.out.println("çarpma " + calculator.multiplication(7,3));
        System.out.println("bölme " + calculator.division(6,3));
    }
}