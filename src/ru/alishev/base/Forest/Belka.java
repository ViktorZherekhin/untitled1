package ru.alishev.base.Forest;

public class Belka {
    public String name;  // это крайне нежелательно делать свои поля класса публичными или default-ными !!!!!!!!!
                            // их лучше делать "private"
                        // единственный случай, когда их можно делать "public" -
                        // это когда мы их делаем константами


    public static final int ID12 = 700;     // создали константу
    protected String b2;        // видна в пределах пакета и в классах-наследниках (как понял)
                                // сделал наследником класс "ru.alishev.base.ModifikatoryDostupa"

    public Belka(){             // создали Конструктор
        b2 = "Tomcat";          // чтобы переменная сама инициализировалась при создании объекта класса "Belka"
    }

}
