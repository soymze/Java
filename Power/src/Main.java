import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int sayi, sayac=1,sayac2=1;

        Scanner sc = new Scanner(System.in);
        System.out.println("Sayıyı giriniz  :");
        sayi = sc.nextInt();
        System.out.println("5'in kuvvetleri :");
        while(sayac < sayi){
            if(sayi % 5 == 0){
                System.out.print(sayac+",");
            }
            sayac *=5;
        }
        System.out.println("");
        System.out.println("4'ün kuvvetleri :");
        while(sayac2 < sayi){
            if(sayi % 4 == 0){
                System.out.print(sayac2+",");
            }
            sayac2 *=4;
        }
    }
}