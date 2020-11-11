package lesson4;

import java.util.Scanner;

public class Java4_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ban hay nhap vao so chu so fibonaci");
        int fibo = scanner.nextInt();
        System.out.print("Day so fibonaci ban muon in ra la: "+0+ ", "+1);
        int s1=0;
        int s2=1;
        for(int i =2;i<fibo;i++){
            int s3=s1+s2;
            s1=s2;
            s2=s3;
            System.out.print(", "+s3);
        }
    }
}
