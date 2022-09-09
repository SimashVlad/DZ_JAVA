/* Задание 1
Напишите программу, записывающую 100 раз слово ”ТЕST” в файл. 
Слова должны чередоваться по формату – четная итерация большими буквами, 
нечетные – маленькими
Пример: TESTtestTESTtestTEST…
*/
// для более универсальной программы можно решить с помошью 
// дополнительной переменной с преобразованием регистра: .toUpperCase()-вехний регистр .toLowerCase()- нижний регистр.

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Logger;

public class Seminar2_Task_DZ_01 {
    private static Logger L = Logger.getLogger(Seminar2_Task_DZ_01.class.getName());
    public static void main(String[] args) {
        String text = "";

        for (int i = 0; i < 100; i++) {

            if (i % 2 == 0) {
                text += "TEST";
            } else {
                text += "test";
            }
        }
        L.info(text);

        try {
            File file = new File("C:/Users/Начальник/JAVAA/TEST.txt");

            if(!file.exists())
                file.createNewFile();

            PrintWriter pw = new PrintWriter(file);
            pw.println(text);
            pw.close();
        } catch(IOException e) {
            L.warning( "Error: " + e);
        }
    }
}