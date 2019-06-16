package msa;

public class BearLimak {
    public static void main(String[] args) {
        int a = 4; // Вес Лима
        int b = 7;// Вес Боб
        int let = 0;
        while (a <= b) {
            let++;
            a = a * 3 * let;
            b = b * 2 * let;
            System.out.print("Вес Лима через " + let + " составит " + a + ", а Боба " + b);
            System.out.println();
        }
        System.out.println("Ответ: "+let);
    }
}

