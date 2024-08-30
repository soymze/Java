import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int size;
        System.out.println("Dizi boyutunu giriniz:");

        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();

        int[] arr1 = new int[size];

        for(int i=0; i < arr1.length; i++){
            System.out.println("Dizinin "+i+". elemanını giriniz:");
            arr1[i] = sc.nextInt();
        }

        for(int i=0; i < arr1.length; i++){
            System.out.println(arr1[i]);
        }
    }
}