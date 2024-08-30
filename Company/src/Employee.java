public class Employee {

    String name;
    int salary;
    int workHours;
    int hireYear;

    public Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public void tax(){
        if(this.salary < 1000){
            System.out.println(this.salary);
        }else if (this.salary > 1000){
            System.out.println((this.salary * 3)/100);
        }
    }

    public void bonus(){
        if(this.workHours > 40){
            System.out.println((this.workHours - 40) * 30);
        }else if (this.workHours < 40){
            System.out.println(0);
        }
    }

    public void raiseSalary(){
       int today = 2024;

       if(today - this.hireYear < 10){
           System.out.println((this.salary * 5)/100);
       }else if (today - this.hireYear > 9 && today - this.hireYear < 20){
           System.out.println((this.salary * 10)/100);
       }else if (today - this.hireYear > 19){
           System.out.println((this.salary * 15)/100);
       }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", workHours=" + workHours +
                ", hireYear=" + hireYear +
                '}';
    }
}
