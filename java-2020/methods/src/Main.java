public class Main {
    public static void main(String[] args) {
        String message= "Engin";
        int number1=5;
        int number2 = 4;
        System.out.println(sum(number1,number2));
        System.out.println(sum(number1,3,6));
        add(message);
        delete(message);
        update(message);
    }

    public static void add(String message){
        System.out.println("Eklendi" + message);
    }

    public static void delete(String message){
        System.out.println("Silindi" + message);

    }
    public static void update(String message){
        System.out.println("Güncellendi" + message);
    }

    public static int sum(int number1, int number2){
        return number1 + number2;
    }
    public static int sum(int... numbers){
        int total=0;
        for (int number:numbers
             ) {
            total+=number;

        }
        return total;
    }

}