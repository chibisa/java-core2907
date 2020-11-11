package lesson4;

public class Java4_4 {
    public static void main(String[] args) {
        System.out.println("Tong cua cac so tu 1 toi 100 la");
        int s=0;
        for (int i=0;i<=100;i++) {
            s=s + i;
        }
            System.out.println(s);
        int i=0;
        s=0;
        do{
            s=s+i;
            i++;
        } while (i<=100);
        System.out.println(s);
        i=0;s=0;
        while (i<=100){
            s=s+i;
            i++;
        }
        System.out.println(s);
    }
}
