package msa.lesson15;

/**
 * класс показывает возможность изминения ссылки в методе
 * при этом сам объект и родительская ссылка не изменилась
 */
    public class TestQQ {
        static void qq(String s) {
            System.out.println(s);
            s = "Что-то новое..."; // Это ссылка или не ссылка меняется ?
            System.out.println(s);
        }

        public static void main(String[] args) {
            String string = "Нельзя менять ссылки?";
            qq(string);
            System.out.println(string);
        }
    }

