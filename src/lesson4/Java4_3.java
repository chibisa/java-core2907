package lesson4;

import java.util.Scanner;

public class Java4_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao mot so bat ki");
        int a = scanner.nextInt();
        System.out.println("Cac so chia het cho 3 la");
        for (int i=0;i<a;i++){
            if(i % 3 == 0 ){
                System.out.print(i+" ");
            }
        }
        System.out.println("Cac so chia het cho 5 la");
        for (int i=0;i<a;i++){
            if(i % 5 == 0 ){
                System.out.print(i+" ");
            }
        }
        System.out.println("Cac so chia het cho 3 va 5 la");
        for (int i=0;i<a;i++){
            if(i % 3 == 0 && i%5==0){
                System.out.print(i+" ");
            }
        }
    }
}
