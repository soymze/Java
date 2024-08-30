import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double year;

        Scanner sc = new Scanner(System.in);

        System.out.println("Yılı giriniz:");
        year = sc.nextDouble();

        if(year % 4 == 0){
            System.out.println(year+"artık yıldır");
        }else{
            System.out.println(year+"artık yıl değildir");
        }
    }
}