import java.util.Scanner;

class NhanVien {
    private String ho;
    private String ten;
    private int soSP;

    // Constructor
    public NhanVien(String ho, String ten, int soSP) {
        this.ho = ho;
        this.ten = ten;

        if (soSP >= 0) {
            this.soSP = soSP;
        } else {
            this.soSP = 0;
        }
    }

    // Getter và Setter
    public String getHo() {
        return ho;
    }

    public void setHo(String ho) {
        this.ho = ho;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getSoSP() {
        return soSP;
    }

    public void setSoSP(int soSP) {
        if (soSP >= 0) {
            this.soSP = soSP;
        } else {
            this.soSP = 0;
        }
    }

    // Hàm tính lương
    public double getLuong() {
        double donGia;

        if (soSP >= 1 && soSP <= 199) {
            donGia = 0.5;
        } else if (soSP >= 200 && soSP <= 399) {
            donGia = 0.55;
        } else if (soSP >= 400 && soSP <= 599) {
            donGia = 0.6;
        } else {
            donGia = 0.65;
        }

        return soSP * donGia;
    }

    // Hàm so sánh
    public boolean LonHon(NhanVien nv2) {
        return this.soSP > nv2.soSP;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập nhân viên 1
        System.out.println("Nhap nhan vien 1:");
        System.out.print("Ho: ");
        String ho1 = sc.nextLine();

        System.out.print("Ten: ");
        String ten1 = sc.nextLine();

        System.out.print("So san pham: ");
        int sp1 = sc.nextInt();
        sc.nextLine();

        NhanVien nv1 = new NhanVien(ho1, ten1, sp1);

        // Nhập nhân viên 2
        System.out.println("\nNhap nhan vien 2:");
        System.out.print("Ho: ");
        String ho2 = sc.nextLine();

        System.out.print("Ten: ");
        String ten2 = sc.nextLine();

        System.out.print("So san pham: ");
        int sp2 = sc.nextInt();

        NhanVien nv2 = new NhanVien(ho2, ten2, sp2);

        // Xuất lương
        System.out.println("\nLuong NV1: " + nv1.getLuong());
        System.out.println("Luong NV2: " + nv2.getLuong());

        // So sánh dùng hàm LonHon
        if (nv1.LonHon(nv2)) {
            System.out.println("NV1 co so san pham nhieu hon NV2");
            System.out.println("Nhieu hon: " + (nv1.getSoSP() - nv2.getSoSP()));
        } else {
            System.out.println("NV2 co so san pham nhieu hon NV1");
            System.out.println("Nhieu hon: " + (nv2.getSoSP() - nv1.getSoSP()));
        }

        // So sánh không dùng hàm LonHon
        if (nv1.getSoSP() > nv2.getSoSP()) {
            System.out.println("So sanh thuong: NV1 lon hon");
        } else if (nv1.getSoSP() < nv2.getSoSP()) {
            System.out.println("So sanh thuong: NV2 lon hon");
        } else {
            System.out.println("Hai nhan vien bang nhau");
        }

        sc.close();
    }
}