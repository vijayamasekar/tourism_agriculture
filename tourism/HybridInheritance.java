// Hybrid Inheritance: Combination of class inheritance and interfaces.
// AdventureResort extends TouristAttraction and implements two interfaces.

interface Adventure {
    // Declares the adventure activity operation.
    void showAdventure();
}

interface Luxury {
    // Declares the luxury facility operation.
    void showLuxury();
}

class TouristAttraction {
    String name;
    String location;

    // Displays the common attraction details.
    void showAttraction() {
        System.out.println("Resort Name   : " + name);
        System.out.println("Location      : " + location);
    }
}

// Inherits from a class and implements two interfaces.
class AdventureResort extends TouristAttraction
        implements Adventure, Luxury {

    int rating;

    // Implements the adventure activities.
    public void showAdventure() {
        System.out.println("Adventure     : Trekking, Rafting");
    }

    // Implements the luxury facilities.
    public void showLuxury() {
        System.out.println("Luxury        : Spa, Fine Dining");
    }

    // Displays inherited details and both interface features.
    void showAll() {
        showAttraction(); // Calls the inherited method.
        showAdventure();
        showLuxury();
        System.out.println("Rating        : " + rating + "/5");
    }
}

public class HybridInheritance {

    // Creates a resort and displays its complete information.
    public static void demo() {
        AdventureResort resort = new AdventureResort();

        resort.name = "Mountain Adventure Resort";
        resort.location = "Manali";
        resort.rating = 5;

        System.out.println("\n========== HYBRID INHERITANCE ==========");
        resort.showAll();

        System.out.println("\nParent class: TouristAttraction");
        System.out.println("Interfaces: Adventure + Luxury");
    }

    // Allows this example to run independently.
    public static void main(String[] args) {
        demo();
    }
}