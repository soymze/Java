import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        java.lang.String username;
        java.lang.String password, newPass;
        java.lang.String sifre = "java123";
        java.lang.String reset;

        Scanner sc = new Scanner(System.in);

        System.out.println("Kullanıcı adınız:");
        username = sc.nextLine();
        System.out.println("Şifreniz :");
        password = sc.nextLine();

        if(username.equals("java") && password.equals(sifre)){
            System.out.println("Başarılı bir şekilde giriş yaptınız!");
        }else{
            System.out.println("Kullanıcı adı ya da şifre yanlış!");
            System.out.println("Şifrenizi sıfırlamak ister misiniz? (e/h)");
            reset = sc.nextLine();
            if(reset.equals("e")){
                System.out.println("Yeni şifrenizi giriniz:");
                newPass = sc.nextLine();
                if(newPass.equals(sifre)){
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                }else{
                    System.out.println("Şifre oluşturuldu.");
                    sifre = newPass;
                }
            }
        }
    }
}