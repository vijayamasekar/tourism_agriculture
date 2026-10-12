
// Single Inheritance: One child class inherits from one parent class.
// Example: ResortHotel inherits properties and methods from Hotel.

class Hotel {
    String name;
    String location;

    // Displays the basic hotel details.
    void showInfo() {
        System.out.println("Hotel Name    : " + name);
        System.out.println("Location      : " + location);
    }
}

class ResortHotel extends Hotel {
    boolean hasPool;

    // Displays inherited hotel details and the swimming pool facility.
    void showResortInfo() {
        showInfo(); // Calls the inherited method from Hotel.

        System.out.println("Swimming Pool : "
                + (hasPool ? "Available" : "Not Available"));
    }
}

public class SingleInheritance {

    // Creates a resort object and displays its information.
    public static void demo() {
        ResortHotel hotel = new ResortHotel();

        // Assigning values to inherited and child-class variables.
        hotel.name = "Beach Resort";
        hotel.location = "Goa";
        hotel.hasPool = true;

        System.out.println("\n========== SINGLE INHERITANCE ==========");
        hotel.showResortInfo();

        System.out.println("\nInheritance: Hotel -> ResortHotel");
    }

    // Allows this example to run independently.
    public static void main(String[] args) {
        demo();
    }
}
