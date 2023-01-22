import java.util.ArrayList;
import java.util.List;

public class Generics {
    public static void main(String[] args) {
        Animal ourAnimal = new Animal();
        List animals = new ArrayList();        // переменная "list1" ссылается на "ArrayList" через интерфейс "List"
                                            // это динамический массив
                                            // в него можно добавлять объекты ЛЮБЫХ классов
        animals.add("Cat");                // добавлять можно до тех пор, пока есть память на компьютере
        animals.add("Dog");                 // 1-й элемент
        animals.add("Bear");
        animals.add(342);
        animals.add(ourAnimal);             // так тоже можно, но при попытке вывести ЭТОТ элемент следующими
                                            // двумя командами, возникнет ошибка

        // он хранит объекты самого верхнего родительского класса "Object"
        // поэтому, чтобы получить значение к.-л. элемента, надо сделать Downcast:
        String anim1 = (String) animals.get(1);
        System.out.println(anim1);

        // но постоянно делать DownCast неудобно, поэтому придумали такой механизм, как
        // Параметризация классов (т.е. с появлением Дженериков и начиная с Java 7)
        // Т.е. ArrayList сейчас так создается:
        List<String> animals2 = new ArrayList<>();      // в треугольных скобках указали тот класс,
                                                              // который будет помещаться в ArrayList
        animals2.add("Cat");        // сюда можем класть только объекты класса "String"
        animals2.add("Bear");       // мы это указали в 1-й команде
        animals2.add("Elephant");
        String anim2 = animals2.get(1);     // теперь можно проще сделать (без DownCast, как выше)
        System.out.println(anim2);

        // создадим новый динамический массив
        List<Animal2> zoo3 = new ArrayList<>();      // здесь могут храниться только объекты класса "Animal"
        zoo3.add(new Animal2(1));
        zoo3.add(new Animal2(2));
        test(zoo3);

        // Создадим еще один массив на базе класса "Dog"
        List<Dog2> sobaki = new ArrayList<>();
        sobaki.add(new Dog2());
        sobaki.add(new Dog2());
        test2(sobaki);

    }

    private static void test(List<Animal2> list1){
        for (Animal2 animal: list1                   // цикл "For-each"
             ) {
            System.out.println(animal);     // при этом будет вызываться метод "toString", который объявлен
        }                                   // у класса "Object" (родителя класса "Animal")
    }

    public static void test2(List<? extends Animal2> list2){     // благодаря такой записи мы можем
        for (Animal2 animal : list2                             // подставлять Листы класса "Animal2"
             ) {                                               // или любого класса-наследника "Animal2"
            animal.eat();                                     // т.е. мы использовали "Wildcard"
        }
    }

    public static void test3(List<? super Animal2> list2) {     // благодаря такой записи мы можем
      /*  for (Animal2 animal : list2                            // подставлять Листы класса "Animal2"
        ) {                                                   // или любого класса выше "Animal2"
            animal.eat();                                   // но тогда этот код надо скорректировать
        }  */                                                 // дальше не стал разбирать
    }
}
