/*
 Author         : Vijaya Masekar
 Roll Number    : 2657
 Subject        : Object Oriented Technology
 Assignment     : Agriculture Management System

 DESCRIPTION:
 This is a Menu-Driven Agriculture Management System.
 It allows the user to explore different types of inheritance
 such as Single, Multiple, Multilevel, Hierarchical, and Hybrid
 inheritance using simple agriculture examples.
*/

import java.util.Scanner;

public class AgricultureMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== AGRICULTURE INHERITANCE MENU ===");
            System.out.println("1. Single Inheritance");
            System.out.println("2. Multiple Inheritance");
            System.out.println("3. Multilevel Inheritance");
            System.out.println("4. Hierarchical Inheritance");
            System.out.println("5. Hybrid Inheritance");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    SingleInheritance.main(null);
                    break;

                case 2:
                    MultipleInheritance.main(null);
                    break;

                case 3:
                    MultilevelInheritance.main(null);
                    break;

                case 4:
                    HierarchicalInheritance.main(null);
                    break;

                case 5:
                    HybridInheritance.main(null);
                    break;

                case 6:
                    System.out.println("Program ended.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 6);

        sc.close();
    }
}