package lesson4;

import java.util.Scanner;

public class Java4_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ban hay nhap vao chieu cao cua tam giac");
        int h = scanner.nextInt();
        for (int i=0;i<h;i++){
            for (int k=(h-i);k>0;k--)
                    System.out.print(" ");
            for (int j=0;j<i*2+1;j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
