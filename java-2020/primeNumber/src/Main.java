import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number;
        boolean isPrime = true;
        System.out.println("Sayi giriniz: ");
        Scanner scan = new Scanner(System.in);
        number = scan.nextInt();
        if (number==1){
            System.out.println(isPrime);
        } else if (number<1) {
            System.out.println("Hata: Yanlış sayi girdiniz");
        } else {
            isPrime(number, isPrime);
        }
    }

    private static void isPrime(int number, boolean isPrime) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
                System.out.println(isPrime);
            }
        }
        System.out.println(isPrime);
    }
}