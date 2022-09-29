package _OOP_DZ.DZ_1_OOP;

public class Product {
    private String name; // Наименование товара
    private Double cost; // Стоимость товара

    public Product(String name, Double cost) { // Конструктор
        this.name = name;
        this.cost = cost;
    }

    public String getName() { // метод возвращения строки name
        return name;
    }

    public Double getCost() { // метод возвращения стоимости cost
        return cost;
    }

    public void setName(String name) { // метод добавления данных
        this.name = name;
    }

    public void setCost(Double name) { // метод добавления данных
        this.cost = name;
    }

    @Override
    public String toString() {
        return " Наименование: "+ name + " стоимость: " + cost + " ";
    }
}
