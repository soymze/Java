import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n1,n2, ebob =0, counter =0, ekok;


        Scanner sc = new Scanner(System.in);

        System.out.println("Birinci sayıyı giriniz :");
        n1 = sc.nextInt();
        System.out.println("İkinci sayıyı giriniz :");
        n2 = sc.nextInt();

        while(counter <= n1){
            if(n1 % counter == 0 && n2 % counter == 0){
                System.out.println(counter);
                ebob = counter;
            }
            counter ++;
        }

        ekok = (n1 * n2) / ebob;
        System.out.println(ekok);
    }
}