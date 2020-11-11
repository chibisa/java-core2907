package filepath;

import java.io.Serializable;

public class Car implements Serializable {
    private String car;
    private String Bienso;
    private String Ngaydo;

    public Car() {
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    public String getBienso() {
        return Bienso;
    }

    public void setBienso(String bienso) {
        Bienso = bienso;
    }

    public String getNgaydo() {
        return Ngaydo;
    }

    public void setNgaydo(String ngaydo) {
        Ngaydo = ngaydo;
    }

    @Override
    public String toString() {
        return "Car{" +
                "car='" + car + '\'' +
                ", Bienso='" + Bienso + '\'' +
                ", Ngaydo='" + Ngaydo + '\'' +
                '}';
    }
}
