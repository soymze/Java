import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int islem;
        double var1,var2,result = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Yapmak istediğiniz işlemi seçiniz:");
        System.out.println("1-Toplama 2-Çıkarma 3-Çarpma 4-Bölme");
        islem = sc.nextInt();
        System.out.println("İlk sayıyı giriniz :");
        var1 = sc.nextDouble();
        System.out.println("İkinci sayıyı giriniz :");
        var2 = sc.nextDouble();

        switch(islem){
            case 1:
                result = var1 + var2;
                System.out.println("İşlem sonucu :"+result);
                break;
            case 2:
                result = var1 - var2;
                System.out.println("İşlem sonucu :"+result);
                break;
            case 3:
                result = var1 * var2;
                System.out.println("İşlem sonucu :"+result);
                break;
            case 4:
                result = var1 / var2;
                System.out.println("İşlem sonucu :"+result);
                break;
            default:
                System.out.println("Hatalı giriş yaptınız!");
        }

    }
}