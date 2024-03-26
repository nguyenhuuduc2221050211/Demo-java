import java.util.Scanner;

public class Hinhtrona extends hinhhocb {
    
       float bankinh;
       public Hinhtrona(){
        ten = "hinh tron ";
       }
    public void nhapbankinh(){
        Scanner sc = new Scanner(System.in);
        System.out.println(" nhap ban kinh");
        bankinh = sc.nextFloat();
    }
      public void tinhchuvi(){
        chuvi = 2 * PI * bankinh;
      }
     public void tinhdientich(){
       dientich = PI * bankinh * bankinh;
     }
     public static void main(String[] args) {
        Hinhtrona ht = new Hinhtrona();
        ht.xuatten();
        ht.nhapbankinh();
        ht.tinhchuvi();
        ht.tinhdientich();
        ht.inchuvi();
        ht.indientich();
    }
 }

