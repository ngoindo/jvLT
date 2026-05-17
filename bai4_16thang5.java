import java.util.Scanner;

class Invoice {

    private String partNumber;
    private String partDescription;
    private int quantity;
    private double price;

    // Constructor
    public Invoice(String partNumber, String partDescription,
                   int quantity, double price) {

        this.partNumber = partNumber;
        this.partDescription = partDescription;

        if (quantity > 0) {
            this.quantity = quantity;
        } else {
            this.quantity = 0;
        }

        if (price > 0) {
            this.price = price;
        } else {
            this.price = 0.0;
        }
    }

    // Getter và Setter
    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {

        if (quantity > 0) {
            this.quantity = quantity;
        } else {
            this.quantity = 0;
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {

        if (price > 0) {
            this.price = price;
        } else {
            this.price = 0.0;
        }
    }

    // Tính tiền hóa đơn
    public double getInvoiceAmount() {
        return quantity * price;
    }
}

public class InvoiceTest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap ma hang: ");
        String ma = sc.nextLine();

        System.out.print("Nhap mo ta: ");
        String mota = sc.nextLine();

        System.out.print("Nhap so luong: ");
        int sl = sc.nextInt();

        System.out.print("Nhap gia: ");
        double gia = sc.nextDouble();

        Invoice hd = new Invoice(ma, mota, sl, gia);

        System.out.println("\n===== HOA DON =====");
        System.out.println("Ma hang: " + hd.getPartNumber());
        System.out.println("Mo ta: " + hd.getPartDescription());
        System.out.println("So luong: " + hd.getQuantity());
        System.out.println("Gia: " + hd.getPrice());

        System.out.println("Tong tien: " + hd.getInvoiceAmount());

        sc.close();
    }
}