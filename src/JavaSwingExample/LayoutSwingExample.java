package JavaSwingExample;

import java.util.Scanner;

public class LayoutSwingExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so A");
        int a = scanner.nextInt();
        System.out.println("Nhap vao so B");
        int b = scanner.nextInt();

        System.out.println("Nhap vao option");
        System.out.println("1. Tinh tong a+b");
        System.out.println("2. Tinh hieu a-b");
        System.out.println("3. Tinh tich a*b");
        int ketqua;
        int option = scanner.nextInt();
        switch (option){
            case 1:
                ketqua = a+b;
                break;
            case 2:
                ketqua = a-b;
                break;
            case 3:
                ketqua = a*b;
                break;
            case 4:
                ketqua = a/b;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + option);
        }
        System.out.println("Ket qua la: "+ketqua);
    }
}
