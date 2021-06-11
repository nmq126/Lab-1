package entity;

public class HelperClass {
    public double tinhLuongThang13(int a, int b){
        double luong = 0, thuong = 0;
        if (a < 2){
            luong = 10;
        }
        else if (2 <= a && a <= 5){
            luong = 20;
        }
        else {
            luong = 30;
        }
        if (b < 1){
            thuong = luong * 0.3;
        }
        else if (1 <= b && b <= 2){
            thuong = luong * 0.5;
        }
        else if (2 <= b && b <= 5){
            thuong = luong;
        }
        else thuong = luong * 2;
        return  thuong;
    }
    public double tinhNuaChuViTamGiac(double a, double b, double c){
        return (double) (a + b + c) / 2;
    }
    public void timMinMax(int[] a){
        int max = a[0];
        for (int i = 0; i < a.length; i++){
            if (a[i] > max){
                max = a[i];
            }
        }
        System.out.println("Số nguyên lớn nhất: " + max);
        int min = a[0];
        for (int i = 0; i < a.length; i++){
            if (a[i] < min){
                min = a[i];
            }
        }
        System.out.println("Số nguyên nhỏ nhất: " + min);
    }
}
