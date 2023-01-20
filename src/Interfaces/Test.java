package Interfaces;

public class Test {
    public static void main(String[] args) {
        Animal anim1 = new Animal(25);
        Person pers1 = new Person("Viktor");
        Info info1 = new Animal(10);            // благодаря тому, что классы "Animal" и "Person" реализуют
        Info info2 = new Person("Bob");      // интерфейс "Info", мы теперь можем так создать переменные
                                                    // т.е. это уже не объект класса "Animal" или "Person"
                                                    // а это нечто, что реализует интерфейс "Info"
        anim1.sleep();
        pers1.sayHello();
        anim1.showInfo();
        pers1.showInfo();
        System.out.println("-----------------------");
        info1.showInfo();       // здесь в перечне есть только те методы, которые описаны в этом интерфейсе
        info2.showInfo();        // т.е., к примеру, метод "sleep()" здесь не вызвать
                                 // это, по сути полиморфизм

        System.out.println("------/----------/-----");
        outputInfo(info1);          // результат получили один и тот же
        outputInfo(info2);
        outputInfo(anim1);          // так тоже можно, благодаря интерфейсу, т.е. несмотря на то что
        outputInfo(pers1);          // тип переменной "info" интерфейс "Info",
                                    // мы можем подать на вход объект класса "Animal" или "Person"
                                    // т.е. этому методу не важно что подается на вход
                                    // главное, чтобы оно реализовывало интерфес "Info"
    }

    // Создадим метод, который будет принимать на вход нечто, что реализует интерфес "Info"
    // Он сможет действовать на любом из объектов, класс которого реализует интерфейс "Info"
    public static void outputInfo(Info info){
        info.showInfo();
    }
}

/* Допустим мы хотим, чтобы у класса "Person" и "Animal" было какое-то общее поведение.
   Например, выводить информацию о себе.
   Т.е. "Animal" может все показывать свой "id", а "Person" всем говорить свое "name".
   И это общее поведение вынесем в интерфейс. Т.е. создадим интерфейс.
 */

