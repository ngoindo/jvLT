package uoc_chung_lon_nhat;

import java.util.Scanner;

public class uoc_chung_lon_nhat {

    // Hàm tìm UCLN
    public static int UCLN(int a, int b) {

        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }

        return a;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap a: ");
        int a = sc.nextInt();

        System.out.print("Nhap b: ");
        int b = sc.nextInt();

        System.out.println("UCLN = " + UCLN(a, b));

        sc.close();
    }
}