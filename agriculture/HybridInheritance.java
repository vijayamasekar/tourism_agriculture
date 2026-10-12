// Hybrid Inheritance: Combination of class inheritance and interfaces.
// SmartOrganicFarm extends a parent class and implements two interfaces.

interface OrganicMethod {
    // Declares the organic fertilizer operation.
    void useOrganicFertilizer();
}

interface SmartMethod {
    // Declares the farm sensor operation.
    void useFarmSensors();
}

class HybridFarm {
    String farmName;

    // Displays the common farm information.
    void showFarm() {
        System.out.println("Farm Name              : " + farmName);
    }
}

// Inherits from HybridFarm and implements both interfaces.
class SmartOrganicFarm extends HybridFarm
        implements OrganicMethod, SmartMethod {

    // Implements the organic fertilizer operation.
    public void useOrganicFertilizer() {
        System.out.println("Organic Fertilizer     : Compost used");
    }

    // Implements the smart farming operation.
    public void useFarmSensors() {
        System.out.println("Farm Sensors           : Soil monitoring active");
    }

    // Displays inherited details and both interface operations.
    void showAll() {
        showFarm();
        useOrganicFertilizer();
        useFarmSensors();
    }
}

public class HybridInheritance {

    // Creates a smart organic farm and displays its details.
    public static void demo() {
        SmartOrganicFarm farm = new SmartOrganicFarm();
        farm.farmName = "Future Agriculture Farm";

        System.out.println("\n========== HYBRID INHERITANCE ==========");
        farm.showAll();

        System.out.println("\nParent Class: HybridFarm");
        System.out.println("Interfaces: OrganicMethod + SmartMethod");
    }

    // Allows the example to run independently.
    public static void main(String[] args) {
        demo();
    }
}