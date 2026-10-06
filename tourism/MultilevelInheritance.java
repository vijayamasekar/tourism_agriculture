// Multilevel Inheritance - Chain of inheritance
// Tourism Example: Package -> DomesticPackage -> SpecialPackage

class Package {
    String packageName;
    int days;
    
    void showPackage() {
        System.out.println("Package: " + packageName);
        System.out.println("Duration: " + days + " days");
    }
}

class DomesticPackage extends Package {
    String state;
    
    void showDomestic() {
        showPackage();  // Call parent method
        System.out.println("State: " + state);
    }
}

class SpecialPackage extends DomesticPackage {
    double discount;
    
    void showSpecial() {
        showDomestic();  // Call parent method
        System.out.println("Discount: " + discount + "%");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        SpecialPackage pkg = new SpecialPackage();
        pkg.packageName = "Goa Tour";
        pkg.days = 5;
        pkg.state = "Goa";
        pkg.discount = 20;
        
        System.out.println("=== MULTILEVEL INHERITANCE ===");
        pkg.showSpecial();
    }
}