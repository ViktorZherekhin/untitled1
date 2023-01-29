package ru.alishev.base.Strings;

public class Equals {
    public static void main(String[] args) {
        // Мы можем сравнивать примитивные типы данных (int, char, etc.):
        int i = 4;
        int j = 4;
        System.out.println(i == j);

        // Но для ссылочных типов данных (объектов к.-л. класса) такое сравнение не работает
        // т.к. у нас получается сравние ссылок (указателей), а не самих объектов
        // и результат будет всегда "false", т.к. указатели указывают на разные участки памяти,
        // где находятся объекты

        // Для решения этой проблемы придуман метод "equals()"
        // он определен в классе "Object"
        Plant plant1 = new Plant(1);
        Plant plant2 = new Plant(2);

        System.out.println(plant1.equals(plant2));  // получим снова "false", т.к. все равно сравниваем ссылки
                                                    // чтобы сравнить объекты структурно, надо
                                                    // переопределить метод "equals()" в классе "Plant"
                                                    // (см. ниже)

        // Сравним теперь строки
        String str1 = "Stroka texta1";  // здесь создается новый объект класса "String" на самом деле
        String str2 = "Stroka texta1";
        System.out.println(str1.equals(str2));
        // В Java есть такой механизм как "String pool", т.е. при создании двух одинаковых строк (см. выше)
        // Java не создает вторую такую же, а ссылает вторую переменную на 1-ю строку (для экономии памяти)
        // и тогда результат сравнения str1 == str2 будет true (хотя так все равно лучше не сравнивать)
    }

}

class Plant {

    private int id;

    public Plant(int id) {      // создали Конструктор (автоматически)
        this.id = id;
    }

/*    @Override                              // сгенерировано автоматически
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Plant plant = (Plant) o;
        return id == plant.id;
    }*/

                                            // альтернативный вариант (из урока):
    public boolean equals(Object obj) {
        Plant otherPlant = (Plant) obj;     // сделали Downcasting (здесь допустимо)
        return this.id == otherPlant.id;
    }


}
