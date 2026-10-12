// Hierarchical Inheritance: Multiple child classes inherit from one parent.
// TouristPlace is the parent of HillStation, Beach, and Heritage.

class TouristPlace {
    String name;
    String state;

    // Displays the common information of a tourist place.
    void showPlace() {
        System.out.println("Place         : " + name);
        System.out.println("State         : " + state);
    }
}

class HillStation extends TouristPlace {
    double height;

    // Displays inherited place details and hill station height.
    void showHillStation() {
        showPlace(); // Calls the inherited method.
        System.out.println("Height        : " + height + " meters");
    }
}

class Beach extends TouristPlace {
    boolean hasWaterSports;

    // Displays inherited place details and water sports availability.
    void showBeach() {
        showPlace(); // Calls the inherited method.

        System.out.println("Water Sports  : "
                + (hasWaterSports ? "Available" : "Not Available"));
    }
}

class Heritage extends TouristPlace {
    int century;

    // Displays inherited place details and historical century.
    void showHeritage() {
        showPlace(); // Calls the inherited method.
        System.out.println("Century       : " + century + "th century");
    }
}

public class HierarchicalInheritance {

    // Creates objects of all three child classes.
    public static void demo() {
        HillStation hill = new HillStation();
        hill.name = "Shimla";
        hill.state = "Himachal Pradesh";
        hill.height = 2205;

        Beach beach = new Beach();
        beach.name = "Baga Beach";
        beach.state = "Goa";
        beach.hasWaterSports = true;

        Heritage heritage = new Heritage();
        heritage.name = "Old Goa Church";
        heritage.state = "Goa";
        heritage.century = 16;

        System.out.println(
                "\n========== HIERARCHICAL INHERITANCE ==========");

        // Displays the details of each child class.
        System.out.println("\n--- Hill Station ---");
        hill.showHillStation();

        System.out.println("\n--- Beach ---");
        beach.showBeach();

        System.out.println("\n--- Heritage Site ---");
        heritage.showHeritage();
    }

    // Allows this example to run independently.
    public static void main(String[] args) {
        demo();
    }
}