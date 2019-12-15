package msa.lesson15;

public class Wrapper {
    public static void main(String[] args) {
        int x = 7;
        Integer y = 111;
        x = y; // автораспаковка
        y = x * 123; // автоупаковка
//        Integer a = new Integer(0);
//        Integer b = new Integer(0);
//        System.out.println(a);
//        System.out.println(b);
//        b = a;
//        a = 1;
//        System.out.println(a);
//        System.out.println(b);
    }
}
