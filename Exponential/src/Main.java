import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayi, kuvvet, result = 1;

        Scanner sc = new Scanner(System.in);

        System.out.println("Sayıyı giriniz :");
        sayi = sc.nextInt();

        System.out.println("Kuvveti giriniz :");
        kuvvet = sc.nextInt();

        for (int i=1; i <= kuvvet; i++){
            result = result * sayi;
        }

        System.out.println("Sonuç =  "  +result);
    }
}