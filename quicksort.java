import java.util.*;
    public class quicksort{
        public static void main(String[] args) {
            Scanner in=new Scanner(System.in);
            ArrayList<Integer> num=new ArrayList<Integer>();
            while(in.hasNextInt()){
                int content=in.nextInt();
                num.add(content);
            }
            in.close();
            int[] numarr=new int[num.size()];
            for(int i=0;i<numarr.length;i++){
                numarr[i]=num.get(i);
            }
            sort(numarr, 0, numarr.length-1);
            for(int j=0;j<numarr.length;j++){
                System.out.print(numarr[j]+" ");
            }
        }

        public static int partition(int[] n,int front,int end){
            int pivot=n[end];
            int i=front-1;
            for(int j=front;j<end;j++){
                if(n[j]<pivot){
                    i++;
                    int temp1=n[i];
                    n[i]=n[j];
                    n[j]=temp1;
                }
            }
            i++;
            int temp2=n[i];
                    n[i]=n[end];
                    n[end]=temp2;
            return i;
        }

        public static void sort(int[] n,int front,int end){
            if(front<end){
                int pivot=partition(n, front, end);
                sort(n, front, pivot-1);
                sort(n, pivot+1, end);
            }
        }
    }   