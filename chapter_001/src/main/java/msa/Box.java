package msa;

/**
 * Класс Box демонстрирует наследование
 */
public class Box {
    double width;
    double heigth;
    double depth;

    //сконструировать клон обьекта
    Box(Box ob) {// предать объект конструктору
        width = ob.width;
        heigth = ob.heigth;
        depth = ob.depth;
    }

    //конструктор применяемый при указании всех размеров
    Box(double w, double h, double d) {
        width = w;
        heigth = h;
        depth = d;
    }

    //конструктор применяемы в утсутсвии размеров
    Box() {
        width = -1; // значение -1 служит для оозначения
        heigth = -1;//неицеализирванного паралелипипеда
        depth = -1;
    }

    //конструкор применяемы для создания куба
    Box(double len) {
        width = heigth = depth = len;
    }

    //расчитать и возвратить объем
    double volume() {
        return width * heigth * depth;
    }

}
    //расширить класс Box, включив в него поле вес
    class BoxWeight extends Box {
        double weight; //вес паралеллипипеда

    //консруктор BoxWeight()
    BoxWeight(double w, double h, double d, double m){
    width=w;
    heigth=h;
    depth=d;
    weight=m;
    }
}
class DevoBoxWeight {
    public static void main(String[] args) {
        BoxWeight mybox1=new BoxWeight(10,20,15,34.3);
        BoxWeight mybox2=new BoxWeight(2,3,4,0.076);

        double vol;
        vol=mybox1.volume();
        System.out.println("Объем mybox1="+vol);
        System.out.println("Вес mybox1 ="+mybox1.weight);

        vol= mybox2.volume();
        System.out.println("объем mybox2="+vol);
        System.out.println("Вес mybox2="+mybox2.weight);
    }
}