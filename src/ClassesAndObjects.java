import Interfaces.Info;
import Interfaces.Info2;

public class ClassesAndObjects {   // это главный класс (публичный). Отмечен модификатором "public"
                                    // имя этого класса и имя файла .java  должны совпадать
    public static void main(String[] args) {
        // создадим несколько людей на базе класса "Person":
        Person person1 = new Person();
        Person person2 = new Person();
        person1.setName("Viktor");
        person1.setAge(24);
        System.out.println(person1.getName() + " " + person1.getAge());
        person2.speak();        // после объявления метода "speak()" можно таким простым способом вывести на экран

        int y1 = person1.yearsToPensiya();
        System.out.println("Кол-во лет до пенсии первому человеку: " + y1);

        Person person3 = new Person();
        person3.setNameAge("Michail", 68);
        person3.speak();

        Animal anim1 = new Animal();
        anim1.eat();

        // Прдставим, что мы хотим переопределить метод "eat()" в классе "Animal"
        // Тогда мы можем создать класс-наследник и там его переопределить.
        // Но это не рационально, если нам надо вызвать метод всего ОДИН РАЗ.
        // Для решения этой проблемы придуманы Анонимные Классы
        // Т.е. создадим объект класса "Animal" и там в нем переопределим метод:

        Animal anim2 = new Animal(){            // здесь мы, на самом деле, создаем АНОНИМНЫЙ класс,
            public void eat(){                  // который наследуется от "Animal"
                System.out.println("Переопределили метод eat()!");
            }                                   // и который переопределяет метод "eat()"
        };                                      // т.е. в "anim2" лежит объект-наследник класса "Animal"
        anim2.eat();

        // Альтернативный способ (но опять же надо создавать целый класс - "Animal3"):
        // - добавить имя переопределяемого метода в интерфейс "Info"
        // - создать класс, который его реализует ("class Animal3 implements Info"), см. ниже
        // - добавить следующие две команды:
        Info2 drink1 = new Animal3();
        drink1.drinking();                  // выведется "Animal is drinking water!"

        // Третий способ (снова с помощью Анонимного класса):
        // Т.е. создадим объект Интерфейса:
        Info2 drink2 = new Info2() {
            @Override
            public void drinking() {                    // т.е. нам предлагается самим реализоавть метод "eat()"
                System.out.println("No comment...");  // в Интерфейсе при создании объекта Интерфеса
            }                                        // но на самом деле за кулисами здесь создается
        };                                           // анонимный класс в котором мы можем
                                                    // реализовать (переопередлить) метод интерфейса "Info2"
        drink2.drinking();      // выведется "No comment..."
    }

}
class Person {   // это вспомогательный класс (их может быть много)
                // у класса могут быть данные (поля): возраст, цвет глаз, имя, и т.д.
                // класс может совершать действия (методы): он может ходить, бегать, прыгать, говорить, и т.д.
    private String name;  // благодаря "private" эта переменная (поле) теперь доступна только внутри этого класса
    private int age;        // чтобы не было коллизий и путаницы

    // создадим метод для этого класса (пишем с маленькой буквы)
    // в котором человек сам представляется (чтобы не дублировать "sout" в public классе
    // этот метод имеет пустые параметры в скобках (т.е. при вызове метода не надо их указывать)
    void speak(){
        System.out.println("Меня зовут "+ name + ". Мне " + age + " лет.");
        // в круглых скобках - аргументы (параметры) метода
        //            в фигурных - тело метода
        // "sout" можно поместить в цикл, и вообще, делать все что угодно
        // этому методу нужны параметры (имя, возраст)
        // "void" - это тоже тип данных (переводится как "пустота, ничто").
        //          Т.е. наш метод ничего не возвращает в метод "main"
    }

    // создадим метод, считающий кол-во лет до пенсии
    // его тип "int", т.е. он будет возвращать значение этого типа (в место вызова метода)
    int yearsToPensiya() {
        int years = 65 - age;
        return years;   // на "return" программа сразу выходит из метода,
                        // поэтому после него нет смысла что=то писать
    }

    // создадим метод с параметрами
    // "username" - это внутренняя переменная метода (которая видна только внутри него)
    void setNameAge (String userName, int userAge) {
        name = userName;
        age = userAge;
    }

    // методы Сеттеры и геттеры
    // служат прслойкой между полями и моими методами
    // в них можно, например, производить проверку достоверности вводимого имени и возраста
    // они используются в любом API (интерфейсе, через который пользователь получает доступ к функционалу программы)
    public void setName(String userName){
        if (userName.isEmpty()) {
            System.out.println("Вы ввели пустую строку!");
        } else {
            name = userName;
        }

    }
    public String getName(){
        return name;
    }

    public void setAge(int userAge){
        if (userAge < 0) {
            System.out.println("Возраст меньше нуля!");
        } else {
            age = userAge;
        }

    }
    public int getAge(){
        return age;   // возвратить возраст
    }
}


// создадим класс животных, которые умеют есть и спасть.
class Animal {
    String animalName = "Any animal";

    private String animalColor = "yellow";      // к этой переменной у класса-наследника "Dog" уже не будет доступа
    public void eat(){
        System.out.println("Animal is eating");
    }
    public void sleep(){
        System.out.println("Animal is sleeping");
    }
    public void makeSound() {
        System.out.println("Animal makes common sound");
    }

}


class Dog extends Animal {   // класс "Dog" более узкое понятие, чем "Animal"
                            // этим мы записали, что класс "Dog" наследуется от класса "Animal",
                            // т.е. класс "Animal" стал родителем класса "Dog"
                            // т.е. теперь у собаки будут методы eat() и sleep()
                            // классс может наследовать только один класс
                           // т.е. у него может быть только один родитель

    public void gavgav(){   // создали метод, который справдлив только для собаки,
                            // т.к. только она умеет гавкать
        System.out.println("Gav-gav!!!");
    }
    public void eat(){          // переопределили родительский метод
        System.out.println("Dog is eating...");
    }
    public void showName(){
        System.out.println(animalName);     // поле "animalName" так же унаследовано от родительского класса
    }
    public void makeSound(){
        System.out.println("Dog says: gav-gav!");
    }
}

class Animal2 {             // для урока по Generics создал
    private int id;
    public Animal2(){         // на уроке создали дефолтный конструктор, который ничего на входе не принимает
                                 // чтобы не было ошибок
     }
    public Animal2(int id){
        this.id = id;
    }
    public String toString(){               // переопределим этот метод, чтобы он возвращал "id" животного
        return String.valueOf(id);          // конвертировали число в строку
    }
    public void eat(){                              // создали метод, специфичный только для "Animal2"
        System.out.println("Animail is eating");
    }
}

class Dog2 extends Animal2 {
}

class Animal3 implements Info2 {

    @Override
    public void drinking() {
        System.out.println("Animal is drinking water!");
    }
}
