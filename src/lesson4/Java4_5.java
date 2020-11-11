package lesson4;

import java.util.Scanner;

public class Java4_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ban hay nhap vao gia tri tinh luy thua");
        int n= scanner.nextInt();
        int s=1;
        for(int i=1;i<=n;i++)
            s=s*i;
        System.out.println(s);
    }
}

