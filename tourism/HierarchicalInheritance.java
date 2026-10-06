// Hierarchical Inheritance - One parent, multiple children
// Tourism Example: TouristPlace -> HillStation, Beach, Heritage

class TouristPlace {
    String name;
    String state;
    
    void showPlace() {
        System.out.println("Place: " + name);
        System.out.println("State: " + state);
    }
}

class HillStation extends TouristPlace {
    double height;  // Height in meters
    
    void showHillStation() {
        showPlace();
        System.out.println("Height: " + height + " meters");
    }
}

class Beach extends TouristPlace {
    boolean hasWaterSports;
    
    void showBeach() {
        showPlace();
        System.out.println("Water Sports: " + hasWaterSports);
    }
}

class Heritage extends TouristPlace {
    int century;  // Historical century
    
    void showHeritage() {
        showPlace();
        System.out.println("From: " + century + "th century");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        HillStation hill = new HillStation();
        hill.name = "Shimla";
        hill.state = "Himachal Pradesh";
        hill.height = 2205;
        
        Beach beach = new Beach();
        beach.name = "Baga Beach";
        beach.state = "Goa";
        beach.hasWaterSports = true;
        
        System.out.println("=== HIERARCHICAL INHERITANCE ===");
        System.out.println("\n[Hill Station]");
        hill.showHillStation();
        
        System.out.println("\n[Beach]");
        beach.showBeach();
    }
}