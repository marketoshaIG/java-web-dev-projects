import java.util.UUID;
public class Program {
    public static void main(String[] args) {
        Computer computer = new Computer("Dell", "Inspiron", 1000.00);
        System.out.println(computer);

        Laptop laptop = new Laptop("Apple", "MacBook Pro", 2000.00, 13.3);
        System.out.println(laptop);

        SmartPhone smartphone = new SmartPhone("Samsung", "Galaxy S22", 1500.00, "Android");
    }
}
