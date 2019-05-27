package msa;

public class DoWhile {
    public static void main(String[] args) {
        int n = 10;
        do {
            System.out.println("Такт " + n);
//          n--;
////      } while (n>0);   // или такой вид :
        } while (--n > 0);
    }
}

