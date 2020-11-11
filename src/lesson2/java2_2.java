package lesson2;

import java.util.Scanner;

public class java2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ban hay nhap vao so a");
        int a=scanner.nextInt();
        System.out.println("Gia tri tinh ra la"+(a*100+a*10+a+a*10+a+a));
    }
}
