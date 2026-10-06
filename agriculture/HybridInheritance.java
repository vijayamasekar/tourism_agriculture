// Hybrid Inheritance
// Combination of class inheritance and interface inheritance
// Agriculture Example: SmartOrganicFarm

interface OrganicMethod {
    void useOrganicFertilizer();
}

interface SmartMethod {
    void useFarmSensors();
}

class Farm {
    String farmName;

    void showFarm() {
        System.out.println("Farm Name: " + farmName);
    }
}

// SmartOrganicFarm extends a class
// and implements two interfaces
class SmartOrganicFarm extends Farm
        implements OrganicMethod, SmartMethod {

    public void useOrganicFertilizer() {
        System.out.println("Uses compost fertilizer.");
    }

    public void useFarmSensors() {
        System.out.println("Uses sensors to monitor soil.");
    }

    void showAll() {
        showFarm();
        useOrganicFertilizer();
        useFarmSensors();
    }
}

public class HybridInheritance {
    public static void main(String[] args) {
        SmartOrganicFarm farm = new SmartOrganicFarm();
        farm.farmName = "Future Agriculture Farm";

        System.out.println("=== HYBRID INHERITANCE ===");
        farm.showAll();
    }
}