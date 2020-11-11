package lesson2;

import java.util.Scanner;

public class java2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ban hay nhap vao so a");
        int a = scanner.nextInt();
        System.out.println("Ban hay nhap vao so b");
        int b = scanner.nextInt();
        int nguyen = a/b;
        System.out.println(a+"+"+b+"="+(a+b));
        System.out.println(a+"-"+b+"="+(a-b));
        System.out.println(a+"*"+b+"="+(a*b));
        System.out.println(a+"/"+b+"="+nguyen);
        System.out.println(a+"mod"+b+"="+(a%b));
    }
}
