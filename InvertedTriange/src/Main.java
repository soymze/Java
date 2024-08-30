import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int lines;

        Scanner sc = new Scanner(System.in);

        System.out.println("Satır sayısını giriniz:");
        lines=sc.nextInt();

        for(int i = 0; i<lines; i++){
            for(int k = (2*(lines-i))-1; k>=1; k--){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}