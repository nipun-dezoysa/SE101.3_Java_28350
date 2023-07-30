public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.setEmpID(1);
        emp1.setEmpName("Bogdan");
        emp1.setEmpDesignation("Mr.");

        Employee emp2 = new Employee();
        emp2.setEmpID(2);
        emp2.setEmpName("Bird");
        emp2.setEmpDesignation("Ms.");

        System.out.println(emp1.getEmpID()+") "+emp1.getEmpDesignation()+emp1.getEmpName());
        System.out.println(emp2.getEmpID()+") "+emp2.getEmpDesignation()+emp2.getEmpName());

    }
}
