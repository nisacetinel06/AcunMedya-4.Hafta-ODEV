package Abstract;

// Abstract class
abstract class Vehicle {
    String brand;
    int speed;

    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    abstract void accelerate(); // Alt sınıflar bunu uygulayacak

    public void showInfo() {
        System.out.println("Marka: " + brand + ", Hız: " + speed + " km/h");
    }
}

// Alt sınıf: Araba
class Car extends Vehicle {
    public Car(String brand, int speed) {
        super(brand, speed);
    }

    @Override
    void accelerate() {
        speed += 20;
        System.out.println("Araba hızlandı: " + speed + " km/h");
    }
}

// Alt sınıf: Motosiklet
class Motorcycle extends Vehicle {
    public Motorcycle(String brand, int speed) {
        super(brand, speed);
    }

    @Override
    void accelerate() {
        speed += 15;
        System.out.println("Motosiklet hızlandı: " + speed + " km/h");
    }
}


