package filepath;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjecStreamExample {
    public static void main(String[] args) throws Exception {
        //Ghi du lieu
        FileOutputStream fileOutputStream = new FileOutputStream("D:\\javathang7\\data\\Car.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        Car car = new Car();
        car.setCar(" Huyndai Elantra");
        car.setBienso("30F5454");
        car.setNgaydo("20-10-2020");
        objectOutputStream.writeObject(car);

        FileInputStream fileInputStream = new FileInputStream("D:\\javathang7\\data\\Car.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Car carin =(Car) objectInputStream.readObject();
        System.out.println(carin.toString());
    }
}
