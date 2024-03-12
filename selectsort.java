import java.util.Scanner;
    public class selectsort{
        public static void main(String[] args) {
            Scanner in=new Scanner(System.in);
            int n=in.nextInt(); //輸入陣列長度
            int[] numbers=new int[n]; //宣告陣列
            if(n>=1&&n<=50000){
                for(int m=0;m<=n-1;m++){
                    numbers[m]=in.nextInt(); //輸入陣列內容
                }
                in.close();
                //選擇排序法
                for(int i=0;i<numbers.length;i++){
                    int min_pos=i;
                    for(int j=i+1;j<numbers.length;j++){
                        if(numbers[j]<numbers[min_pos]){
                            min_pos=j;
                        }
                    }
                    int temp=numbers[i];
                    numbers[i]=numbers[min_pos];
                    numbers[min_pos]=temp;
                }
                //印出陣列
                for(int k=0;k<numbers.length;k++){
                    System.out.print(numbers[k]);
                    System.out.print(" ");
                }
            }
            else{
                System.out.println("Out");
            }
        }
    }