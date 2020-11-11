package filepath;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ImageExample {
    public static void main(String[] args) throws Exception {
        FileInputStream reader = new FileInputStream("D:\\sutu.jpg");
        BufferedInputStream bufferedInputStream = new BufferedInputStream(reader);
        FileOutputStream fileOutputStream = new FileOutputStream("D:\\javathang7\\data\\sutu.jpg");
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
        int i;
        long start = System.currentTimeMillis();
        while ((i= bufferedInputStream.read())!=-1){
            bufferedOutputStream.write((i));
        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}
