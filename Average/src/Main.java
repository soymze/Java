import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        int kimya, matematik, muzik, fizik, geometri, tarih;



        Scanner imp = new Scanner(System.in);

        System.out.println("Kimya notunuzu giriniz:");
        kimya = imp.nextInt();

        System.out.println("Matematik notunuzu giriniz:");
        matematik = imp.nextInt();

        System.out.println("Müzik notunuzu giriniz:");
        muzik = imp.nextInt();

        System.out.println("Fizik notunuzu giriniz:");
        fizik = imp.nextInt();

        System.out.println("Geometri notunuzu giriniz:");
        geometri = imp.nextInt();

        System.out.println("Tarih notunuzu giriniz:");
        tarih = imp.nextInt();

        int toplam = (kimya + matematik + muzik + fizik + geometri + tarih) / 6;
        boolean sonuc = toplam > 60;
        String message = sonuc ? "Tebrikler, geçtiniz!": "Kaldınız!";
        System.out.println(message);
    }
}