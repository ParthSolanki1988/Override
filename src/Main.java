import com.simformsolutions.overriding.Employee;
import com.simformsolutions.overriding.EmployeeOfJavaStack;

public class Main {
  public static void main(String[] args) {

    //parent class
    Employee employee = new Employee();
    employee.numberOfEmployee();
    employee.salary();


    //EmployeeOfJavaStack class extend Employee class
    //override all method from Employee class into EmployeeOfJavaStack class
    EmployeeOfJavaStack employeeOfJavaStack = new EmployeeOfJavaStack();
    employeeOfJavaStack.numberOfEmployee();
    employeeOfJavaStack.salary();



  }
}