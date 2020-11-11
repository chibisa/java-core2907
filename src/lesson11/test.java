package lesson11;

import javax.swing.*;

public class test {
    public static void main(String[] args) {
        tinhhaiso Tinhhaiso = new tinhhaiso();
        Tinhhaiso.setSize(450,300);
        Tinhhaiso.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Tinhhaiso.setVisible(true);
    }
    public String Tinhphuongtrinh(int avalue, int bvalue){
        String pt;
        if(avalue==0) {
            pt = "Phuong trinh vo nghiem";
        }
        else if (bvalue==0) pt= "x=0";
        else if((avalue==0)&&(bvalue==0)) pt="Phuong trinh vo so nghiem";
        else pt = String.valueOf(-bvalue/avalue);
        return pt;
    }
    public static int UCLNfunction(int a, int b) {
        int temp1 = a;
        int temp2 = b;
        while (temp1 != temp2) {
            if (temp1 > temp2) {
                temp1 -= temp2;
            } else {
                temp2 -= temp1;
            }
        }
        int uscln = temp1;
        return uscln;
    }
    public int BCNNfunction(int a, int b) {
        return (a * b) / UCLNfunction(a, b);
    }

}
