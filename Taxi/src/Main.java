import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        double distance, cost;
        double min = 20;
        double opening = 10;
        double perKm = 2.20;
        System.out.println("Gidilen uzaklığı km cinsinden yazınız   :");
        distance = inp.nextDouble();

        cost = opening + (distance * perKm);
        if(cost <= 20){
            cost = 20;
        }
        System.out.println("Ödemeniz gereken ücret = " +cost+"TL");


    }
}