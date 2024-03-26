import java.util.Scanner;

public class Employeepartime extends Employee {
    float thuong ;
    public void nhapthuong(){
        Scanner sc = new Scanner(System.in);
        System.out.println(" nhap thuong ");
        thuong = sc.nextFloat();
}
          public void tinhluong(){
            luong = tglam * 20 + thuong ;
          }
          public void inluong(){
            System.out.println("tien luong = "+luong);
          }
          public static void main(String[] args) {
            Employeepartime em = new Employeepartime();
            em.nhapID();
            em.nhapHoTen();
            em.nhapChucVu();
            em.nhapDiaChi();
            em.nhaptglam();
            em.nhapthuong();
            em.tinhluong();
            em.inluong();
            em.inthongtin();
        }
}