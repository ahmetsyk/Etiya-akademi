public class Main {
    public static void main(String[] args) {
        //For Loop
        for (int i = 2; i <= 10; i+=2) {
            System.out.println(i);
        }
        System.out.println("For Loop finished");

        //While Loop
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i+=2;
        }
        System.out.println("While Loop finished");

        //Do While Loop
        int j=1;
        do {
            System.out.println(j);
            j+=1;
        }while (j<10);
        System.out.println("Do-While Loop finished");
    }
}