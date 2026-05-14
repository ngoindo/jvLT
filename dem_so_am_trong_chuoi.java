package dem_so_am_trong_chuoi;

public class dem_so_am_trong_chuoi {

    // Hàm tìm số âm trong chuỗi
    public static void NegativeNumberInStrings(String str) {

        String[] arr = str.split("[a-zA-Z]+");

        for (String s : arr) {

            if (s.matches("-\\d+")) {
                System.out.println(s);
            }
        }
    }

    public static void main(String[] args) {

        String str = "abc-5xyz-12k9l--p";

        System.out.println("Cac so am trong chuoi:");

        NegativeNumberInStrings(str);
    }
}