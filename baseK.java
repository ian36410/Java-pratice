import java.util.*;
    public class baseK{
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            for(int i=0;i<n;i++){
                int K=sc.nextInt();
                int N=sc.nextInt();
                if(K>=2&&K<=10){
                    if(N>=0&&N<=100000){
                        System.out.println(baseKnum(K,N));
                    }
                }
            }
            sc.close();
        }

        public static long baseKnum(int k,int num){
            int t=0;
            long a=0,b=0,p=0,q=0;
            while(num>=Math.pow(k,t)){
                t++;
            }
            t=t-1;
            for(int j=t;j>=0;j--){
                p=(long)Math.pow(k,j);
                a=num/p;
                num-=a*p;
                q=(long)Math.pow(10,j);
                b+=a*q;
            }
            return b;
        }
    }