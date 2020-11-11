package lesson5;

public class Java5_1 {
    public static void main(String[] args) {
        System.out.println("Nhung so Amstrong trong khoang tu 1 toi 500 la");
        for(int i=0;i<9;i++){
            if(i*i*i==i) System.out.print(i +", ");
        }
        for(int i=10;i<99;i++){
            int c=i/10,dv=i%10;
            if(c*c+dv*dv==i) System.out.print(i+", ");
        }
        for (int i=100;i<500;i++)
        {
            int t=i/100,c=(i/10)%10,dv=i%10;
            if(t*t*t+c*c*c+dv*dv*dv==i) System.out.print(i+", ");
        }
    }
}
