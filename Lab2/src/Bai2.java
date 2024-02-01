import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        System.out.print("Nhap so nguyen: ");
        Scanner sc= new Scanner(System.in);
        int n ;
        System.out.print("Nhap so nguyen: ");
        n= sc.nextInt();
        if(n%2==0)
        System.out.print( n+" la so chan.");
        else System.out.print( n+" la so le.");
    }
}