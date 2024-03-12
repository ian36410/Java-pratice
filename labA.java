import java.io.*;
import java.util.*;
    public class labA{
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            if(n>=1&&n<=100){
                String str=sc.nextLine();
                for(int i=0;i<n;i++){
                    str=sc.nextLine();
                    int output=addnum(str);
                    boolean flag=prime(output);
                    if(str.length()>10){
                        System.out.println("Out");
                    }
                    else 
                        if(flag==true){
                            System.out.println("Yes");
                        }
                    else
                        if(flag==false){
                        System.out.println("No");
                    }
                }
            }
            else{
                System.out.println("Out");
            }
            sc.close();
        }

        public static int addnum(String str) {
            int a=0;
            for(int j=0;j<str.length();j++){
                int b=str.charAt(j);
                a=a+b-'a'+1;
            }
            return a;
        }

        public static boolean prime(int i){
            int k=2;
            boolean prime=false;
            while(k<i){
                if(i%k==0){
                    prime=false;
                    return prime;
                }
                else{
                    prime=true;
                }
                k++;
            }
            return prime;
            
        }

    }