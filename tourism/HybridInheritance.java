// Hybrid Inheritance - Combination of different types
// Tourism Example: Attraction + Interfaces

interface Adventure {
    void showAdventure();
}

interface Luxury {
    void showLuxury();
}

class TouristAttraction {
    String name;
    String location;
    
    void showAttraction() {
        System.out.println("Name: " + name);
        System.out.println("Location: " + location);
    }
}

// Hybrid: extends class + implements interfaces
class AdventureResort extends TouristAttraction implements Adventure, Luxury {
    int rating;
    
    public void showAdventure() {
        System.out.println("Adventure: Trekking, Rafting");
    }
    
    public void showLuxury() {
        System.out.println("Luxury: Spa, Fine Dining");
    }
    
    void showAll() {
        showAttraction();
        showAdventure();
        showLuxury();
        System.out.println("Rating: " + rating + "/5");
    }
}

public class HybridInheritance {
    public static void main(String[] args) {
        AdventureResort resort = new AdventureResort();
        resort.name = "Mountain Adventure Resort";
        resort.location = "Manali";
        resort.rating = 5;
        
        System.out.println("=== HYBRID INHERITANCE ===");
        resort.showAll();
    }
}