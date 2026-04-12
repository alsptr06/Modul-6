package Perusahaan;

public class Manager extends Employee{
    private String divition;
    private int members;

    public Manager(String name, String employeeID, int yearsOfJoin, double mainSalary, double performanceRating, String divition, int members) {
        super(name, employeeID, yearsOfJoin, mainSalary, performanceRating);
        this.divition = divition;
        this.members = members;
    }

    public String getDivition() {
        return divition;
    }
    public int getMembers() {
        return members;
    }
    public void setDivition(String divition) {
        this.divition = divition;
    }
    public void setMembers(int members) {
        this.members = members;
    }

    @Override
    public double calculateTotalSalary() {
        double baseSalary = super.calculateTotalSalary();
        double managerialAllowance = 300.000 * members;
        double salaryAfterManagerialAllowance = baseSalary + managerialAllowance;

        if (getPerformanceRating()>4.5) {
            salaryAfterManagerialAllowance *= 1.15;
        }
        

        return salaryAfterManagerialAllowance; 
    }

    @Override
    public void displayEmployeeInfo() {
        super.displayEmployeeInfo();
        System.out.println("Divisi: " + divition);
        System.out.println("Jumlah Anggota: " + members);
    }
}
