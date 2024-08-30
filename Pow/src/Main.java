import java.util.Scanner;

public class Main {

    static int pow(int a, int b){

        if (b == 0) {
            return 1;
        } else {
            return a * pow(a, b - 1);
        }
    }
    public static void main(String[] args) {
        int taban,us;

        Scanner sc = new Scanner(System.in);

        System.out.println("Taban değerini giriniz:");
        taban = sc.nextInt();
        System.out.println("Üs değerini giriniz:");
        us = sc.nextInt();

        System.out.println(pow(taban,us));
    }
}