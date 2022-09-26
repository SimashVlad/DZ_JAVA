package DZ_6;


public class pc_class {
    int id; // номер ноутбука
    String model; // Название ноутбука
    String firma; // Название фирмы изготовителя
    int yadro; // Колличество ядер
    String video; // Наличие видеокарты
    int RAM; // Колличество оперативной памяти
    int ssd; // Объем памяти основного диска.

    public pc_class(int id, String name, String firma, int yadro, String video, int RAM, int ssd) {
        this.id = id;
        this.model = name;
        this.firma = firma;
        this.yadro = yadro;
        this.video = video;
        this.RAM = RAM;
        this.ssd = ssd;
    }

    @Override
    public String toString() {
        String res = String.format("%d %s %s %d %s %d %d", id, model, firma, yadro, video, RAM, ssd);
        return res;
    }
}
