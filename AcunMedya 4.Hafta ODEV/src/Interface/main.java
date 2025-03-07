package Interface;

public class main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.makeSound();
        cat.makeSound();

        Employee engineer = new Engineer();
        Employee accountant = new Accountant();

        engineer.work();
        System.out.println("Mühendis Maaşı: " + engineer.getSalary() + " TL");

        accountant.work();
        System.out.println("Muhasebeci Maaşı: " + accountant.getSalary() + " TL");
    }
}
