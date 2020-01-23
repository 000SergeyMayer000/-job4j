package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        int index = 0;
        for (String str : value) {
            if (str.equals(key)) {
                rsl = index;
                break;
            }
            index++;
        }
        if (rsl == -1) {
            throw new ElementNotFoundException("Элемент не найден");
        }
        return rsl;
    }

    public static boolean sent(String value, String[] abuses) throws ElementAbuseException {
        // if contains throw ElementAbuseException
        return true;
    }

    public static void process(String[] values, String key, String[] abuses) {
        try {
            if (indexOf(values, key) != -1) {
                sent(key, abuses);
            }
        } catch (ElementAbuseException ea) {
            ea.printStackTrace();
        } catch (ElementNotFoundException en) {
            en.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }


    public static void main(String[] args) {
        try {
            System.out.println(indexOf(new String[]{"111", "222", "333"}, "444"));
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("после обработки исключения программа продолжает работать");
    }
}
