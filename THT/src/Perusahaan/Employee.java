package Perusahaan;

public class Employee {
    private String name;
    private String employeeID;
    private int yearsOfJoin;
    private double mainSalary;
    private double performanceRating;

    public Employee(String name, String employeeID, int yearsOfJoin, double mainSalary, double performanceRating) {
        this.name = name;
        this.employeeID = employeeID;
        this.yearsOfJoin = yearsOfJoin;
        this.mainSalary = mainSalary;
        this.performanceRating = performanceRating;

        if (performanceRating >= 1.0 && performanceRating <= 5.0) {
            this.performanceRating = performanceRating;
        } else {
            this.performanceRating = 3.0; 
        }
    }

    public String getName() {
        return name;
    }

    public String getEmployeeID() {
        return employeeID;
    }
    public int getYearsOfJoin() {
        return yearsOfJoin;
    }
    public double getMainSalary() {
        return mainSalary;
    }
    public double getPerformanceRating() {
        return performanceRating;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }
    public void setYearsOfJoin(int yearsOfJoin) {
        this.yearsOfJoin = yearsOfJoin;
    }
    public void setMainSalary(double mainSalary) {
        this.mainSalary = mainSalary;
    }
    public void setPerformanceRating(double performanceRating) {
        if (performanceRating >= 1.0 && performanceRating <= 5.0) {
            this.performanceRating = performanceRating;
        } else {
            this.performanceRating = 3.0; 
        }
    }

    public double calculateTotalSalary() {
        int yearRightNow = 2026;
        int yearsOfService = yearRightNow - yearsOfJoin;

        double loyalityBonus = mainSalary * 0.05 * yearsOfService;
        double temporarySalary = mainSalary + loyalityBonus;

        if (performanceRating < 2.5) {
            temporarySalary *= 0.9;
        } 

        return temporarySalary;
    }
    
    public void displayEmployeeInfo() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Years of Join: " + yearsOfJoin);
        System.out.println("Main Salary: " + mainSalary);
        System.out.println("Performance Rating: " + performanceRating);
        System.out.println("Total Salary: " + calculateTotalSalary());
    }
}


