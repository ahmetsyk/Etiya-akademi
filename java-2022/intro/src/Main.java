public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //Java'da değişken isimleri camelCase yazılır.
        String ortaMetin = "İlginizi çekebilir";
        String altMetin = "Vade Süresi";

        System.out.println(ortaMetin);

        //integer
        int vade = 12;

        double dolarDun = 18.14;
        double dolarBugun = 18.10;

        boolean dolarDustuMu = true;

        String okYonu = "";

        if (dolarBugun < dolarDun) {
            okYonu = "down.svg";
            System.out.println(okYonu);
        } else if (dolarBugun>dolarDun) {
            okYonu = "up.svg";
            System.out.println(okYonu);
        } else {
            okYonu="equal.svg";
            System.out.println(okYonu);
        }

        //array

        String[] krediler = {"Hızlı Kredi","Maaşını Halkbank'tan alanlar", "Mutlu Emekli"};

        for (int i = 0; i < krediler.length; i++){
            System.out.println(krediler[i]);
        }
    }
}