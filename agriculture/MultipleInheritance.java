// Multiple Inheritance: A class implements multiple interfaces.
// Java supports multiple inheritance through interfaces.

interface Irrigation {
    // Declares the method for watering crops.
    void waterPlants();
}

interface WeatherMonitoring {
    // Declares the method for checking weather conditions.
    void checkWeather();
}

// SmartFarm implements both interfaces.
class SmartFarm implements Irrigation, WeatherMonitoring {
    String farmName;

    // Implements the irrigation operation.
    public void waterPlants() {
        System.out.println("Irrigation             : Drip irrigation");
    }

    // Implements the weather monitoring operation.
    public void checkWeather() {
        System.out.println("Weather Monitoring     : Sensors active");
    }
}

public class MultipleInheritance {

    // Creates a smart farm and demonstrates both services.
    public static void demo() {
        SmartFarm farm = new SmartFarm();
        farm.farmName = "Smart Green Farm";

        System.out.println("\n========== MULTIPLE INHERITANCE ==========");
        System.out.println("Farm Name              : " + farm.farmName);

        // Calls the methods implemented from both interfaces.
        farm.waterPlants();
        farm.checkWeather();

        System.out.println("\nInterfaces: Irrigation + WeatherMonitoring");
    }

    // Allows the example to run independently.
    public static void main(String[] args) {
        demo();
    }
}
