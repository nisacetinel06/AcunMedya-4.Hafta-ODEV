package ODEV1;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager(1, "Nisa Çetinel", 10000, "IT", 5);
        Developer developer = new Developer(2, "Nida Çetinel", 8000, "Software", "Java Developer");

        System.out.println("Manager Info:");
        manager.displayInfo();
        System.out.println();

        System.out.println("Developer Info:");
        developer.displayInfo();
    }
}
