import Forest.Belka;
import Forest.Tree;
import Forest.*;            // можно сразу так записать, т.е. импортировать ВСЕ классы из пакета "Forest"


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    /* ПРИМИТИВНЫЕ ТИПЫ ДАННЫХ */



        int age1, age2;     // занимает 4 байта. По-умолчанию все целые числа - типа "int"
        int a = 55;  // т.е. можно сразу задать переменную и присвоить ей значение (для экономии места)
        int b = a*7;   // TODO: добавить "World"
        int c = (a-b) * (a+b);
        boolean n1 = false;
        short w = 456;          // занимает 2 байта
        long l2 = 123476L;  // по сути, конвертировали "int" в "long" (неявно)
        int i2 = (int)l2;   // сконвертировали "long" в "int" (явно)
        byte r = 127;             // от -128 до 127
        double d1 = a;           // сконвертировали "int" в "double" (теперь d = 55.0)

        double d2 = 14.7;        // по-умолчанию все вещественные числа - типа "double"
        int a2 = (int)d2;       // сконвертировали "double" в "int"  (теперь a2 = 12)

        float f = 234.9F;        // по сути, конвертировали "double" во "float" (неявно)
        float f2 = (float)d2;   // конвертировали "float" в "double"  (явно)

        long a3 = Math.round(d2);         // округление числа. Написали "long", т.к. такая нотация (как понял)
        System.out.println(a3);            // получилось 15

        // у них (примитивных типов) нет никаких методов, но бывают случаи, когда это нужно
        // тогда в дело вступают "Классы-обертки":
        // Double, Float, Long, Integer, Short, Byte, Character, Boolean
        // каждый соответствует своему типу данных

        Integer.parseInt("900");        // статический метод. Извлекает целое число из строки.
        n1 = Boolean.TRUE;                       // это константа

        // АвтоУпаковка
        Integer a4 = 200;           // здесь Java сама упакует примитив в соответствующую обертку
                                    // т.е. теперь к этой переменной можно применить методы класса "Integer"
        // АвтоРаспаковка
        int a5 = a4;            // a5 - стал обычным примитивом (распаковали "а4")


    /* ССЫЛОЧНЫЕ ТИПЫ ДАННЫХ */
        String name;   // String является классом, поэтому он пишется большой буквы
                        // здесь переменная "name" ссылается на объект класса "String"
        String name2 = "";  // создали пустую строку
        String s1 = "sdfd", s2 = "4545", s3 = "&hgdgwd___wdd";  // сокращенная запись
        String city = "Yarolavl" + "city";   // это называется склеить строки
        String str1 = "Амиго" + a;  // получится строка "Амиго55"
        System.out.println(str1 + "  " + str1);
        System.out.println("Hello world!");

        boolean t = true;
        boolean t2 = 5 > 10;
        boolean t3 = a == 5;
        System.out.println(t);
        System.out.println(t2);
        System.out.println(t3);


     /* Преобразования ЧИСЛО <=> СТРОКА  */
        int a1 = 5;
        System.out.println(a + a + "1" + a);   // получится в результате "1015", т.к. порядок такой:
                                                // ((a + a) + 1) + a, т.е. слева направо

        String s4 = "" + 16;    // таким образом можно преобразовать число в строку
        System.out.println(s4);
        int x = Integer.parseInt(s4);  // а так можно преобразовать строку в число
        int x2 = Integer.parseInt("321" + 0);       // x2 = 3210

    /* Длина строки */
        int x3 = s4.length();       // будет равно "2"
        int x4 = "".length();       // будет равно "0"
        int x5 = (s4 + 12).length();    // // будет равно "4"
        System.out.println(x3 + " " + x4 + " " + x5);

    /* ЗАГЛАВНЫЕ - строчные */
        String s5 = "ROM123", s6 = "qwerty";
        System.out.println(s5.toLowerCase());
        System.out.println(s6.toUpperCase());

        Tree tree1 = new Tree();    // создали новый объект класса "Tree" из пакета "Forest"
                                    // при это в самом верху появилась запись "import Forest.Tree;"
                                    // если не появилась - прописываем сами
                                    // т.е. он сам импортировался

        Belka belka1 = new Belka();
        Scanner input1 = new Scanner(System.in);        // создали объект класса "Scanner" (для получения вводимых
                                                        // данных). При этом снова вверху автоматичеки
                                                        // поиявилась запись "import java.util.Scanner"
                                                        // т.е. класс "Scanner" находится в пакете "util",
                                                        // который в свою очередь находится в пакете "java"

        belka1.name = "Strelka";        // получили доступ к этому полю из другого пакета полю
                                     // благодаря модификатору "public" (для этого поля)
                                    // но это крайне нежелательно (см. урок про инкапсуляцию)
       a1 = Belka.ID12;             // но с константами - можно
    }
    }
