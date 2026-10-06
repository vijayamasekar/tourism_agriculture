// Multiple Inheritance - Using Interfaces (Java way)
// Tourism Example: EcoResort implements 2 interfaces

interface RoomService {
    void provideRoom();
}

interface FoodService {
    void provideFood();
}

// EcoResort uses both interfaces
class EcoResort implements RoomService, FoodService {
    String resortName;
    
    public void provideRoom() {
        System.out.println(resortName + " provides AC rooms");
    }
    
    public void provideFood() {
        System.out.println(resortName + " provides organic food");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        EcoResort resort = new EcoResort();
        resort.resortName = "Green Valley Resort";
        
        System.out.println("=== MULTIPLE INHERITANCE ===");
        resort.provideRoom();
        resort.provideFood();
    }
}