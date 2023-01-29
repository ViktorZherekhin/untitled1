package ru.alishev.base.Interfaces;

/*
Интерфесы используются повсеместно, в т.ч. в стандартных библиотеках Java, Коллекциях
Глобальная папка у нас это "src".
Мы создали пакет (package), по сути, подпапку.
Их используют чтобы разрешать коллизии имен классов.
 */

public class Animal implements Info {  // = добавили ключевое слово "implements", т.е. "реализует" интерфес "Info"
                                        // т.е. этот класс теперь ОБЯЗАН реализовывать в себе метод "showInfo()"
                                        // а точнее все методы, которые есть в этом интерфейсе
                                        // здесь может быть указано несколько интерфесов (через запятую):
                                        // "implements Info1, Info2, ..."

    public int id;   // у каждого животного свой идентификатор

    public Animal(int id){      // создали конструктор (чтобы при создании объекта этого класса
        this.id = id;           // сразу задавать id-шник
    }

    public void sleep(){
        System.out.println("Animal is sleeping");
    }

    public void showInfo(){
        System.out.println("Interface. Id is: " + this.id);
    }
}
