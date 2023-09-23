public class Main {
    public static void main(String[] args) {
        int number1= 20;
        int number2= 25;
        int number3= 2;
        int greatest = number1;
        if (greatest < number2){
            greatest = number2;

        }
        if (greatest < number3){
            greatest = number3;

        }
        System.out.println("The greatest number is :" + greatest);
        }
}