public class Test {
    public static void main(String[] args) {
//        Employee emp = new Employee();
//        emp.setName("nipun");
//        emp.setAge(22);
//        emp.setSalary(12000.0);
        //with constructor
        Employee emp = new Employee("nipun",22,12000.0);

        System.out.println("Name:"+emp.getName()+" Age:"+emp.getAge()+" Salary:"+emp.getSalary());
    }
}
