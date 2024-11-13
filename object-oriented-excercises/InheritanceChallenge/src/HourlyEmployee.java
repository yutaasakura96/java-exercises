public class HourlyEmployee extends Employee{

    private double hourlyPayRate;

    public HourlyEmployee(String name, String birthDate, String endDate, long employeeId, String hireDate, double annualSalary, boolean isRetired) {
        super(name, birthDate, hireDate);
        this.hourlyPayRate = hourlyPayRate;
    }

    public void getDoublePay() {
        hourlyPayRate *= 2;
    }


}
