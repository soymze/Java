import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sicaklik;

        Scanner sc = new Scanner(System.in);

        System.out.println("Sıcaklığı giriniz!");
        sicaklik = sc.nextInt();


        if(sicaklik < 5){
            System.out.println("Kayak yapabilirsiniz!");
        }else if (sicaklik <=25){
            if(sicaklik < 15){
                System.out.println("Sinemaya gidebilirsiniz!");
            }else{
                System.out.println("Pikniğe gidebilirsiniz!");
            }
        }
        else{
            System.out.println("Yüzmeye gidebilirsiniz!");
        }
    }
}