package msa.lesson15;


import java.util.Arrays;

public class MinValue {
    public static void main(String[] args) {
        int[] arr = {7, 9, 4, 2, -55, 79, -9, -23, 0, 5};
        System.out.println("Массив до сортировки:" + Arrays.toString(arr));
        int min = arr[0]; //
    int indmin = 0;
    int start = 9;
    int finish = -23;
        for (int i = 0; i < arr.length; i++) {
        if (arr[i] == start) {
            for (int j = i; j < arr.length; j++) {
                if (arr[j] == finish) {
                    break;
                } else {
                    if (arr[j] < min) {
                        min = arr[j];
                        indmin = j;
                    }
                }
            }
        }
    }
        System.out.println(indmin);
}
}


//
//            }
//        }
//        System.out.println("МИнимальное значение - " + min);
//        System.out.println("Индекс минимального значения - " + indmin);
//        int tmp = arr[0];
//        arr[0] = arr[indmin];
//        arr[indmin] = tmp;
//        System.out.println("массив после перестановки минимального эллемента :" + Arrays.toString(arr));
////        MinValue minValue = new MinValue();
////
////        System.out.println(minValue.indexOfMin(9, 0, arr));
//    }

//    public static int indexOfMin(int start, int finish, int[] arr) {
//        int min = 0;
//        int indmin;
//        int start = 9;
//        int finish = 2;
//        for (int i = 0; i < arr.length; i++) {
//            if (start == arr[i]) {
//                for (int j = i; j < arr.length; j++) {
//                    while (arr[j] != finish) {
//                        if (min > arr[j]) {
//                            min = arr[j];
//                            indmin = i;
//
//                        }{break;}
//                    }
//                }
//            }
//        }
//        System.out.println(min);
//    }
//}



