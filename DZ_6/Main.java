package DZ_6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/*
 * Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
 * Создать множество ноутбуков.
 * Реализовать методы фильтрации-сортировки ноутбуки их первоначального множества и вывести проходящие по условиям. 
 * Сделать так, как мы обсуждали на семинаре (M - V - C)
 */
public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // pc_Service ps = new pc_Service();
        pc_class pc_Lenovo = new pc_class(1, "G505", "Lenovo", 4, "NVIDIA", 4, 512);
        pc_class pc_LIME = new pc_class(2, "Start 200", "LIME", 8, "AMD", 6, 256);
        pc_class pc_Norbel = new pc_class(3, "C728427Ц", "Norbel ", 6, "GeForce", 8, 1024);

        // ps.Print(pc_Lenovo); // печать внутренних данных
        // ps.Print(pc_LIME);
        // ps.Print(pc_Norbel);
        var pc_Hash = new HashSet<pc_class>(Arrays.asList(pc_Lenovo, pc_LIME, pc_Norbel));
        // System.out.println(pc_class.contains(pc_Lenovo)); // проверка есть ли такой
        // список данных
        // System.out.println(pc_class.size()); // сколько записей хринится
        System.out.println("\n" + pc_Hash + "\n"); // печать всей коллекции

        
        Iterator it = pc_Hash.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());

        }
    }
}
