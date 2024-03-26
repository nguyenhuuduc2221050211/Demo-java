import java.util.Scanner;

public class hinhtru extends Hinhtrona{
    public float chieucao;
    public hinhtru(){
        ten= " hinh tru ";
    }
    public void nhapchieucao(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap chieu cao :");
        chieucao = sc.nextFloat();

    }
    
    
    public void tinhthetich(){
        tinhdientich();
        thetich = dientich * chieucao;
        
    }
    public static void main(String[] args) {
        hinhtru ht = new hinhtru();
        ht.xuatten();
        ht.nhapchieucao();
        ht.tinhthetich();
    }
}
