package Thread;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
public class ParallelEmployeeSortExample {
    public static void main(String[] args) {
        // Create a list of employees
        List<Employee> employeeList = new ArrayList<>();
        // Add millions of employees to the list...

        // Use parallel sorting for improved performance
        Comparator<Employee> salaryComparator = Comparator.comparingDouble(Employee::getSalary);
        ForkJoinPool forkJoinPool = new ForkJoinPool();

        forkJoinPool.submit(() -> Collections.sort(employeeList, salaryComparator)).join();

        // Display or process the sorted list
        for (Employee employee : employeeList) {
            System.out.println(employee.getName() + ": " + employee.getSalary());
        }
    }
}