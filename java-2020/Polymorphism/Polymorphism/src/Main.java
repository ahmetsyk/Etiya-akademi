public class Main {
    public static void main(String[] args) {

//       BaseLogger[] loggers = new BaseLogger[] {new FileLogger(), new DatabaseLogger(), new ConsoleLogger(), new EmailLogger()};
//
//        for (BaseLogger logger : loggers) {
//            logger.log("test message");
//        }

        CustomerManager customerManager = new CustomerManager(new ConsoleLogger());
        customerManager.add();

    }
}