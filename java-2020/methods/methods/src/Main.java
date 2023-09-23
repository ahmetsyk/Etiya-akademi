public class Main {
    public static void main(String[] args) {
        message(sayiBulmaca(5));

    }

    public static boolean sayiBulmaca(int aranacakSayi) {
        int[] sayilar = new int[]{1, 2, 5, 7, 9, 0};
        boolean varMi = false;
        for (int sayi : sayilar) {
            if (sayi == aranacakSayi) {
                varMi = true;
            }

        }
        return varMi;

    }

    public static void message(boolean a) {
        if (a==true){
            System.out.println("aranan sayı mevcuttur.");
        }
        else
            System.out.println("aranan sayı mevcut değildir.");
    }
}