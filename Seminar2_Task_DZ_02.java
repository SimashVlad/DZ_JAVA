/* Задание 2
   Напишите программу, которая считает, распарсит и выведет в логгер заранее созданный файл с именами, предметами и оценками студентов
   Формат строк в файле:
   Андрей 5
   Алена 5
   Игорь 4
   Формат вывода: Ученик %s получил сегодня %d. */

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParsePosition;
import java.util.logging.Logger;
import java.io.BufferedReader;
import java.io.FileReader;

public class Seminar2_Task_DZ_02 {
    private static Logger L = Logger.getLogger(Seminar2_Task_DZ_01.class.getName());

    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("C:/Users/Начальник/JAVAA/task22.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                String [] array = line.split(" ");
                String stydent = array[0];
                int otmetka = Integer.parseInt(array[1]);
                System.out.printf("Ученик %s получил(а) сегодня %d. \n", stydent, otmetka);
            }
        } catch (IOException e) {
            L.info("Error: " + e);
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                L.info("Error: " + e);
            }
        }
    }
}