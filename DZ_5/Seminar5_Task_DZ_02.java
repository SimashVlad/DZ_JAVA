package DZ_5;
/*
* Реализуйте структуру телефонной книги с помощью HashMap, 
* учитывая, что 1 человек может иметь несколько телефонов.
*/

import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class Seminar5_Task_DZ_02 {
    public static void main(String[] args) {
        
        task2();
    }
    private static void task2() {
        Directory directory = new Directory();
        
        directory.add("anton", "1111111111");
        directory.add("anton", "2222222222");
        directory.add("bobov", "33333333333");
        directory.add("bobov", "12345678910");
        directory.add("antonyan", "10987654321");
        directory.add("igoryan", "892111111");
        directory.add("bobov", "8805553535");
        directory.add("smetanov", "8889649845");
        directory.add("igoryan", "8324325275");

        System.out.println(directory.get("anton"));
        System.out.println(directory.get("igoryan"));
        System.out.println(directory.get("bobov"));
        System.out.println(directory.get("smetanov"));
    }
}

class Directory {
    private Map<String, List<String>> directory_hm = new HashMap<>();
    private List<String> phone_number_list;

    public void add(String surname, String phone_number) {
        if (directory_hm.containsKey(surname)) {
            phone_number_list = directory_hm.get(surname);
            phone_number_list.add(phone_number);
            directory_hm.put(surname, phone_number_list);
        } else {
            phone_number_list = new ArrayList<>();
            phone_number_list.add(phone_number);
            directory_hm.put(surname, phone_number_list);
        }
    }
    

    public List<String> get(String surname) {
        return directory_hm.get(surname);
    }

}

