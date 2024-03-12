import java.util.*;

public class lab
{
    public static void printName(String name)
    {
        System.out.println(name);
    }

    public static String setName(String name1,String name2,String name3)
    {
        return name1+name2+name3;
    }

    public static void main(String args[])
    {
        String name = "HowHow";
        printName(name);
        
        String new_name;
        new_name = setName("HowHow", "Afu", "Sevenfat");
        System.out.println(new_name);
    }
}