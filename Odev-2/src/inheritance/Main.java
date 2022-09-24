package inheritance;

public class Main {
    public  static void main(String[] args){
        Customer customer=new Customer();
        customer.id=1;
        customer.firstName="Engin";
        customer.lastName="Demir";
        customer.age=30;
        customer.email="engin@gmail.com";

        Employee employee=new Employee();
        employee.id=1;
        employee.firstName="Emin";
        employee.lastName="Uzgur";
        employee.age=27;
        employee.salary=5000;


    }
}
