import java.util.Scanner;
    public class quiz1{
        public static void main(String[] args) {
            Scanner in=new Scanner(System.in);
            boolean flag=false;
            String q=new String("b");
            while(!flag){
                int a=in.nextInt();
                int n=in.nextInt();
                for(int i=1;i<=n;i++){
                    int r=in.nextInt();
                    int m=in.nextInt();
                    a=a-r*m;
                }
                System.out.println(a);
                System.out.println("Continue or Break？");
                String x=in.next();
                flag=x.equals(q);
            }
            in.close();
        }
    }