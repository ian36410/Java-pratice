import java.util.Scanner;
    public class prime{
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int a=sc.nextInt();
            if(a>=2&&a<=1000000000){
                int n=2;
                while(n<=a){
                    if(a%n==0){
                        System.out.print(n);
                        if(a!=n){
                            System.out.print("*");
                        }
                        a=a/n;
                    }
                    else {
                        n++;
                    }
                }
            }
            sc.close();
        }
    }