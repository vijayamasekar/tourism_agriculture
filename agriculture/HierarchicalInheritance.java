// Hierarchical Inheritance: Multiple child classes inherit from one parent.
// Example: Farm -> CropFarm and DairyFarm.

class HierarchicalFarm {
    String farmName;

    // Displays the common farm information.
    void showFarm() {
        System.out.println("Farm Name              : " + farmName);
    }
}

class CropFarm extends HierarchicalFarm {
    String crop;

    // Displays inherited farm details and crop information.
    void showCropFarm() {
        showFarm();
        System.out.println("Crop                   : " + crop);
    }
}

class DairyFarm extends HierarchicalFarm {
    int cows;

    // Displays inherited farm details and the number of cows.
    void showDairyFarm() {
        showFarm();
        System.out.println("Number of Cows         : " + cows);
    }
}

public class HierarchicalInheritance {

    // Creates both child-class objects and displays their details.
    public static void demo() {
        CropFarm cropFarm = new CropFarm();
        cropFarm.farmName = "Green Crop Farm";
        cropFarm.crop = "Corn";

        DairyFarm dairyFarm = new DairyFarm();
        dairyFarm.farmName = "Happy Dairy Farm";
        dairyFarm.cows = 25;

        System.out.println(
                "\n========== HIERARCHICAL INHERITANCE ==========");

        // Displays the crop farm information.
        System.out.println("\n--- Crop Farm ---");
        cropFarm.showCropFarm();

        // Displays the dairy farm information.
        System.out.println("\n--- Dairy Farm ---");
        dairyFarm.showDairyFarm();

        System.out.println(
                "\nParent: HierarchicalFarm | Children: CropFarm, DairyFarm");
    }

    // Allows the example to run independently.
    public static void main(String[] args) {
        demo();
    }
}