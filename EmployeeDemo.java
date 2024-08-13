package test1;

class Employee {
    void calculateSalary(){
        System.out.println("Employee calculateSalary()");
    }
    
}

 class Manager extends Employee{
    void calculateSalary(){
        System.out.println("Manager calculateSalary");
    }
 }

 class Programmer extends Employee{
    void calculateSalary(){
        System.out.println("Programmer calculateSalary");
    }
 }

 public class EmployeeDemo{
    public static void main(String[] args) {
        Employee emp1=new Manager();
        emp1.calculateSalary();

        Employee emp2=new Programmer();
        emp2.calculateSalary();
    }
 }
