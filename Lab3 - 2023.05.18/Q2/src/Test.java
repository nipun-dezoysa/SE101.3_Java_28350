public class Test {
    public static void main(String[] args) {
        Employee emp = new Employee(10000.0);
        emp.setName("Bogdan");
        emp.setSalary(50000.0);
        System.out.println("Employee Name: "+emp.getName());
        System.out.println("Basic Salary: "+emp.getSalary());
        System.out.println("Bonus: "+emp.getBonus());
        System.out.println("Bonus Amount: "+emp.bonusAmout());
    }
}
