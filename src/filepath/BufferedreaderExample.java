package filepath;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedreaderExample {
    public static void main(String[] args) {
        FileReader file = null;
        try {
            file = new FileReader("D:\\javathang7\\data\\ParkingList.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Khong tin thay file");
        }
        BufferedReader bufferedReader = new BufferedReader(file);
        String line;
        try {
            while((line = bufferedReader.readLine())!=null) {
                System.out.println(line);
                String[] item = line.split("###");
                Car car = new Car();
                car.setCar(item[0].split("=")[1]);
                car.setBienso(item[1].split("=")[1]);
                car.setNgaydo(item[2].split("=")[1]);
                System.out.println("car info"+ car.toString());
            }
        } catch (IOException e) {
            System.out.println("Khong mo duoc file");
        }
    }
}
