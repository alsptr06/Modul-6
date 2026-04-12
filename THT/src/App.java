import Perusahaan.Employee;
import Perusahaan.Developer;
import Perusahaan.Manager;
import java.util.ArrayList;
public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Employee("K001", "Budi Santoso", 2020, 5000000, 2.0));
        employees.add(new Developer("D001", "Citra Dewi", 2018, 7000000, 4.0, "Senior", 20));
        employees.add(new Developer("D002", "Eko Prasetyo", 2024, 6000000, 2.8, "Mid", 15));
        employees.add(new Manager("M001", "Fitri Handayani", 2015, 10000000, 4.8, "IT", 10));
        employees.add(new Manager("M002", "Galih Putra", 2025, 8500000, 3.5, "HR", 3));

        double totalBudget = 0.0;
        double totalRating = 0.0;
        String highestRatedEmployee = "";
        double highestSalary = 0.0;

        for (Employee emp : employees) {
            emp.displayEmployeeInfo();
            double totalSalary = emp.calculateTotalSalary();

            System.out.println("Total Salary in this mount : " + totalSalary);
            System.out.println("-----------------------------------");

            totalBudget += totalSalary;
            totalRating += emp.getPerformanceRating();

            if (totalSalary > highestSalary) {
                highestSalary = totalSalary;
                highestRatedEmployee = emp.getName();
            }
        }

        double averageRating = totalRating / employees.size();

        System.out.println("Total Budget for salary company: " + totalBudget);
        System.out.println("Average Performance Rating: " + averageRating);
        System.out.println("Highest Rated Employee: " + highestRatedEmployee);
        System.out.println("Highest Salary: " + highestSalary);
    }

}   
