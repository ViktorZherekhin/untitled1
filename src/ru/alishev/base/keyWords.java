package ru.alishev.base;

import java.text.MessageFormat;

public class keyWords {
    public static void main(String[] args) {
        Human.description = "Joe Camel";
        Human human1 = new Human();             // создали объект класса "ru.alishev.base.Human" (а сам класс задан ниже)
        human1.setAge(18);
        human1.setName("Viktor");
        human1.getInfo();
        Human.getCountPeople();

        Human human2 = new Human("Bob", 84);   // это получилось благодаря созданию своего конструктора
        human2.getInfo();
        Human.getCountPeople();

        Human human3 = new Human();  // здесь не задали параметры, поэтому они подставятся теми, что по-умолчанию
        human3.getInfo();
        Human.getCountPeople();
        System.out.println("--------------------");
        Human.description = "Joe Camel2"; // к переменной класса можно обратиться напрямую (без создания объекта класса)
        Human.getDescription();
        System.out.println(Math.pow(2, 3)); // класс "Math" со статическим методом "pow" (возведение в степень)
        System.out.println(Math.PI);        // статическая переменная (число "пи")

        System.out.println("-----/------/-------");
        System.out.println(human1.toString());  // возвращает hash-код (уникальный номер) созданного объекта
                                                // этот стандартный метод "toString" можно переопределить
                                                // в своем классе (ru.alishev.base.Human), т.е. чтобы он выполнял какие-то другие
                                                // действия. Для этого надо повторить сигнатуру (см. ниже)
    }
}
        // ключевое слово "This"

class Human {
    String name;       // эти переменные называются переменными объекта,
    int age;        // т.к. у каждого объекта они разные (вообще говоря)

    // ключевое слово "Static"
    // Им обозначаются переменные и методы класса (НЕ объекта!)

    public static String description;       // создали переменную класса
                                            // она будет делиться между всеми объектами этого класса,
                                            // т.е. она будет общей для всех объектов класса "ru.alishev.base.Human"
                                            // ей будет автомаический присвоена пустая строка (null),
                                            // а для числа = 0
    private static int countPeople;

    // пропишем Конструктор (который создается и выполняется по умолчанию, при создании объекта класса)
    // но, если мы его не пропишем здесь, а создадим только свой конструктор (с параметрами) - см. ниже,
    // то мы уже не сможем создать объект класса без параметров (будет ошибка)

    // КОНСТРУКТОРЫ - это специальные методы, которые вызываются при создании нового объекта,
    // т.е. он инициализирует поля объекта (по умолчанию его не видно, и он пустой)
    // У нас человек (human1) не может быть создан без имени возраста
    // От этого объекта иначе нет смысла, если у него не инициализированы имя и возраст.
    // Конструктор решает эту проблему (т.е. если даже пользователь не задаст явно имя и возраст,
    // Конструктор сделает это сам (подставив значения по-умолчанию).
    // Конструктор отличается тем, что у него нет типа возвращаемого значения
    // Имя конструктора всегда должно СОВПАДАТЬ с именем класса (т.е. так же с заглавной буквы)

    // Предположим у нас есть офис, и нам нужно посчитать работников

    public Human(){                                                                     //
        System.out.println("Привет из 1-го конструктора");                              //
        this.name = "Alf";   // это значение по-умолчанию                               //
        this.age = 10;                                                                  //
    }                                                                                   // все это
                                                                                        // называется
    // создадим свой Конструктор, который будет принимать на входе имя и возраст        // "перегрузка
    public Human(String name, int age){                                                 // методов"
        this.name = name;                                                               //
        this.age = age;                                                                 //
        countPeople++;      // будет инкрементироваться при каждом новом                //
    }                       // создании объекта

    // В одном классе мы можем иметь несколько методов с одинаковым названием
    // Главное, чтобы у них были разные параметры (по количеству  ?)
    // Java сама определяет какой метод вызывать
    // (в зависимости от того, какие мы передаем параметры)
    // Для "human1" поэтому вызвался 1-й конструктор, а для "human2" - 2-й.

    // создадим Сеттеры и Геттеры
    // они позволяют получить/записать значения private-переменных
             // public void setName(String myName){    - так задавали раньше.
             //     name = myName;                      Но нагляднее использовать такое же имя параметра
             //  }                                      как и у объекта (класса). Это best practices.
             //                                          Для этого надо использовать ключевое слово "This":
             //                                         Оно вызывает объект этого класса (для которого вызвали метод0
            //                                                      "SetName", к примеру)
    public void setName(String name){  // это методы объекта
        this.name = name;               // т.к. назначить имя
    }                                   // мы можем только конкретному объекту
    public void setAge(int age){
        this.age = age;
    }   // это метод объекта
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void getInfo(){
        //System.out.println(name + ", " + age + "__" + name);
        System.out.println(MessageFormat.format("Имя: {0}, возраст: {1}, description: {2}",
                name,
                age,
                description));
    }
    public static void getCountPeople(){
        System.out.println("Кол-во людей: " + countPeople);
    }
    public static void getDescription(){        // создали метод класса (статический)
        System.out.println(description);        // он будет работать, даже если мы
    }                                           // не создадим ни одного объекта класса.
                                                // Статический метод не может работать с переменными объекта!
    // Статический метод - это функция (вообще говоря).
    // И используется, когда ему не важны переменные объекта
    // И когда нам не нужен объект класса, чтобы воспользоваться этим методом
    // Например, в Java есть встроенный класс "Math", имеющий кучу статических методов (abs, asin, cos, и т.д.),
    // и который можно использовать, не создавая объект класса

    public String toString(){   // переопределили стандартный метод "toString",
                                // унаследованный от родительского класса "Object"
                                // вообще смысл этого метода - представлять объект в виде строки
        return name + ", " + age;

    }



}





        /*
        Любой класс в Java (который мы создаем сами или который есть
        в стандартной библиотеке) наследуется от класса "Object".
        Т.е. наши классы заимствуют от класса "Object" все его методы и поля.
        Т.е. к примеру, класс "ru.alishev.base.Human" является объектом класса "Object".
         */



