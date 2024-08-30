import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int sayi, result=0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Sayıyı giriniz:");
        sayi = sc.nextInt();

        while(sayi > 0){
            result += sayi % 10;
            sayi /= 10;
        }

        System.out.println("Sonuç:" +result);
    }
}