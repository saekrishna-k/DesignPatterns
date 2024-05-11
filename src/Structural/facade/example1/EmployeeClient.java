package Structural.facade.example1;

public class EmployeeClient {
    public static void main(String[] args){
        EmployeeFacade employeeFacade = new EmployeeFacade(new EmployeeDAO());
        employeeFacade.insert();
    }
}
