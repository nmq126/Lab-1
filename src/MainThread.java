import entity.HelperClass;

import java.util.Scanner;

public class MainThread {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HelperClass helperClass = new HelperClass();
        // Lab 1
        double luongThang13 = helperClass.tinhLuongThang13(2, 1);
        System.out.println("Lương tháng 13 là " + luongThang13 + " triệu");
        // Lab 1.2
        System.out.println("Nhập vào độ dài 3 cạnh của tam giác: ");
        System.out.println("Cạnh 1: ");
        double a = scanner.nextDouble();
        System.out.println("Cạnh 2: ");
        double b = scanner.nextDouble();
        System.out.println("Cạnh 3: ");
        double c = scanner.nextDouble();
        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("Độ dài một cạnh tam giác không thể nhỏ hơn hoặc bằng 0");
            return;
        } else if (a + b < c || a + c < b || b + c < a) {
            System.out.println("Tổng hai cạnh của một tam giác luôn phải lớn hơn cạnh còn lại (Theo bất đẳng thức tam giác)");
            return;
        } else {
            System.out.println("Nửa chu vui tam giác là " + helperClass.tinhNuaChuViTamGiac(a, b, c));
        }
        // Lab 1.3
        int[] array = {12, 15, 0, 35, 4, 9};
        helperClass.timMinMax(array);
    }
}
