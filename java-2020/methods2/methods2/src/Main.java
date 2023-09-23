import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static int String;
    static ArrayList<String> eklenenIsimler = new ArrayList<>(String);

    public static void main(String[] args) {
        while (true) {
            Scanner input0 = new Scanner(System.in);
            System.out.println("ekle=1  , sil=2  ,  güncelle=3   çık=4 ");
            int a = input0.nextInt();
            if (a == 4)
                break;
            switch (a) {
                case 1:
                    System.out.println("eklenecek ismi giriniz.");
                    Scanner input1 = new Scanner(System.in);
                    String isimAl = input1.next();
                    ekle(isimAl);
                    break;
                case 2:
                    Scanner input2 = new Scanner(System.in);
                    System.out.println("silinecek ismi giriniz.");
                    String isimSil = input2.next();
                    sil(isimSil);
                    break;
                case 3:
                    Scanner input3 = new Scanner(System.in);
                    System.out.println("güncellenecek ismi giriniz.");
                    String isimGuncelle = input3.next();
                    Scanner input4 = new Scanner(System.in);
                    System.out.println("güncel ismi giriniz.");
                    String isimGuncelle2 = input4.next();
                    guncelle(isimGuncelle, isimGuncelle2);
                    break;
                default:
                    System.out.println("doğru numara giriniz.");
                    break;
            }
        }
        System.out.println(eklenenIsimler);
    }

    public static void ekle(String isim) {
        eklenenIsimler.add(isim);
        System.out.println("eklendi");
    }

    public static void sil(String silinecekIsim) {

        eklenenIsimler.remove(silinecekIsim);
        System.out.println("silindi");

    }

    public static void guncelle(String guncellenecek, String guncelIsim) {
        eklenenIsimler.remove(guncellenecek);
        eklenenIsimler.add(guncelIsim);

        System.out.println("güncellendi");

    }

}