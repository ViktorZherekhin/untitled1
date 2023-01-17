import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        String stroka = new String ("novaya stroka");    // альтернативный способ задания объекта класса "String"

        /**
         * класс "Scanner" отвечает ввод данных с консоли
         * Если он светится красным, то значит надо его импортировать из пакета "util", в котором он находится,
         * нажав ПКМ на слове "Scanner" и выбрав "Java.util.Scanner"
         */

        Scanner s = new Scanner(System.in);  // "System.in" - это стандартный поток входных данных
                                                // создали объект класса "Scanner"
        System.out.println("Введите что-нибудь: ");
        String str = s.nextLine();              // сюда будем сохранять то, что ввели с клавиатуры
        System.out.println("Вы ввели: " + str);
        System.out.println("Введите число: ");
        int x = s.nextInt();
        System.out.println("Вы ввели: " + x);
    }
}
