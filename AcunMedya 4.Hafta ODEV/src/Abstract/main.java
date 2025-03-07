package Abstract;

public class main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5, 10);
        Shape circle = new Circle(7);

        System.out.println("Dikdörtgen Alanı: " + rectangle.area());
        System.out.println("Dikdörtgen Çevresi: " + rectangle.perimeter());

        System.out.println("Daire Alanı: " + circle.area());
        System.out.println("Daire Çevresi: " + circle.perimeter());

        Vehicle car = new Car("Toyota", 100);
        Vehicle motorcycle = new Motorcycle("Honda", 80);

        car.showInfo();
        car.accelerate();

        motorcycle.showInfo();
        motorcycle.accelerate();
    }
}
