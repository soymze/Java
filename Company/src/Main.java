
public class Main {
    public static void main(String[] args) {
        Employee slave = new Employee("noOne", 500,99,1897);


        slave.raiseSalary();
        slave.bonus();
        slave.tax();
        slave.toString();
    }
}