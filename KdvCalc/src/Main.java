import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        double kdv = 0, result;
        int fiyat;
        System.out.println("Fiyatı giriniz:");
        fiyat = inp.nextInt();

        if( fiyat > 0 && fiyat < 1000 ){
            kdv = 0.18;
        }else if (fiyat > 1000){
            kdv = 0.08;
        }
        result = fiyat * kdv;
        System.out.println("Kdv tutarı = " +result);


    }
}