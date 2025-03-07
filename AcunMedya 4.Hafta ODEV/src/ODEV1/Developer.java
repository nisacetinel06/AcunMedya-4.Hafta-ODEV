package ODEV1;

public class Developer extends Employee {
    private String about;

    public Developer(int id, String name, double salary, String department, String about) {
        super(id, name, salary, department);
        this.about = about;
    }

    @Override
    public double calculateBonus() {
        return salary * 0.1; // Geliştiriciler maaşlarının %10'u kadar prim alır
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("About: " + about);
    }
}
