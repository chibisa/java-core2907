package filepath;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BufferWriterExample {
    public static void main(String[] args) throws Exception {
        String filepath = "D:\\javathang7\\data";
        File file = new File(filepath);
        if(file.isFile()) {
            System.out.println(true);
        }else
        {
            System.out.println(false);
            List<File> fileList = Arrays.asList(file.listFiles());
            for(File f: fileList){
                System.out.println(f.getName());
            }
        }

        FileWriter fileWriter = new FileWriter(filepath,true);
        /*BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write("Java Core");
        bufferedWriter.newLine();
        bufferedWriter.write("Python Core");
        //bufferedWriter.flush();
        bufferedWriter.close();
        System.out.println("Done");*/
        PrintWriter printWriter = new PrintWriter(fileWriter);
        printWriter.append("Abc").append("\n").append("Kim anh");
        printWriter.flush();
        System.out.println("Done");
    }
}
