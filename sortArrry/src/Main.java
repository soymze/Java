import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

                int size;
                System.out.println("Dizi boyutunu giriniz:");

                Scanner sc = new Scanner(System.in);
                size = sc.nextInt();

                int[] arr1 = new int[size];

                for(int i=0; i < arr1.length; i++){
                    System.out.println("Dizinin "+(i+1)+". elemanını giriniz:");
                    arr1[i] = sc.nextInt();
                }
                System.out.print("Sıralama: ");
                Arrays.sort(arr1);
                for(int i=0; i < arr1.length; i++){
                    System.out.print(arr1[i]+"  ");
                }
    }
}