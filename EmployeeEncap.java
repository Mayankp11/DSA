public class EmployeeEncap {
    private int salary;
    private int hourlyRate;

    public EmployeeEncap(int salary,int hourlyRate){            //constructor is created
        setSalary(salary);
        setHourlyRate(hourlyRate);
    }

    public int CalculateWage(int extraHours){
        return getSalary() + (getHourlyRate() * extraHours);
    }

    private int getSalary() {
        return salary;
    }

    private void setSalary(int salary) {
        if(salary <= 0)
            throw new IllegalArgumentException("Salary should be greater than 0.");
        this.salary = salary;
    }

    private int getHourlyRate() {
        return hourlyRate;
    }

    private void setHourlyRate(int hourlyRate) {
        if(hourlyRate <= 0)
            throw new IllegalArgumentException("Hourly Rate should be more than 0.");
        this.hourlyRate = hourlyRate;
    }
}
