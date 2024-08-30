import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int sayi;
        double result=0.0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Sayıyı giriniz :");
        sayi=sc.nextInt();

        for(double i=1; i<=sayi; i++){
            result += (1/i);
        }

        System.out.println("Sonuç : " +result);
    }
}