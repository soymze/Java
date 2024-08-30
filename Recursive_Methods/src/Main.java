import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int input;
        Scanner sc = new Scanner(System.in);
        System.out.println("Sayı giriniz:");
        input = sc.nextInt();

        min(input, input);
    }

    static void min(int x, int y){
        while(x >= 0){

            System.out.print(x+" ");
            x-=5;
            if(x < 0){
                max(x,y);
            }
        }

    }

    static void max(int x, int y){
        while(x <= y){
            x+=5;
            System.out.print(x+" ");
            if(x == y){
                break;
            }
        }

    }
}