import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //220-284 are friends number.
        int number1, number2;
        int total1=0,total2 = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("İlk sayiyi giriniz: ");
        number1 = scan.nextInt();
        System.out.println("İkinci sayiyi giriniz: ");
        number2 = scan.nextInt();

        isFriend(number1, number2, total1, total2);
    }

    private static void isFriend(int number1, int number2, int total1, int total2) {
        for (int i = 0; i< number1; i++){
            if (number1 %i==0){
                total1 +=i;
            }
        }
        for (int i = 0; i< number2; i++){
            if (number2 %i==0){
                total2 +=i;
            }
        }
        if (number1 == total2 && number2 == total1){
            System.out.println("Sayilar arkadaş sayılardır.");
        }else
            System.out.println("Sayılar arkadaş sayılar değildir.");
    }
}