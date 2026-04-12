package Perusahaan;

public class Developer extends Employee {
    private String employeeLevel;
    private int totalBugsFixed;

    public Developer(String name, String employeeID, int yearsOfJoin, double mainSalary, double performanceRating, String employeeLevel, int totalBugsFixed) {
        super(name, employeeID, yearsOfJoin, mainSalary, performanceRating);
        this.employeeLevel = employeeLevel;
        this.totalBugsFixed = totalBugsFixed;
    }

    public String getEmployeeLevel() {
        return employeeLevel;
    }

    public int getTotalBugsFixed() {
        return totalBugsFixed;
    }

    public void setEmployeeLevel(String employeeLevel) {
        this.employeeLevel = employeeLevel;
    }
    public void setTotalBugsFixed(int totalBugsFixed) {
        this.totalBugsFixed = totalBugsFixed;
    }

    @Override
    public double calculateTotalSalary() {
        double baseSalary = super.calculateTotalSalary();
        double levelAllowance = 0.0;

        if (employeeLevel.equalsIgnoreCase("junior")) {
            levelAllowance = baseSalary + 0.0;
        }else if (employeeLevel.equalsIgnoreCase("mid")) {
            levelAllowance = baseSalary + 1.500000;
        } else if (employeeLevel.equalsIgnoreCase("senior")) {
            levelAllowance = baseSalary + 3.000000;
        }

        double salaryafterAllowance = baseSalary + levelAllowance;
        double bugBonus = 0;
        if (getPerformanceRating() >=3.0) {
            bugBonus = 50 * totalBugsFixed;
        }

        return salaryafterAllowance + bugBonus;
    }
}
