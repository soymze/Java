import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double armutKilo ,elmaKilo ,domatesKilo ,muzKilo ,patlicanKilo;
        double armutFiyat = 2.14, elmaFiyat = 3.64,domatesFiyat = 1.11,muzFiyat = 0.95 ,patlicanFiyat = 5.00;
        double tutar;

        Scanner sc = new Scanner(System.in);

        System.out.println("Kaç kilo armut:");
        armutKilo = sc.nextDouble();
        System.out.println("Kaç kilo elma:");
        elmaKilo = sc.nextDouble();
        System.out.println("Kaç kilo domates:");
        domatesKilo = sc.nextDouble();
        System.out.println("Kaç kilo muz:");
        muzKilo = sc.nextDouble();
        System.out.println("Kaç kilo patlıcan:");
        patlicanKilo = sc.nextDouble();

        tutar = (armutKilo*armutFiyat) +(elmaFiyat*elmaKilo)+(domatesKilo*domatesFiyat)+(muzKilo*muzFiyat)+(patlicanKilo*patlicanFiyat);
        System.out.println("Toplam tutar:"+tutar);

    }
}