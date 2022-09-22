package DZ_5;
/*
 * Дана строка. Необходимо написать метод, который отсортирует слова в строке по длине с помощью TreeMap.
 * Строки с одинаковой длиной не должны “потеряться”.
 * Пример:
 * “Мороз и солнце день чудесный Еще ты дремлешь друг прелестный Пора красавица проснись”
 * Результат:
 * [и], [ты], [Еще], [день, друг, Пора], [Мороз], [солнце], [чудесный, дремлешь, проснись], [красавица], [прелестный]
 */

import java.util.*;
import java.util.Map.Entry;

public class Seminar5_Task_DZ_01 {
    public static void main(String args[]) {
        String line = "Мороз и солнце день чудесный Еще ты дремлешь друг прелестный Пора красавица проснись";
        String[] arr = line.split(" ");
        int n = arr.length;
        arr = sort(arr, n);
        System.out.println("\n"+Arrays.toString(arr));
    }

    static String[] sort(String[] str, int n) {
        TreeMap<Integer, ArrayList<String>> map = new TreeMap<Integer, ArrayList<String>>();
        for (int i = 0; i < n; i++) {
            map.putIfAbsent(str[i].length(),
                    new ArrayList<String>());
            map.get(str[i].length()).add(str[i]);
        }
        System.out.println("\nНесортированный массив\n" + Arrays.toString(str));
        int temp = 0;
        for (Entry<Integer, ArrayList<String>> e : map.entrySet()) {

            for (int i = 0; i < e.getValue().size(); i++) {
                str[temp] = e.getValue().get(i);
                temp++;
            }
        }
        System.out.print(map);
        return str;
    }
}