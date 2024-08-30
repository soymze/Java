import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b, c, s1 = 0, s2 = 0, s3 = 0;


        Scanner sc = new Scanner(System.in);

        System.out.println("Birinci sayıyı giriniz:");
        a = sc.nextInt();
        System.out.println("İkinci sayıyı giriniz:");
        b = sc.nextInt();
        System.out.println("Üçüncü sayıyı giriniz:");
        c = sc.nextInt();

        if(a>b){
            if(a>c){
                s1=a;
                if(b>c){
                    s2 = b;
                    s3= c;
                }
                else{
                    s3 = b;
                    s2= c;
                }
            }
            else{
                s1=c;
                s2=a;
                s3=b;
            }
        }
        else if(b>a){
            if(b>c){
                s1=b;
                if(a>c){
                    s2 = a;
                    s3= c;
                }
                else{
                    s3 = a;
                    s2= c;
                }
            }
            else{
                s1=c;
                s2=b;
                s3=a;
            }
        }
        else if(c>a){
            if(c>b){
                s1=c;
                if(a>b){
                    s2 = a;
                    s3= b;
                }
                else{
                    s3 = a;
                    s2= b;
                }
            }
            else{
                s1=b;
                s2=c;
                s3=a;
            }
        }


        System.out.println("Sonuç:"+s1+","+s2+","+s3);

        }
    }