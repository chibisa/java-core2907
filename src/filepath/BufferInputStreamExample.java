package filepath;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BufferInputStreamExample {
    public static void main(String[] args){
        String filepath="D:\\javathang7\\data\\test.txt";
        FileInputStream fileInputStream = null;
        BufferedInputStream bufferedInputStream = null;
        try {
            fileInputStream = new FileInputStream(filepath);
            bufferedInputStream = new BufferedInputStream(fileInputStream);
            int i;
            while ((i=bufferedInputStream.read())!=-1) {
                System.out.print((char) i);
            }
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
            if (bufferedInputStream!=null) {
                try {
                    bufferedInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
