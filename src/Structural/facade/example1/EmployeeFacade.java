package Structural.facade.example1;

public class EmployeeFacade {
    EmployeeDAO employeeDAO;

    public EmployeeFacade(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    void insert(){
        employeeDAO.insert();
    }
}
