package filepath;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ReaderOutputStreamExample {
    public static void main(String[] args) throws Exception {
        FileInputStream reader = new FileInputStream("D:\\createFile.txt");
        //BufferedInputStream bufferedInputStream = new BufferedInputStream(reader);
        FileOutputStream fileOutputStream = new FileOutputStream("D:\\javathang7\\data\\createFile.txt");
        //BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
        int i;
        long start = System.currentTimeMillis();
        while ((i= reader.read())!=-1){
            fileOutputStream.write((i));
        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}
