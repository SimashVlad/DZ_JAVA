/* Задан целочисленный список ArrayList. 
Найти минимальное, максимальное и среднее из этого списка. */

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Logger;

public class Seminar3_Task_DZ_3 {
    private static Logger L = Logger.getLogger(Seminar3_Task_DZ_1.class.getName());

    public static void main(String[] args) throws IOException{
        try {
            int sum = 0;
            int counter = 0;
            int res = 0;
            ArrayList<Integer> ar = new ArrayList<>();
            ar.add(122);
            ar.add(251);
            ar.add(11);
            ar.add(18);
            ar.add(161);

            for (int iterable_element : ar) {
                sum += iterable_element;
                counter++;
            }
            res = sum / counter;
            System.out.printf("Среднее арифмитическое: %d\n", res);
            System.out.printf("Максимальное: %d\n", Collections.max(ar));
            System.out.printf("Минимальное: %d\n", Collections.min(ar));
        } catch (Exception e) {
            L.info("Error: " + e);
        }

    }
}
