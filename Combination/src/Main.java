import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int var1,var2,result;

        Scanner sc = new Scanner(System.in);

        System.out.println("Birinci değişkeni giriniz:");
        var1 = sc.nextInt();

        System.out.println("İkinci değişkeni giriniz:");
        var2 = sc.nextInt();

        //C(n,r) = n! / (r! * (n-r)!)
        result = getRecursive(var1) / ( getRecursive(var2) * (getRecursive(var1 - var2)));
        System.out.println("Kombinasyon sonucu :"  +result);


    }

    static int getRecursive(int x){
        int result = 1;
        for(int i =1; i <= x; i++){
            result *= i;
        }return result;
    }
}