public class Main {
    public static void main(String[] args) {

        Customer customer = new Customer();
        Employee employee = new Employee();
        CustomerManager customerManager = new CustomerManager();
        EmployeeManager employeeManager = new EmployeeManager();
        System.out.print("müşteri ");
        customerManager.Add();
        System.out.print("çalışan ");
        employeeManager.Add();
        System.out.print("ayın elemanı: ");
        employeeManager.BestEmployee();
    }
}