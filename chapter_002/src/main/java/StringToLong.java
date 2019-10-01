import java.lang.String;

public class StringToLong {
    public static void main(String[] args)
    {
        String str = "11111";
        String str2 = "88888";
        //Conversion using valueOf(String) method
        long num = Long.valueOf(str);
        long num2 = Long.valueOf(str2);
        System.out.println(num+num2);
    }
}