import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.logging.Logger;

/* Пусть дан произвольный список(ArrayList) целых чисел, 
удалить из него четные числа */

public class Seminar3_Task_DZ_2 {
    private static Logger L = Logger.getLogger(Seminar3_Task_DZ_2.class.getName());

    public static void main(String[] args) throws IOException {
        try {
            ArrayList<Integer> array = new ArrayList<>();
            array.add(5);
            array.add(8);
            array.add(19);
            array.add(78);
            array.add(13);
            array.add(7);
            array.add(3);
            array.add(14);
            array.add(33);
            System.out.println("\nЗаполненный массив: " + array);

            for (Iterator<Integer> iterator = array.iterator(); iterator.hasNext();) {
                Integer number = iterator.next();
                if (number % 2 == 0) {
                    System.out.println("Четное число для удаления: " + number);
                    iterator.remove();
                }
            }
            
            System.out.println("Массив без чётных чисел: " + array);
            Collections.sort(array);
            System.out.println("Сортированный массив: " + array);
        } catch (Exception e) {
            L.info("Error: " + e);
        }
    }
}
