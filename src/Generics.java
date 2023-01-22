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



    }
}
