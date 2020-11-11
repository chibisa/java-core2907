package lesson10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.InputMismatchException;
public class SinhVien {
    private String Masv;
    private String name;
    private int mark;
    private String xeploai;
    ArrayList<SinhVien> st; int n;
    public SinhVien(String masv, String name, int mark, String xeploai) {
        Masv = masv;
        this.name = name;
        this.mark = mark;
        this.xeploai = xeploai;
    }
    public SinhVien(){}

    public String getMasv() {
        return Masv;
    }

    public String getName() {
        return name;
    }

    public int getMark() {
        return mark;
    }

    public String getXeploai() {
        return xeploai;
    }

    public void setMasv(String masv) {
        Masv = masv;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public void setXeploai(String xeploai) {
        this.xeploai = xeploai;
    }
    /*public void NhapSinhVien() {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Ban hay nhap vao so sinh vien");
        int n = scanner1.nextInt();
        int i = 0;scanner1.nextLine();
        st = new ArrayList<>();
        while (i < n) {
            System.out.println("Ban hay nhap vao ma sinh vien");
            Masv = scanner1.nextLine();
            while ( Masv.isEmpty()||Masv.matches(" " )) {
                System.out.println("Khong duoc de trong Ma sinh vien");
                Masv = scanner1.nextLine();
            }

            System.out.println("Ban hay nhap vao ten sinh vien");
            name = scanner1.nextLine();
            while ( name.isEmpty()||name.matches(" " )) {
                System.out.println("Khong duoc de trong ten sinh vien");
                name = scanner1.nextLine();
            }

            System.out.println("Ban hay nhap vao diem sinh vien");
            while (true) {
                try {
                    Scanner scanner = new Scanner(System.in);
                    mark = scanner.nextInt();
                    while ((mark < 0) || (mark > 10)) {
                        System.out.println("Nhap sai gioi han roi, nhap lai di");
                        mark = scanner.nextInt();
                    }
                    if ((mark <= 10) && (mark >= 0)) {
                        if (mark >= 8) { xeploai = "gioi";
                        } else if ((mark < 8) && (mark >= 7)) xeploai = "kha";
                        else if ((mark < 7) && (mark >= 5)) xeploai = "trung binh";
                        else if (mark < 5) xeploai = "kem";
                        else System.out.println("Khong the xep loai");
                        break;
                    }

                } catch (InputMismatchException ex) {
                    System.out.println("Yeu cau nhap so vao");
                } catch (NullPointerException ex) {
                    System.out.println("Khong duoc de trong gia tri");
                } catch (NumberFormatException ex) {
                    System.out.println("NHap sai dinh dang roi. NHap lai di");
                } catch (Exception ex) {
                    System.out.println("Co loi xay ra");
                }
            }
                    i++;
                st.add(new SinhVien(Masv,name,mark,xeploai));
                }

            }*/
    public void NhapSinhVien() {
        Scanner scanner1 = null;
        System.out.println("Ban hay nhap vao so sinh vien");
        scanner1=new Scanner(System.in);
        int n = scanner1.nextInt();
        int i = 0;scanner1.nextLine();
        st = new ArrayList<>();
        while (i < n) {
            System.out.println("Ban hay nhap vao ma sinh vien");
            try{
            Masv = scanner1.nextLine();
            while ( Masv.isEmpty()||Masv.matches(" " )) {
                System.out.println("Khong duoc de trong Ma sinh vien");
                Masv = scanner1.nextLine();
                }
            }catch(Exception ex){
                System.out.println("Nhap sai kieu roi kia ban oi");
            }

            System.out.println("Ban hay nhap vao ten sinh vien");
            name = scanner1.nextLine();
            while ( name.isEmpty()||name.matches(" " )) {
                System.out.println("Khong duoc de trong ten sinh vien");
                name = scanner1.nextLine();
            }

            System.out.println("Ban hay nhap vao diem sinh vien");
            while (true) {
                try {
                    Scanner scanner = new Scanner(System.in);
                    mark = scanner.nextInt();
                    while ((mark < 0) || (mark > 10)) {
                        System.out.println("Nhap sai gioi han roi, nhap lai di");
                        mark = scanner.nextInt();
                    }
                    if ((mark <= 10) && (mark >= 0)) {
                        if (mark >= 8) { xeploai = "gioi";
                        } else if ((mark < 8) && (mark >= 7)) xeploai = "kha";
                        else if ((mark < 7) && (mark >= 5)) xeploai = "trung binh";
                        else if (mark < 5) xeploai = "kem";
                        else System.out.println("Khong the xep loai");
                        break;
                    }

                } catch (InputMismatchException ex) {
                    System.out.println("Yeu cau nhap so vao");
                } catch (NullPointerException ex) {
                    System.out.println("Khong duoc de trong gia tri");
                } catch (NumberFormatException ex) {
                    System.out.println("NHap sai dinh dang roi. NHap lai di");
                } catch (Exception ex) {
                    System.out.println("Co loi xay ra");
                }
                finally {
                    System.out.println("Ban nhap dung chúng ta se dung lai va dong scanner");
                    //scanner1.close();
                }
            }
            i++;
            st.add(new SinhVien(Masv,name,mark,xeploai));
        }

    }
    /*public void NhapSinhVien() throws Exception {
        st = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ban muon nhap bao nhieu sinh vien");
        n = scanner.nextInt();
        scanner.nextLine();
        int i = 0;
        while (i < n) {
            System.out.println("Ban hay nhap vao Ma sinh vien");
            Masv = scanner.nextLine();
            System.out.println("Ban hay nhap vao ten sinh vien");
            name = scanner.nextLine();
            System.out.println("Ban hay nhap vao diem sinh vien");
            mark = scanner.nextInt();
            if ((mark <= 10) && (mark >= 0)) {
                if (mark >= 8) {
                    xeploai = "gioi";
                } else if ((mark < 8) && (mark >= 7)) xeploai = "kha";
                else if ((mark < 7) && (mark >= 5)) xeploai = "trung binh";
                else if (mark < 5) xeploai = "kem";
                else System.out.println("Khong the xep loai");
                scanner.nextLine();
            }
            st.add(new SinhVien(Masv, name, mark, xeploai));
            i++;
        }
    }*/
/*    public void NhapSinhVien(){
        st = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ban muon nhap bao nhieu sinh vien");
        n = scanner.nextInt();
        scanner.nextLine();
        int i = 0;
        while (i < n) {
            System.out.println("Ban hay nhap vao Ma sinh vien");
            Masv = scanner.nextLine();
            System.out.println("Ban hay nhap vao ten sinh vien");
            name = scanner.nextLine();
            System.out.println("Ban hay nhap vao diem sinh vien");
            try {
                mark = scanner.nextInt();
            } catch (InputMismatchException ex){
                System.out.println("InputMismatchException"+ex);
                throw ex;
            }catch(Exception ex){
                System.out.println("Exception" +ex);
                throw ex;
            }
            if ((mark <= 10) && (mark >= 0)) {
                if (mark >= 8) {
                    xeploai = "gioi";
                } else if ((mark < 8) && (mark >= 7)) xeploai = "kha";
                else if ((mark < 7) && (mark >= 5)) xeploai = "trung binh";
                else if (mark < 5) xeploai = "kem";
                else System.out.println("Khong the xep loai");
                scanner.nextLine();
            }
            st.add(new SinhVien(Masv, name, mark, xeploai));
            i++;
        }
    }*/
    @Override
    public String toString() {
        return "SinhVien{" +
                "Masv='" + Masv + '\'' +
                ", name='" + name + '\'' +
                ", mark=" + mark +
                ", xeploai='" + xeploai + '\'' +
                '}';
    }

    public static void main (String[]args) {
            SinhVien sv = new SinhVien();
            /*do {
                try {
                    sv.NhapSinhVien();

                } catch (InputMismatchException e) {
                    System.out.println("Nhap sai kieu du lieu roi nhe! Yeu cau nhap lai");
                } catch (Exception e) {
                    e.printStackTrace();
                }
                for (SinhVien i : sv.st) {
                    System.out.println(i);
                }

            } while (sv.st.size()<sv.n);*/
            sv.NhapSinhVien();
            for (SinhVien i : sv.st) {
                System.out.println(i);
            }
        }
    }
