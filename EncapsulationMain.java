public class EncapsulationMain {
    public static void main(String[] args){

    var employee = new EmployeeEncap(500_000,50);

    int wage = employee.CalculateWage(10);
        System.out.println(wage);

    }
}
