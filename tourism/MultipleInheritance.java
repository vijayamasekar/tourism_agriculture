// Multiple Inheritance: A class implements multiple interfaces.
// Java supports multiple inheritance through interfaces.

interface RoomService {
    // Declares the room service operation.
    void provideRoom();
}

interface FoodService {
    // Declares the food service operation.
    void provideFood();
}

// EcoResort implements both service interfaces.
class EcoResort implements RoomService, FoodService {
    String resortName;

    // Provides the room service implementation.
    public void provideRoom() {
        System.out.println("Room Service  : AC rooms available");
    }

    // Provides the food service implementation.
    public void provideFood() {
        System.out.println("Food Service  : Organic food available");
    }
}

public class MultipleInheritance {

    // Creates an eco-resort and demonstrates both services.
    public static void demo() {
        EcoResort resort = new EcoResort();
        resort.resortName = "Green Valley Resort";

        System.out.println("\n========== MULTIPLE INHERITANCE ==========");
        System.out.println("Resort Name   : " + resort.resortName);

        // Calls methods implemented from both interfaces.
        resort.provideRoom();
        resort.provideFood();

        System.out.println("\nInterfaces: RoomService + FoodService");
    }

    // Allows this example to run independently.
    public static void main(String[] args) {
        demo();
    }
}
