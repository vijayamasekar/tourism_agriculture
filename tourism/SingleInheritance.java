// Single Inheritance - One class inherits from another
// Tourism Example: Hotel -> ResortHotel

class Hotel {
    String name;
    String location;
    
    void showInfo() {
        System.out.println("Hotel: " + name);
        System.out.println("Location: " + location);
    }
}

// ResortHotel inherits from Hotel
class ResortHotel extends Hotel {
    boolean hasPool;
    
    void showResortInfo() {
        showInfo();  // Call parent method
        System.out.println("Has Swimming Pool: " + hasPool);
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        ResortHotel resort = new ResortHotel();
        resort.name = "Beach Resort";
        resort.location = "Goa";
        resort.hasPool = true;
        
        System.out.println("=== SINGLE INHERITANCE ===");
        resort.showResortInfo();
    }
}