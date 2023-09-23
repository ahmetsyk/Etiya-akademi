package core.logging;

public class DatebaseLogger implements Logger{
    @Override
    public void log(String message) {
        System.out.println("Veritabanına loglandı: " + message);
    }
}
