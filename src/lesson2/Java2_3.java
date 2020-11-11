package lesson2;

import java.util.Scanner;

public class Java2_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ban hay nhap vao mot so");
        int a = scanner.nextInt();
        for(int i=0;i<=10;i++) {
            System.out.println(a + " x " + i + " = " + (a * i));
        }
    }
}
