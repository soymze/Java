import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number,sum=0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Sayıyı giriniz:");
        number = sc.nextInt();

        if(number == 1){
            System.out.println("Mükemmel sayı değildir.");
        }else{
            for(int i=1; i < number; i++){
                if(number % i == 0){
                    sum +=i;
                }
            }
            if(sum == number){
                System.out.println(number+" Mükemmel sayıdır.");
            }else{
                System.out.println(number+" Mükemmel sayı değildir.");
            }
        }
    }
}