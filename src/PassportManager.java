import java.util.ArrayList;

public class PassportManager {
    private ArrayList<Passport> passports;

    // Konstruktor
    public PassportManager() {
        passports = new ArrayList<>();
    }

    // Methode zum Hinzufügen eines neuen Passports
    public void addPassport(Passport passport) {
        passports.add(passport);
    }

    // Methode zum Anzeigen aller Passports
    public void showAllPassports() {
        if (passports.isEmpty()) {
            System.out.println("Keine Passports vorhanden.");
        } else {
            System.out.println("Alle gespeicherten Passports:");
            for (Passport passport : passports) {
                System.out.println("******************************");
                passport.printDetails();
                System.out.println("******************************\n");
                break;
            }
        }
    }

    // Methode zum Suchen eines Passports nach Passnummer
    public Passport searchPassport(String passportNumber) {
        for (Passport passport : passports) {
            if (passport.getPassportNumber().equals(passportNumber)) {
                return passport;
            }
        }
        return null; // Rückgabe null, wenn der Pass nicht gefunden wurde
    }

    // Methode zum Löschen eines Passports nach Passnummer
    public boolean deletePassport(String passportNumber) {
        Passport passport = searchPassport(passportNumber);
        if (passport != null) {
            passports.remove(passport);
            return true;
        }
        return false;
    }

    // Methode zum Bearbeiten eines Passports
    public boolean editPassport(String passportNumber, String newName, String newCountry, String newExpirationDate) {
        Passport passport = searchPassport(passportNumber);
        if (passport != null) {
            passport.setName(newName);
            passport.setCountry(newCountry);
            passport.setExpirationDate(newExpirationDate);
            return true;
        }
        return false;
    }
}
