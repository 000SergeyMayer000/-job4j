package msa;




public class Max {
    /**
     * Определяет максимальное значение из 2-х.
     * @param left Первый параметр.
     * @param right Второй параметр.
     * @return Максимальное значение.
//     */
    public int max(int left, int right) {
        return left > right ? left : right;
    }
    /**
     * Определяет максимальное значение из 3-х.
     * @param first Первый параметр.
     * @param second Второй параметр.
     * @param third Третий параметр.
     * @return Максимальное значение.
     */
    public int max(int first, int second, int third) {
        return max(max(first, second), third);
    }
    /**
     * Определяет максимальное значение из 4-х.
     * @param first Первый параметр.
     * @param second Второй параметр.
     * @param third Третий параметр.
     * @param fourth Четвертый параметр.
     * @return Максимальное значение.
     */
    public int max(int first, int second, int third, int fourth) {
        return max(fourth, max(first, second, third));
    }
}