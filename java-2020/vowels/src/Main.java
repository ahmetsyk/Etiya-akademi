public class Main {
    public static void main(String[] args) {
        char letter = 'E';

        checkLetter(letter);
    }

    private static void checkLetter(char letter) {
        switch (letter){
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Kalın sesli harf");
                break;
            default:
                System.out.println("İnce sesli harf");

        }
    }
}