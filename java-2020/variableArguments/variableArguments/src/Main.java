public class Main {
    public static void main(String[] args) {

        System.out.println(toplam(3,5,6,2));

    }
    public static int toplam(int... sayilar){
        int toplama=0;
        for (int i:sayilar) {
            toplama+=i;

        }
        return toplama;
    }
}