// Single Inheritance: One child class inherits from one parent class.
// Example: OrganicFarm inherits from Farm.

class SingleFarm {
    String farmName;
    String crop;

    // Displays the basic farm details.
    void showFarm() {
        System.out.println("Farm Name             : " + farmName);
        System.out.println("Crop                   : " + crop);
    }
}

class OrganicFarm extends SingleFarm {
    boolean usesNaturalFertilizer;

    // Displays inherited details and fertilizer information.
    void showOrganicFarm() {
        showFarm();
        System.out.println("Natural Fertilizer     : "
                + (usesNaturalFertilizer ? "Yes" : "No"));
    }
}

public class SingleInheritance {

    // Creates an organic farm and displays its details.
    public static void demo() {
        OrganicFarm farm = new OrganicFarm();

        farm.farmName = "Green Farm";
        farm.crop = "Wheat";
        farm.usesNaturalFertilizer = true;

        System.out.println("\n========== SINGLE INHERITANCE ==========");
        farm.showOrganicFarm();

        System.out.println("\nInheritance: SingleFarm -> OrganicFarm");
    }

    // Allows the example to run independently.
    public static void main(String[] args) {
        demo();
    }
}
