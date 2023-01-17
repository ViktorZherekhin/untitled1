public class ClassesAndObjects {   // это главный класс (публичный). Отмечен модификатором "pubkic"
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
        if userName.isEmpty(){
            System.out.println("Вы ввели пустую строку!");
        } else {
            name = userName;
        }

    }
    public String getName(){
        return name;
    }

    public void setAge(int userAge){
        if userAge < 0 {
            System.out.println("Возраст меньше нуля!");
        } else {
            age = userAge;
        }

    }
    public int getAge(){
        return age;
    }
}

