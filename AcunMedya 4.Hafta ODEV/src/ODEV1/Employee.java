package ODEV1;
public class Employee {
    protected int id;
    protected String name;
    protected double salary;
    protected String department;

    public Employee(int id, String name, double salary, String department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public double calculateBonus() {
        return 0;
    }

    public void displayInfo() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Department: " + department);
        System.out.println("Bonus: " + calculateBonus());
    }
}
