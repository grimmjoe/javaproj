/**
 * Created by hamleta on 10/24/2016.
 */
import java.io.*;
public class Employee {
    String name;
    int age;
    String designation;
    double salary;

    private static double statSalary = 200000;

    public static final String Department = "POSA";

    public Employee(String name)
    {
        this.name = name;
    }

    public void empAge(int age)
    {
        this.age = age;
    }

    public void empDesignation(String designation)
    {
        this.designation = designation;
    }

    public void empSalary(double salary)
    {
        this.salary = salary;
    }

    public void printEmployee()
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: " + salary);

        System.out.println("Starting salary: " + Employee.statSalary);
        System.out.println("Department: " + Employee.Department);
    }
}
