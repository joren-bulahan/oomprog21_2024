import java.util.Scanner;
public class Lease {
    private String name;
    private int apartmentNumber;
    private int rent;
    private int term;

    public Lease() {
        this.name = "XXX";
        this.apartmentNumber = 0;
        this.rent = 1000;
        this.term = 12;
    }

    public Lease(String name, int apartmentNumber, int rent, int term) {
        this.name = name;
        this.apartmentNumber = apartmentNumber;
        this.rent = rent;
        this.term = term;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getApartmentNumber() {
        return apartmentNumber;
    }

    public void setApartmentNumber(int apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    public int getRent() {
        return rent;
    }

    public void setRent(int rent) {
        this.rent = rent;
    }

    public int getTerm() {
        return term;
    }

    public void setTerm(int term) {
        this.term = term;
    }

    public void addPetFee() {
        this.rent += 10;
        explainPetPolicy();
    }

    public static void explainPetPolicy() {
        System.out.println("A pet fee of $10 has been added to the rent. \n" +
                "The pet fee helps cover the costs of cleaning and maintenance.");
    }

    public void showValues() {
        System.out.println("Name: " + this.name);
        System.out.println("Apartment number: " + this.apartmentNumber);
        System.out.println("Rent: $" + this.rent);
        System.out.println("Term: " + this.term + " months");
    }
}

class TestLease {
    public static void main(String[] args) {
        Lease lease1 = new Lease();
        Lease lease2 = getData();
        Lease lease3 = getData();
        Lease lease 4 = new Lease();

        showValues(lease1);
        addPetFee(lease1);
        showValues(lease1);

        showValues(lease2);
        showValues(lease3);
        showValues(lease4);
    }

    public static Lease getData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter apartment number: ");
        int apartmentNumber = scanner.nextInt();
        System.out.print("Enter rent: ");
        int rent = scanner.nextInt();
        System.out.print("Enter term (in months): ");
        int term = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        return new Lease(name, apartmentNumber, rent, term);
    }
}
