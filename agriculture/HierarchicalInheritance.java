// Hierarchical Inheritance
// One parent class has multiple child classes
// Agriculture Example: Farm -> CropFarm and DairyFarm

class Farm {
    String farmName;

    void showFarm() {
        System.out.println("Farm Name: " + farmName);
    }
}

class CropFarm extends Farm {
    String crop;

    void showCropFarm() {
        showFarm();
        System.out.println("Crop: " + crop);
    }
}

class DairyFarm extends Farm {
    int cows;

    void showDairyFarm() {
        showFarm();
        System.out.println("Number of Cows: " + cows);
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        CropFarm cropFarm = new CropFarm();
        cropFarm.farmName = "Green Crop Farm";
        cropFarm.crop = "Corn";

        DairyFarm dairyFarm = new DairyFarm();
        dairyFarm.farmName = "Happy Dairy Farm";
        dairyFarm.cows = 25;

        System.out.println("=== HIERARCHICAL INHERITANCE ===");

        System.out.println("\n[Crop Farm]");
        cropFarm.showCropFarm();

        System.out.println("\n[Dairy Farm]");
        dairyFarm.showDairyFarm();
    }
}