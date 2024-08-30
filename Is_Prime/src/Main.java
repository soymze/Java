import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int input;
        Scanner sc = new Scanner(System.in);

        System.out.println("Sayıyı giriniz:");
        input = sc.nextInt();

        Isprime(input, (input-1));
    }

    static void Isprime(int x, int y){

        if(x == 2){
            System.out.println(x+ " Asaldır");
        }
        if(y != 0 && y != 1){
            if(x % y == 0){
                System.out.println(x+ " Asal değildir");
            }
            else if(y == 2 && x % y != 0){
                System.out.println(x+ " Asaldır");
            }
            else{
                Isprime(x, y-1);
            }
        }

    }
}