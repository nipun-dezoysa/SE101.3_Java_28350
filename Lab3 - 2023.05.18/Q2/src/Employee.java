public class Employee {
    private String name;
    private double salary;
    private double bonus;

    public Employee(double bonus) {
        this.bonus = bonus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public double bonusAmout(){
        return bonus+salary;
    }

    public double getBonus() {
        return bonus;
    }
}
