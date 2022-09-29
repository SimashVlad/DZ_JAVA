package _OOP_DZ.DZ_1_OOP;

/*
+ Реализовать абстрактный класс Продукт, добавить ему какие-то параметры.
+ Реализовать несколько наследников от класса Продукт со своими параметрами, конструкторами и переопределяющие метод toString 
+ Реализовать класс Торговый автомат инициализирующий в дефолном конструкторе несколько коллекций содержащих наследников класса Продукт
+ Реализовать несколько методов возвращающий наследника класса(использовать разных наследников) Продукт по какому признаку
В отдельном классе Main, реализовать примеры использования торгового автомата (Создать автомат - запросить продукт по критерию - вывести полученный продукт в лог)
 */
import java.util.logging.Logger;

public class Main {
    private static final Logger Log = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        try {
            VendingMachine vm = new VendingMachine();
            System.out.println(vm.getProductByName("Pivo"));
            System.out.println(vm.getDrink("Bon acua", 80.0, 1.5));
            System.out.println(vm.getChocolate("Alpen Gold", 77.8, 80));
            System.out.println(vm.getDrinkgas("Borjomi", 99.0, 0.5, "C газом"));
            Log.info("Borjomi");
        } catch (Exception e) {
            Log.warning("Error: " + e);
        }
    }
}
