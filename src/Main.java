public class Main {
    public static void main(String[] args) {

    /* ПРИМИТИВНЫЕ ТИПЫ ДАННЫХ */
        int age1, age2;
        int a = 55;  // т.е. можно сразу задать переменную и присвоить ей значение (для экономии места)
        int b = a*7;   // TODO: добавить "World"
        int c = (a-b) * (a+b);



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

        // Преобразования ЧИСЛО <=> СТРОКА
        int a1 = 5;
        System.out.println(a + a + "1" + a);   // получится в результате "1015", т.к. порядок такой:
                                                // ((a + a) + 1) + a, т.е. слева направо

        String s4 = "" + 16;    // таким образом можно преобразовать число в строку
        System.out.println(s4);
        int x = Integer.parseInt(s4);  // а так можно преобразовать строку в число
        int x2 = Integer.parseInt("321" + 0);       // x2 = 3210

        // Длина строки
        int x3 = s4.length();       // будет равно "2"
        int x4 = "".length();       // будет равно "0"
        int x5 = (s4 + 12).length();    // // будет равно "4"
        System.out.println(x3 + " " + x4 + " " + x5);

        // ЗАГЛАВНЫЕ - строчные
        String s5 = "ROM123", s6 = "qwerty";
        System.out.println(s5.toLowerCase());
        System.out.println(s6.toUpperCase());
    }
    }
