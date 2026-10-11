/*
 Author         : Vijaya Masekar
 Roll Number    : 2657
 Subject        : Object Oriented Technology
 Assignment     : Tourism Management System

 DESCRIPTION:
 This is a Menu-Driven Tourism Management System.
 It allows the user to explore different types of inheritance
 such as Single, Multiple, Multilevel, Hierarchical, and Hybrid
 inheritance using simple tourism examples.
*/
import java.util.Scanner;

public class TourismMenu {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        
        do {
            // Display menu
            System.out.println("\n===== TOURISM INHERITANCE MENU =====");
            System.out.println("1. Single Inheritance");
            System.out.println("2. Multiple Inheritance");
            System.out.println("3. Multilevel Inheritance");
            System.out.println("4. Hierarchical Inheritance");
            System.out.println("5. Hybrid Inheritance");
            System.out.println("6. Exit");
            System.out.print("Enter choice (1-6): ");
            
            choice = sc.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.println("\n--- Single Inheritance ---");
                    System.out.println("Hotel -> ResortHotel");
                    System.out.println("Resort inherits from Hotel");
                    break;
                    
                case 2:
                    System.out.println("\n--- Multiple Inheritance ---");
                    System.out.println("EcoResort implements RoomService + FoodService");
                    System.out.println("Uses interfaces for multiple inheritance");
                    break;
                    
                case 3:
                    System.out.println("\n--- Multilevel Inheritance ---");
                    System.out.println("Package -> DomesticPackage -> SpecialPackage");
                    System.out.println("Three levels of inheritance chain");
                    break;
                    
                case 4:
                    System.out.println("\n--- Hierarchical Inheritance ---");
                    System.out.println("TouristPlace -> HillStation, Beach, Heritage");
                    System.out.println("One parent, multiple children");
                    break;
                    
                case 5:
                    System.out.println("\n--- Hybrid Inheritance ---");
                    System.out.println("AdventureResort extends TouristAttraction");
                    System.out.println("AdventureResort implements Adventure + Luxury");
                    break;
                    
                case 6:
                    System.out.println("\nExiting... Thank you!");
                    break;
                    
                default:
                    System.out.println("Invalid choice! Enter 1-6");
            }
            
        } while (choice != 6);
        
        sc.close();
    }
}