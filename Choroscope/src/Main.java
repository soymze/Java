import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int birthYear,remaining;

        Scanner sc = new Scanner(System.in);

        System.out.println("Doğum yılınızı giriniz:");
        birthYear = sc.nextInt();
        remaining = birthYear % 12;

        switch (remaining){
            case 0:
                System.out.println("Sizin çin burcunuz, Maymun!");
                break;
            case 1:
                System.out.println("Sizin çin burcunuz, Horoz!");
                break;
            case 2:
                System.out.println("Sizin çin burcunuz, Köpek!");
                break;
            case 3:
                System.out.println("Sizin çin burcunuz, Domuz!");
                break;
            case 4:
                System.out.println("Sizin çin burcunuz, Fare!");
                break;
            case 5:
                System.out.println("Sizin çin burcunuz, Öküz!");
                break;
            case 6:
                System.out.println("Sizin çin burcunuz, Kaplan!");
                break;
            case 7:
                System.out.println("Sizin çin burcunuz, Tavşan!");
                break;
            case 8:
                System.out.println("Sizin çin burcunuz, Ejderha!");
                break;
            case 9:
                System.out.println("Sizin çin burcunuz, Yılan!");
                break;
            case 10:
                System.out.println("Sizin çin burcunuz, At!");
                break;
            case 11:
                System.out.println("Sizin çin burcunuz, Koyun!");
                break;
        }
    }
}