package Hinhhoc;

import java.util.Scanner;

public class persion {
    int dai;
    float cao;
    String Ten ;
    void nhapThongtin(){
        Scanner sc = new Scanner(System.in);
        System.out.println("chieu dai ");
        dai = sc.nextInt();
        System.out.println(" chieu cao ");
        cao = sc.nextFloat();
    }
     void nhapTen(){
        Scanner sc = new Scanner(System.in);
        System.out.println(" ten ");
        Ten = sc.nextLine();
     }
    void Hienthi(){
        System.out.println(" dai"+dai);
        System.out.println(" cao"+cao);
        System.out.println("ten "+Ten);
    }
    public void Hienthi(String Ten , int dai , float cao ){
       System.out.println(" thong tin xac thuc ");
       System.out.println(" dai"+dai);
        System.out.println(" cao"+cao);
        System.out.println("ten "+Ten);
    }
    public static void main(String[] args) throws Exception {
        persion pc = new persion();
        pc.nhapThongtin();
        pc.nhapTen();
        pc.Hienthi();
        pc.Hienthi("duc",23,5);
}
}
