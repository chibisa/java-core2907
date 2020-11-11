package lesson5;

import java.util.Arrays;
import java.util.Scanner;

public class Java5_3 {
    public static void main(String[] args) {
        int a[] = new int[10]; int b[] = new int[10];int c[] = new int[30];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ban hay nhap vao so phan tu cua mang thu 1: ");
        int n= scanner.nextInt();
        for(int i=0;i<n;i++){
            a[i]= scanner.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]+ " ");
        }
        System.out.println("Ban hay nhap vao so phan tu cua mang thu 2: ");
        int m= scanner.nextInt();
        for(int i=0;i<m;i++){
            b[i]= scanner.nextInt();
        }
        for(int i=0;i<m;i++){
            System.out.print(b[i]+" ");
        }
        /*for(int i=0;i<a.length;i++){
            c[i]=a[i];
        }
        int index = 0;
        for(int i=a.length;i<a.length+b.length;i++){
            c[i]=b[index];
            index++;
        }
        for (int i:c) {
            System.out.println(i +" ");
        }
*/
        System.out.println();
        System.arraycopy(a, 0, c, 0, a.length);
        System.arraycopy(b, 0, c, a.length, b.length);
        System.out.println(Arrays.toString(c));
        for (int i:c) {
            System.out.print(i +" ");
        }
    }
}
