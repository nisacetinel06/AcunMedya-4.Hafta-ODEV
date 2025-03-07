package Interface;

// Interface
interface Animal {
    void makeSound(); // Abstract method
}

// Alt sınıf: Köpek
class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Köpek: Hav Hav!");
    }
}

// Alt sınıf: Kedi
class Cat implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Kedi: Miyav Miyav!");
    }
}


