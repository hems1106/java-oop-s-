import java.util.Scanner;

public class ElectricBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter Customer ID: ");
        String customerId = sc.nextLine();

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter Previous Month Reading: ");
        int prevReading = sc.nextInt();

        System.out.print("Enter Current Month Reading: ");
        int currReading = sc.nextInt();

        
        if (currReading < prevReading) {
            System.out.println("Current reading cannot be less than previous reading.");
            return;
        }

        sc.nextLine(); 

        System.out.print("Enter connection type (domestic/commercial): ");
        String type = sc.nextLine().trim();

        int units = currReading - prevReading;
        double bill = 0;

        
        if (type.equalsIgnoreCase("domestic")) {
            if (units <= 100) {
                bill = units * 1;
            } else if (units <= 200) {
                bill = units * 2.50;
            } if (units <= 500) {
                bill = units * 4;
            } else {
                bill = units * 6;
            }
        } 
        else if (type.equalsIgnoreCase("commercial")) {
            if (units <= 100) { 
                bill = units * 2;
            } else if (units <= 200) {
                bill = units * 4.5;
            } else if (units <= 500) {
                bill = units * 6;
            } else {
                bill = units * 7;
            }
        } 
        else {
            System.out.println("Invalid connection type. Please enter 'domestic' or 'commercial'.");
            return;
        }

        // Output
        System.out.println("\n--- Electricity Bill ---");
        System.out.println("Customer ID: " + customerId);
        System.out.println("Customer Name: " + name);
        System.out.println("Previous Reading: " + prevReading);
        System.out.println("Current Reading: " + currReading);
        System.out.println("Units Consumed: " + units);
        System.out.println("Connection Type: " + type);
        System.out.println("Total Bill Amount: ₹" + bill);
    }
}
