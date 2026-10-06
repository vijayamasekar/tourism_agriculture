// Single Inheritance
// Agriculture Example: Farm -> OrganicFarm

class Farm {
    String farmName;
    String crop;

    void showFarm() {
        System.out.println("Farm Name: " + farmName);
        System.out.println("Crop: " + crop);
    }
}

// OrganicFarm inherits from Farm
class OrganicFarm extends Farm {
    boolean usesNaturalFertilizer;

    void showOrganicFarm() {
        showFarm();
        System.out.println("Uses Natural Fertilizer: "
                + usesNaturalFertilizer);
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        OrganicFarm farm = new OrganicFarm();

        farm.farmName = "Green Farm";
        farm.crop = "Wheat";
        farm.usesNaturalFertilizer = true;

        System.out.println("=== SINGLE INHERITANCE ===");
        farm.showOrganicFarm();
    }
}