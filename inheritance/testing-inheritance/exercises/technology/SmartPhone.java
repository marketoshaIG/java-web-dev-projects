import java.util.UUID;
public class SmartPhone extends Computer {

    private String operatingSystem;

    public SmartPhone(String brand, String model, double price, String operatingSystem) {
        super(brand, model, price);
        this.operatingSystem = operatingSystem;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "operatingSystem='" + operatingSystem + '\'' +
                "} " + super.toString();
    }
}