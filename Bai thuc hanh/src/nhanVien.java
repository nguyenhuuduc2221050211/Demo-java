import java.util.Scanner;

public class nhanVien {
    public String hoTen , gioiTinh , chucVu ;
    public int tuoi , namSinh ; 
      void nhaphoten(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ho va Ten : ");
        hoTen = sc.nextLine();
      }
      void nhapgioitinh(){
        Scanner sc = new Scanner(System.in);
        System.out.print("gioi tinh : ");
        gioiTinh = sc.nextLine();
      }
      void nhapchucvu(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Chuc vu : ");
        chucVu = sc.nextLine();
      }

      void nhapnamsinh(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nam sinh : ");
        namSinh = sc.nextInt();
      }
      void tinhtuoi(){
        tuoi = 2024 - namSinh ;
      }
         void inthongtin(){
            System.out.println("Ho va ten : "+hoTen);
            System.out.println("gioi tinh : "+gioiTinh);
            System.out.println("chuc vu : "+chucVu);
            System.out.println("tuoi : "+tuoi);
         }
}
