package com.simformsolutions.overriding;

public class EmployeeOfJavaStack extends Employee{

  @Override
  public void numberOfEmployee() {
//    super.numberOfEmployee();
    System.out.println("Number of Employee in javastack : 30");
  }

  @Override
  public void salary() {
//    super.salary();
    System.out.println("salary of each employee in javastack : 40,000 per month");
  }
}
