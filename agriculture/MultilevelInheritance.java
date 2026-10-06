// Multilevel Inheritance
// Agriculture Example: Crop -> FoodCrop -> OrganicCrop

class Crop {
    String cropName;

    void showCrop() {
        System.out.println("Crop Name: " + cropName);
    }
}

class FoodCrop extends Crop {
    String season;

    void showFoodCrop() {
        showCrop();
        System.out.println("Season: " + season);
    }
}

class OrganicCrop extends FoodCrop {
    boolean chemicalFree;

    void showOrganicCrop() {
        showFoodCrop();
        System.out.println("Chemical Free: " + chemicalFree);
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        OrganicCrop crop = new OrganicCrop();

        crop.cropName = "Rice";
        crop.season = "Rainy";
        crop.chemicalFree = true;

        System.out.println("=== MULTILEVEL INHERITANCE ===");
        crop.showOrganicCrop();
    }
}