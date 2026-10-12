// Multilevel Inheritance: A class inherits from a child class.
// Inheritance chain: Package -> DomesticPackage -> SpecialPackage.

class Package {
    String packageName;
    int days;

    // Displays the basic package information.
    void showPackage() {
        System.out.println("Package Name  : " + packageName);
        System.out.println("Duration      : " + days + " days");
    }
}

class DomesticPackage extends Package {
    String state;

    // Displays package details and the domestic destination.
    void showDomestic() {
        showPackage(); // Calls the method inherited from Package.
        System.out.println("Destination   : " + state);
    }
}

class SpecialPackage extends DomesticPackage {
    double discount;

    // Displays all inherited details and the special discount.
    void showSpecial() {
        showDomestic(); // Calls the method inherited from DomesticPackage.
        System.out.println("Discount      : " + discount + "%");
    }
}

public class MultilevelInheritance {

    // Creates a special package and displays all its details.
    public static void demo() {
        SpecialPackage pkg = new SpecialPackage();

        // Assigning values from all three inheritance levels.
        pkg.packageName = "Goa Tour";
        pkg.days = 5;
        pkg.state = "Goa";
        pkg.discount = 20;

        System.out.println("\n========== MULTILEVEL INHERITANCE ==========");
        pkg.showSpecial();

        System.out.println(
                "\nPackage -> DomesticPackage -> SpecialPackage");
    }

    // Allows this example to run independently.
    public static void main(String[] args) {
        demo();
    }
}