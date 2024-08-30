import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int average =0, variable, divide = 0;

        System.out.println("Sayıyı giriniz:  ");
        variable = sc.nextInt();

        for(int i=1; i < variable;i++){
            if(i % 2 == 0 && i % 3 == 0){
                average += i;
                divide++;
            }
        }

        average = average / divide;
        System.out.println("Sonuç: "+average);
    }
}