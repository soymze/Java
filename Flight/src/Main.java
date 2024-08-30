import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    int age,flightType;
    double perKm = 0.10,km,cost;

    Scanner sc = new Scanner(System.in);

        System.out.println("Mesafeyi km türünden giriniz:");
        km=sc.nextInt();
        if(km < 0){
            System.out.println("Hatalı veri girdiniz.");
        }
        else{
            System.out.println("Yaşınızı giriniz:");
            age=sc.nextInt();
            if(age < 0){
                System.out.println("Hatalı veri girdiniz.");
            } else{
                System.out.println("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ):");
                flightType=sc.nextInt();
                if(flightType != 1 && flightType != 2){
                    System.out.println("Hatalı veri girdiniz.");
                }else{
                    cost = km * perKm;

                    if(flightType == 2){
                        cost = cost * 2 * 0.8;
                    }
                    if(age<12){
                        cost = cost * 0.5;
                    }
                    else if(age>=12 && age<=24){
                        cost = cost * 0.9;
                    }
                    else if(age>65){
                        cost = cost * 0.7;
                    }

                    System.out.println("Yolculuğunuzun tahmini tutarı:"+cost+"TL");
                }
            }
        }
    }
}