import java.util.*;
    public class labB{
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            if(n>=1&&n<=100){
                for(int i=0;i<n;i++){
                    int k=sc.nextInt();
                    if(k>=3&&k<=10000){
                        int a=0,b=0;
                        for(int p=1;p<=k-2;p++){
                            for(int q=p+1;q<=k-1;q++){
                                for(int r=q+1;r<=k;r++){
                                    if(p+q>r&&p+r>q&&q+r>p){
                                        a++;
                                        if(p*p+q*q==r*r||p*p+r*r==q*q||q*q+r*r==p*p){
                                            b++;
                                        }
                                    }
                                }
                            }
                        }
                        System.out.println(a+" "+b);
                    }
                }
            }
            sc.close();
        }
    }