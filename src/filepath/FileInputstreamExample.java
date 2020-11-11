package filepath;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputstreamExample {
    public static void main(String[] args){
        String filepath="D:\\javathang7\\data\\test.txt";
        FileInputStream fileInputStream = null;

        try {
            fileInputStream = new FileInputStream(filepath);
            int i;
            while ((i=fileInputStream.read())!=-1) {
                System.out.print((char) i);
            }
            fileInputStream.close();
        } catch (FileNotFoundException e) {
            System.out.println("Lam gi co file ma doc");
        } catch (IOException e) {
            System.out.println("Khong the doc duoc noi dung");
        }
        finally {
            if (fileInputStream!=null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
