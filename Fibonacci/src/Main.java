import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int sayi,n1=0,n2=1,n3;

        Scanner sc = new Scanner(System.in);

        System.out.println("Sayı giriniz:");
        sayi= sc.nextInt();
        System.out.print(n1+" "+n2);//printing 0 and 1

        for(int i=2;i<sayi;++i)//loop starts from 2 because 0 and 1 are already printed
        {
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }
    }
}