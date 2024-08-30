import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        double boy, kilo, endeks;
        System.out.println("Boyunuzu giriniz   :");
        boy = inp.nextDouble();
        System.out.println("Kilonuzu giriniz   :");
        kilo = inp.nextDouble();
        endeks = kilo / (boy * boy);

        System.out.println("Vücut kitle endeksiniz = " +endeks+".");

    }
}