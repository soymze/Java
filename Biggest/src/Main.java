import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int time, biggest=0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Kaç sayı gireceksiniz :");
        time = sc.nextInt();
        int nums[] = new int[time];

        for (int i=0; i <time; i++){
            System.out.println((i+1)+". sayıyı giriniz :");
            nums[i] = sc.nextInt();
        }


        for (int i=0; i < nums.length-1; i++){
            if(nums[i] > biggest){
                biggest = nums[i];
            }
        }

        int smallest=nums[1];
        for (int i=0; i < nums.length-1; i++){
            if(nums[i+1] < smallest){
                smallest = nums[i+1];
            }
        }
        System.out.println("En büyük sayı :" +biggest);
        System.out.println("En küçük sayı :" +smallest);
    }
}