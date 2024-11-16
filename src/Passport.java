public class Passport {
    private String name;
    private String passportNumber;
    private String country;
    private String expirationDate;

    // Konstruktor
    public Passport(String name, String passportNumber, String country, String expirationDate) {
        this.name = name;
        this.passportNumber = passportNumber;
        this.country = country;
        this.expirationDate = expirationDate;
    }

    // Getter-Methoden
    public String getName() {
        return name;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public String getCountry() {
        return country;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    // Setter-Methoden
    public void setName(String name) {
        this.name = name;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    // Methode zur Ausgabe der Passaport-Details
    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Passport Number: " + passportNumber);
        System.out.println("Country: " + country);
        System.out.println("Expiration Date: " + expirationDate);
    }
}
