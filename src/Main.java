import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PassportManager manager = new PassportManager();

        while (true) {
            System.out.println("\n*** Passport Manager ***");
            System.out.println("1. Add Passport");
            System.out.println("2. View All Passports");
            System.out.println("3. Search Passport");
            System.out.println("4. Edit Passport");
            System.out.println("5. Delete Passport");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // consume the newline

            switch (choice) {
                case 1:
                    // Add a passport
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Passport Number: ");
                    String passportNumber = scanner.nextLine();
                    System.out.print("Enter Country: ");
                    String country = scanner.nextLine();
                    System.out.print("Enter Expiration Date (DD/MM/YYYY): ");
                    String expirationDate = scanner.nextLine();
                    manager.addPassport(new Passport(name, passportNumber, country, expirationDate));
                    System.out.println("Passport added successfully!");
                    break;

                case 2:
                    // View all passports
                    manager.showAllPassports();
                    break;

                case 3:
                    // Search passport
                    System.out.print("Enter Passport Number to Search: ");
                    String searchNumber = scanner.nextLine();
                    Passport foundPassport = manager.searchPassport(searchNumber);
                    if (foundPassport != null) {
                        foundPassport.printDetails();
                    } else {
                        System.out.println("Passport not found.");
                    }
                    break;

                case 4:
                    // Edit passport
                    System.out.print("Enter Passport Number to Edit: ");
                    String editNumber = scanner.nextLine();
                    System.out.print("Enter New Name: ");
                    String newName = scanner.nextLine();
                    System.out.print("Enter New Country: ");
                    String newCountry = scanner.nextLine();
                    System.out.print("Enter New Expiration Date (DD/MM/YYYY): ");
                    String newExpirationDate = scanner.nextLine();
                    boolean edited = manager.editPassport(editNumber, newName, newCountry, newExpirationDate);
                    if (edited) {
                        System.out.println("Passport updated successfully!");
                    } else {
                        System.out.println("Passport not found.");
                    }
                    break;

                case 5:
                    // Delete passport
                    System.out.print("Enter Passport Number to Delete: ");
                    String deleteNumber = scanner.nextLine();
                    boolean deleted = manager.deletePassport(deleteNumber);
                    if (deleted) {
                        System.out.println("Passport deleted successfully!");
                    } else {
                        System.out.println("Passport not found.");
                    }
                    break;

                case 6:
                    // Exit
                    System.out.println("Exiting program...");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
