import java.util.*;
    public class longestword{
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            String longest="";
            int len=0;
            while(sc.hasNextLine()){
                    String line=sc.nextLine();
                    String[] words=line.toLowerCase().split(" |,|:|;|-|&|!|\\.|\\'|\\(|\\)|\\[|\\]|\\{|\\}");
                for(int i=0;i<words.length;i++){
                    int p=words[i].length();
                    int q=longest.length();
                    if(p>q){
                        longest=words[i];
                        len=words[i].length();
                    }
                    if(p==q){
                        if(longest.compareTo(words[i])>0){
                            longest=words[i];
                            len=words[i].length();
                        }
                    }
                }
            }
            sc.close();
            System.out.println(longest+", "+len);
        }
    }