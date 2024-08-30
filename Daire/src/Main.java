import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        double aci, r, sonuc;
        double pi = 3.14;
        System.out.println("Merkez açı ölçüsünü giriniz   :");
        aci = inp.nextDouble();
        System.out.println("Yarıçap uzunluğunu giriniz   :");
        r = inp.nextDouble();
        sonuc = (pi * (r*r) * aci) / 360;

        System.out.println("Dairenin alanı = " +sonuc+"cm2");


    }
}