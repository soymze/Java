import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int[] list = {15,12,788,1,-1,-778,2,0};
        int input;

        Scanner sc = new Scanner(System.in);
        System.out.println("Sayıyı giriniz:");
        input = sc.nextInt();

        int min = list[0];
        int max = list[0];

        for (int i : list) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }

        for (int i : list) {
            if (i > min && i < input) {
                min = i;
            }
            if (i < max && i > input) {
                max = i;
            }
        }

        System.out.println("Minimum Değer " + min);
        System.out.println("Maximum Değer " + max);

    }
}