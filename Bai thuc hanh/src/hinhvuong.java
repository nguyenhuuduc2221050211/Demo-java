import java.util.Scanner;

public class hinhvuong extends Hinhchunhata {
    float canh ;
    public hinhvuong(){
        ten = " hinh vuong ";
    }
    public void nhapcanh(){
        Scanner sc = new Scanner(System.in);
        System.out.println(" nhap canh");
     canh = sc.nextFloat();
    }
    public void tinhchuvidientich(){
        chuvi = 4 * canh ;
        dientich = canh * canh ;
    }
   public static void main(String[] args) {
    hinhvuong hv = new hinhvuong();
    hv.xuatten();
    hv.nhapcanh();
    hv.tinhchuvidientich();
    hv.inchuvi();
    hv.indientich();
   }
}
