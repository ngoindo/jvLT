import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class QuanLySinhVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> ds = new ArrayList<>();

        while (true) {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Them sinh vien");
            System.out.println("2. Xuat danh sach");
            System.out.println("3. Sua sinh vien");
            System.out.println("4. Xoa sinh vien");
            System.out.println("5. Tim ten co 'An'");
            System.out.println("6. Sap xep");
            System.out.println("7. Dem so luong");
            System.out.println("0. Thoat");

            System.out.print("Chon: ");
            int chon = sc.nextInt();
            sc.nextLine();

            switch (chon) {
                case 1:
                    System.out.print("Nhap ten SV: ");
                    String ten = sc.nextLine();
                    ds.add(ten);
                    break;

                case 2:
                    System.out.println("Danh sach:");
                    for (String s : ds) {
                        System.out.println(s);
                    }
                    break;

                case 3:
                    System.out.print("Nhap ten can sua: ");
                    String tenSua = sc.nextLine();
                    for (int i = 0; i < ds.size(); i++) {
                        if (ds.get(i).equals(tenSua)) {
                            System.out.print("Nhap ten moi: ");
                            ds.set(i, sc.nextLine());
                        }
                    }
                    break;

                case 4:
                    System.out.print("Nhap ten can xoa: ");
                    String tenXoa = sc.nextLine();
                    ds.removeIf(s -> s.contains(tenXoa));
                    break;

                case 5:
                    System.out.println("SV co 'An':");
                    for (String s : ds) {
                        if (s.contains("An")) {
                            System.out.println(s);
                        }
                    }
                    break;

                case 6:
                    Collections.sort(ds);
                    System.out.println("Da sap xep!");
                    break;

                case 7:
                    System.out.println("So luong SV: " + ds.size());
                    break;

                case 0:
                    System.exit(0);
            }
        }
    }
}