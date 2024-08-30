import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        int counter;
        int[] arr1 = {15,25,45,54,55,58,58,65,55,25,14,25,15,66,55,25,48,58,55};
        Stack<Integer> s = new Stack<Integer>();


        for(int i=0; i<arr1.length;i++){
            counter=0;
            for(int a=0; a<arr1.length;a++){
                if(arr1[i] == arr1[a])
                    counter++;
            }
            if(!s.contains(arr1[i]))
            System.out.println(arr1[i]+"  sayısı "+counter+" kez tekrar etti.");
            s.push(arr1[i]);
        }
    }
}