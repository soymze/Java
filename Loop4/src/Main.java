import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int sayi, toplam =0;

        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("Sayı giriniz  :");
            sayi = sc.nextInt();

            if(sayi % 4 == 0){
                toplam += sayi;
                System.out.println(""+sayi);
            }
        }while(sayi % 2 != 1);
        System.out.println("Toplam  :"+toplam);
    }
}