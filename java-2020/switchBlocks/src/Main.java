public class Main {
    public static void main(String[] args) {
        char grade = 'F';
        switch (grade) {
            case 'A':
                System.out.println("Perfect ");
            case 'B':
                System.out.println("Very nice ");
            case 'C':
                System.out.println("Nice ");
            case 'D':
                System.out.println("Not bad ");
            case 'F':
                System.out.println("Bad ");
                break;
            default:
                System.out.println("Invalid grade entered");
        }
    }
}