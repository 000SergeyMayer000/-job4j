package msa;

/**
 * Класс WhileNoBody описывает работу цикла while без тела цикла
 */
public class WhileNoBody {
    public static void main(String[] args) {
        int i, j;
        i = 100;
        j = 200;
// расчитать среднее значение двух чисел
        while (++i < --j) ;// у этого цикла отсутствует тело
        System.out.println(i + " " + j);
    }
}
//пр входе в цикл значение i  увеличиваетя на единицу, а j уменьшается, оба числа сравниаются
// до тех пор пока условие не выдаст false
