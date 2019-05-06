package msa;

public class MinSearch {
    public static void main(String[] args) {
        int array[]={-5, 8, 3, 7, 1, 9, 4, 5, -2, 2, 6};
        int min =array[0];
        for (int i=0; i<array.length; i++){
            if(min>array[i]){
                min=array[i];
            }
        }
        System.out.println(min);
    }
}
