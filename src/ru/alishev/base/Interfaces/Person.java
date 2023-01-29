package ru.alishev.base.Interfaces;

public class Person implements Info {    // = добавили ключевое слово "implements", т.е. "реализует" интерфес "Info"
                                        // т.е. этот класс теперь ОБЯЗАН реализовывать в себе метод "showInfo()"
                                        // а точнее все методы, которые есть в этом интерфейсе
                                        // здесь может быть указано несколько интерфесов (через запятую):
                                        // "implements Info1, Info2, ..."
    public String name;

    public Person(String name) {
        this.name = name;
    }

    public void sayHello(){
        System.out.println("I'm saying Hello!");
    }

    @Override
    public void showInfo() {                                            // метод создали используя помощник по
        System.out.println("Interface. Name is: " + this.name);        // разрешению ощибок (красная лампочка)
                                                                      // и выбрав пункт "implement methods"
    }                                                                // Методы в обоих классах называются
                                                                    // одинаково, но реализация у них разная

}
