import java.util.ArrayList;

// Lớp cha
class StaffMember {
    protected String name;
    protected String address;
    protected String phone;

    public StaffMember(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public double pay() {
        return 0;
    }

    @Override
    public String toString() {
        return "Name: " + name +
               "\nAddress: " + address +
               "\nPhone: " + phone;
    }
}

// Volunteer
class Volunteer extends StaffMember {

    public Volunteer(String name, String address, String phone) {
        super(name, address, phone);
    }

    @Override
    public double pay() {
        return 0;
    }
}

// Employee
class Employee extends StaffMember {
    protected String socialSecurityNumber;
    protected double payRate;

    public Employee(String name, String address, String phone,
                    String ssn, double rate) {

        super(name, address, phone);

        this.socialSecurityNumber = ssn;
        this.payRate = rate;
    }

    @Override
    public double pay() {
        return payRate;
    }

    @Override
    public String toString() {
        return super.toString() +
               "\nSSN: " + socialSecurityNumber;
    }
}

// Executive
class Executive extends Employee {
    private double bonus;

    public Executive(String name, String address, String phone,
                     String ssn, double rate) {

        super(name, address, phone, ssn, rate);

        bonus = 0;
    }

    public void awardBonus(double execBonus) {
        bonus = execBonus;
    }

    @Override
    public double pay() {
        return payRate + bonus;
    }
}

// Hourly
class Hourly extends Employee {
    private int hoursWorked;

    public Hourly(String name, String address, String phone,
                  String ssn, double rate) {

        super(name, address, phone, ssn, rate);

        hoursWorked = 0;
    }

    public void addHours(int moreHours) {
        hoursWorked += moreHours;
    }

    @Override
    public double pay() {
        return payRate * hoursWorked;
    }

    @Override
    public String toString() {
        return super.toString() +
               "\nHours Worked: " + hoursWorked;
    }
}

// Staff
class Staff {
    private ArrayList<StaffMember> staffList;

    public Staff() {

        staffList = new ArrayList<>();

        Volunteer v = new Volunteer(
                "Nguyen Van A",
                "TPHCM",
                "0123456789");

        Executive e = new Executive(
                "Tran Van B",
                "Ha Noi",
                "0987654321",
                "111-11-1111",
                1000);

        e.awardBonus(500);

        Hourly h = new Hourly(
                "Le Van C",
                "Da Nang",
                "0777777777",
                "222-22-2222",
                100);

        h.addHours(40);

        staffList.add(v);
        staffList.add(e);
        staffList.add(h);
    }

    public void payday() {

        for (StaffMember sm : staffList) {

            System.out.println("-------------------");
            System.out.println(sm);

            double amount = sm.pay();

            System.out.println("Luong: " + amount);
        }
    }
}

// Main
public class Main {

    public static void main(String[] args) {

        Staff staff = new Staff();

        staff.payday();
    }
}