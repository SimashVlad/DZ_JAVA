package DZ;
/*
Реализуйте сущность “Deque” с помощью массива Integer, массив ограничен в размере size <=5 . Нужно реализовать методы
*   boolean offerFirst(Integer element); //добавляет элемент element в самое начало массива. 
        Если элемент удачно добавлен, возвращает true, иначе - false
*   boolean offerLast(Integer element); //добавляет элемент element в конец массива. 
        Если элемент удачно добавлен, возвращает true, иначе - false
*   Integer peekFirst(); //возвращает без удаления элемент из начала массива. 
        Если массив пуст, возвращает значение null
*   Integer peekLast(); //возвращает без удаления последний элемент массива. 
        Если массив пуст, возвращает значение null
*   Integer pollFirst(); //возвращает с удалением элемент из начала массива. 
        Если массив пуст, возвращает значение null
*   Integer pollLast(); //возвращает с удалением последний элемент массива. 
        Если массив пуст, возвращает значение null 
*/

import java.util.ArrayDeque;
import java.util.Deque;

public class Seminar4_Task_DZ_1 {
        public static void main(String[] args) {
                ArrayDeque<Integer> arrayDeque = new ArrayDeque<>(4);
                arrayDeque.addFirst(8); // добавляет элемент element в самое начало массива.
                arrayDeque.addLast(4); // добавляет элемент element в конец массива.
                arrayDeque.offerFirst(7);
                arrayDeque.offerLast(5);
                arrayDeque.offerLast(6);
                
                System.out.println("Элемент: " + arrayDeque.peekFirst()); // возвращает без удаления элемент из начала массива.
                System.out.println("Элемент: " + arrayDeque.peekLast()); // возвращает без удаления последний элемент массива.
                // System.out.println("Элемент: " + dq.pollFirst()); // возвращает с удалением элемент из начала массива.
                // System.out.println("Элемент: " + dq.pollLast()); // возвращает с удалением последний элемент массива.

                System.out.println("ArrayDeque: " + arrayDeque + "\n");
                
                boolean retval = arrayDeque.remove(4);
                if(retval == true){
                        System.out.println("true");
                } else {
                        System.out.println("false");
                }
        }
      
        // public boolean add(e) {
        //         addLast(e);
        //         return true;
        //     }
        
}
