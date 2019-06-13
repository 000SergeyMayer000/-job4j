package msa.lesson15;

public class Constructor {
    public void foo(){
Flower flower=new Flower();
flower.name="РОмашка";
flower.color="Белый";

Flower flower2=new Flower("Роза","Красный");
        System.out.println(flower.name+" "+flower.color);
        System.out.println(flower2.name+" "+flower2.color);
    }
}

