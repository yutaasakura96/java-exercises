public class SalariedEmployee extends Employee {

    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(String name, String birthDate, String endDate, long employeeId, String hireDate, double annualSalary, boolean isRetired) {
        super(name, birthDate, hireDate);
        this.annualSalary = annualSalary;
        this.isRetired = isRetired;
    }

    public static void main(String[] args) {
        SalariedEmployee salariedEmployee = new SalariedEmployee("John", "1990-01-01", "2020-01-01", 12345, "2015-01-01", 50000.0, false);
    }

    public void retire() {
        isRetired = true;
    }
}