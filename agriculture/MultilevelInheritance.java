// Multilevel Inheritance: A child class inherits from another child class.
// Chain: Crop -> FoodCrop -> OrganicCrop.

class AgricultureCrop {
    String cropName;

    // Displays the crop name.
    void showCrop() {
        System.out.println("Crop Name              : " + cropName);
    }
}

class FoodCrop extends AgricultureCrop {
    String season;

    // Displays inherited crop details and the growing season.
    void showFoodCrop() {
        showCrop();
        System.out.println("Growing Season         : " + season);
    }
}

class OrganicCrop extends FoodCrop {
    boolean chemicalFree;

    // Displays all inherited details and organic status.
    void showOrganicCrop() {
        showFoodCrop();
        System.out.println("Chemical Free           : "
                + (chemicalFree ? "Yes" : "No"));
    }
}

public class MultilevelInheritance {

    // Creates an organic crop and displays its details.
    public static void demo() {
        OrganicCrop crop = new OrganicCrop();

        crop.cropName = "Rice";
        crop.season = "Rainy";
        crop.chemicalFree = true;

        System.out.println("\n========== MULTILEVEL INHERITANCE ==========");
        crop.showOrganicCrop();

        System.out.println(
                "\nAgricultureCrop -> FoodCrop -> OrganicCrop");
    }

    // Allows the example to run independently.
    public static void main(String[] args) {
        demo();
    }
}