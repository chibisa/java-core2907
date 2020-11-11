package lesson5;

import java.util.Scanner;

public class Java5_2 {
    public static void main(String[] args) {
        int a[] = new int[20];
        int b[] = new int[20];
        int index=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ban hay nhap vao so phan tu cua mang");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap phan tu thu " + i);
            a[i] = scanner.nextInt();
        }
        for (int i=0; i<a.length;i++){
            boolean flag = false;
            for(int j=0;j<b.length;j++) {
                if ( b[j]==a[i])  flag=true;
            }
            if (flag==false){
                b[index]=a[i];
                index++;
            }
        }
        for (int i:b) {
            System.out.print(i+"  ");
        }
    }
}