import java.util.Scanner;

public class HinhTron {
    float bankinh;
    float chuVi;
    float dienTich;
    final float PI = 3.14f ;
    void nhapbanKinh(){
        Scanner sc = new Scanner(System.in);
        System.out.print("r =");
        bankinh =sc.nextFloat();
    }
    void tinhchuVi(){
        chuVi = 2 * PI * bankinh ;
    }
    void tinhdienTich(){
        dienTich = PI * bankinh * bankinh;
    }
    void inthongtin(){
        System.out.println("chu vi = " +chuVi);
        System.out.println("dien tich = " +dienTich);
    }
}
