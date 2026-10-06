// Multiple Inheritance using interfaces
// Agriculture Example: SmartFarm uses Irrigation and Weather services

interface Irrigation {
    void waterPlants();
}

interface WeatherMonitoring {
    void checkWeather();
}

// SmartFarm implements two interfaces
class SmartFarm implements Irrigation, WeatherMonitoring {
    String farmName;

    public void waterPlants() {
        System.out.println(farmName + " uses drip irrigation.");
    }

    public void checkWeather() {
        System.out.println(farmName + " checks weather using sensors.");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        SmartFarm farm = new SmartFarm();
        farm.farmName = "Smart Green Farm";

        System.out.println("=== MULTIPLE INHERITANCE ===");
        farm.waterPlants();
        farm.checkWeather();
    }
}