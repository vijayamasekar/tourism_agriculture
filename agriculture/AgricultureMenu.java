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

        // Repeats the menu until the user chooses Exit.
        do {
            System.out.println("\n==========================================");
            System.out.println("       AGRICULTURE MANAGEMENT SYSTEM");
            System.out.println("==========================================");
            System.out.println("1. Single Inheritance");
            System.out.println("2. Multiple Inheritance");
            System.out.println("3. Multilevel Inheritance");
            System.out.println("4. Hierarchical Inheritance");
            System.out.println("5. Hybrid Inheritance");
            System.out.println("6. Exit");
            System.out.println("==========================================");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            // Runs the selected inheritance demonstration.
            switch (choice) {
                case 1:
                    SingleInheritance.demo();
                    break;

                case 2:
                    MultipleInheritance.demo();
                    break;

                case 3:
                    MultilevelInheritance.demo();
                    break;

                case 4:
                    HierarchicalInheritance.demo();
                    break;

                case 5:
                    HybridInheritance.demo();
                    break;

                case 6:
                    System.out.println(
                            "\nThank you for using Agriculture Management System!");
                    break;

                default:
                    System.out.println(
                            "\nInvalid choice. Please enter a number from 1 to 6.");
            }

        } while (choice != 6);

        // Closes the scanner when the program ends.
        sc.close();
    }}