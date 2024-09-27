public class Billing {
    public static void computeBill(double price) {
        double total = price * 1.08;
        System.out.println("The total price for the bill is: $" + total);
    }

    public static void computeBill(double price, int quantity) {
        double total = (price * quantity) * 1.08;
        System.out.println("The total price for the bill is: $" + total);
    }

    public static void computeBill(double price, int quantity, int discount) {
        double total = ((price * quantity) - (price * quantity * discount / 100)) * 1.08;
        System.out.println("The total price for the bill is: $" + total);
    }

    public static void main(String[] args) {
        computeBill(23.2);
        computeBill(23.2, 2);
        computeBill(23.2, 2, 10);
    }
}
