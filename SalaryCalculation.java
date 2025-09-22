import java.util.Scanner;


class Employee {
    String empName, empId, address, mailId, mobileNo;
    double basicPay;

    public Employee(String empName, String empId, String address, String mailId, String mobileNo, double basicPay) {
        this.empName = empName;
        this.empId = empId;
        this.address = address;
        this.mailId = mailId;
        this.mobileNo = mobileNo;
        this.basicPay = basicPay;
    }

    public void generatePaySlip(double daPercent, double hraPercent, double pfPercent, double staffClubPercent) {
        double da = (daPercent / 100) * basicPay;
        double hra = (hraPercent / 100) * basicPay;
        double pf = (pfPercent / 100) * basicPay;
        double staffClub = (staffClubPercent / 100) * basicPay;

        double grossSalary = basicPay + da + hra;
        double netSalary = grossSalary - pf - staffClub;

        System.out.println("\n----- PAY SLIP -----");
        System.out.println("Employee Name : " + empName);
        System.out.println("Employee ID : " + empId);
        System.out.println("Address : " + address);
        System.out.println("Email : " + mailId);
        System.out.println("Mobile No : " + mobileNo);
        System.out.println("Basic Pay : " + basicPay);
        System.out.println("DA : " + da);
        System.out.println("HRA : " + hra);
        System.out.println("PF : " + pf);
        System.out.println("Staff Club : " + staffClub);
        System.out.println("Gross Salary : " + grossSalary);
        System.out.println("Net Salary : " + netSalary);
    }
}

// Programmer class
class Programmer extends Employee {
    public Programmer(String empName, String empId, String address, String mailId, String mobileNo, double basicPay) {
        super(empName, empId, address, mailId, mobileNo, basicPay);
    }

    public void calculateSalary() {
        generatePaySlip(97, 10, 12, 0);
    }
}

// Assistant Professor class
class AssistantProfessor extends Employee {
    public AssistantProfessor(String empName, String empId, String address, String mailId, String mobileNo, double basicPay) {
        super(empName, empId, address, mailId, mobileNo, basicPay);
    }

    public void calculateSalary() {
        generatePaySlip(110, 20, 12, 5);
    }
}

// Associate Professor class
class AssociateProfessor extends Employee {
    public AssociateProfessor(String empName, String empId, String address, String mailId, String mobileNo, double basicPay) {
        super(empName, empId, address, mailId, mobileNo, basicPay);
    }

    public void calculateSalary() {                              
                     generatePaySlip(130, 30, 12, 10);
    }
}

// Professor class
class Professor extends Employee {
    public Professor(String empName, String empId, String address, String mailId, String mobileNo, double basicPay) {
        super(empName, empId, address, mailId, mobileNo, basicPay);
    }

    public void calculateSalary() {
        generatePaySlip(140, 40, 12, 15);
    }
}
class labtechnician extends Employee {
    public labtechnician(String empName, String empId, String address, String mailId, String mobileNo, double basicPay) {
        super(empName, empId, address, mailId, mobileNo, basicPay);
    }

    public void calculateSalary() {
        generatePaySlip(70,50,40,5);
    }
}

public class SalaryCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee Name:");
        String name = sc.nextLine();
        System.out.print("Enter Employee ID:");
        String id = sc.nextLine();
        System.out.print("Enter Address:");
        String address = sc.nextLine();
        System.out.print("Enter Mail ID:");
        String mail = sc.nextLine();
        System.out.print("Enter Mobile No:");
        String mobile = sc.nextLine();
        System.out.print("Enter Basic Pay:");
        double basicPay = sc.nextDouble();

        System.out.println("Select Designation:");
        System.out.println("1. Programmer");
        System.out.println("2. Assistant Professor");
        System.out.println("3. Associate Professor");
        System.out.println("4. Professor");
        System.out.println("5. lab technician ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("---programmer  prof slip -----");
                Programmer p = new Programmer(name, id, address, mail, mobile, basicPay);
                p.calculateSalary();
                break;
            case 2:
                System.out.println("---assistant prof slip -----")
                AssistantProfessor ap = new AssistantProfessor(name, id, address, mail, mobile, basicPay);
                ap.calculateSalary();
                break;
            case 3:
            System.out.println("---associate prof slip -----");
                AssociateProfessor asp = new AssociateProfessor(name, id, address, mail, mobile, basicPay);
                asp.calculateSalary();
                break;
            case 4:
                System.out.println("---proffessor  slip -----");
                Professor prof = new Professor(name, id, address, mail, mobile, basicPay);
                prof.calculateSalary();
                break;
                
             case 5:
                System.out.println("---lab technician   slip -----");
                labtechnician labt = new labtechnician(name, id, address, mail, mobile, basicPay);
                labt.calculateSalary();
                break;
            
            default:
                System.out.println("Invalid choice.");
        }

        sc.close();
    }
}
