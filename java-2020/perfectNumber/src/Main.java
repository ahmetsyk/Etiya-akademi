import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number ;
        int total=0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Sayi giriniz: ");
        number=scan.nextInt();

        isPerfect(number, total);
    }

    private static void isPerfect(int number, int total) {
        for (int i = 0; i< number; i++){
            if (number %i==0){
                total +=i;
            }
        if (total == number){
            System.out.println(number + " mükemmel sayidir.");
        }else
            System.out.println(number + " mükemmel sayi değildir.");
        }
    }
}