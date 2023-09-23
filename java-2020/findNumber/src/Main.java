import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[]{1, 2, 5, 7, 9, 0};
        int willBeSearched;
        Scanner scan = new Scanner(System.in);
        System.out.println("aranacak sayiyi giriniz: ");
        willBeSearched = scan.nextInt();

        isThere(numbers, willBeSearched);
    }

    private static void isThere(int[] numbers, int willBeSearched) {
        for (int number : numbers) {
            if (willBeSearched == number) {
                sendAffirmativeMessage(willBeSearched);
                break;
            } else
                sendNegativeMessage(willBeSearched);

        }
    }
    public static void sendAffirmativeMessage(int willBeSearched){
        System.out.println("Sayi listede mevcuttur: " + willBeSearched);
    }
    public static void sendNegativeMessage(int willBeSearched){
        System.out.println("Sayi listede mevcut değildir: " + willBeSearched);
    }

}