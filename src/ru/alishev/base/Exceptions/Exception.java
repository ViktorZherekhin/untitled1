package ru.alishev.base.Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;

public class Exception {
    public static void main(String[] args) {
        // Исключение обрабатывает случай, если не будет найден файл
        // Исключение - это обычный объект класса
        // Все классы, которые обозначают Исключения (например, "FileNotFoundException") - см. "ReadFile.java"
        // они должны наследоваться от класса "Exception".
        // И его объект выбрасывается ("throws") в том случае, если происходит ошибка
        // При этом появляется красный текст в нижней половине экрана
        // (это мы выбрали в контексном меню "Add exception to method signature")
        // Но лучше каждое Исключение обрабатывать индивидуально
        // чтобы обычный пользователь не пугался, если что-то пойдет не так
        //
        // Второй вариант - выбрать "Surround with try/catch"-
        // Достоинство блока "catch" - что мы можем реализовать свой метод обрабки исключения
        // хотя, по-умолчанию, также появляется красный текст

        File file1 = new File("doc3.txt");
        try {                                   // в блоке "try" тот код, который может вызвать Исключение
            Scanner sc1 = new Scanner(file1);
            System.out.println("Продолжение блока try");  // если будет исключение, эта и следующие команды
                                                          // в блоке "try" уже не выполнятся
        } catch (FileNotFoundException e) {     // обработка Исключения производится в блоке "catch"
          //  e.printStackTrace();                // здесь также создается объект класса
         // throw new RuntimeException(e);     // "FileNotFoundException" (мы его как бы ловим)
            System.out.println("Файл не найден"); // и, по-умолчанию, к этому объекту применяется метод
                                                // "printStackTrace()" - в старых версиях Java
        }                                      // в моей версии - "throw new RuntimeException(e)"
                                                // оба они вызывают "КРАСНЫЙ текст"

        System.out.println("Несмотря на это программа выполняется дальше");
        // но в моей версии с "throw new RuntimeException(e)" программа дальше не выполняется !!!!

        // При вызове в "ru.alishev.base.Main" нижеуказанного статического метода, надо снова обработать исключение в главном блоке,
        // несмотря на то, что оно уже, казалось бы, обработано (в нижеуказанном стат. методе), т.е.
        // программа будет ругаться, если мы просто выведем "readFile()":

        try {
            readFile();
        } catch (FileNotFoundException e) {
            //throw new RuntimeException(e);
            System.out.println("Файл \"doc0.txt\" не найден");
        }

        try {                               // каждое исключение обрабатывается в своем "catch" (по разному т.е.)
            run();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        try {                                  // оба исключения обрабатываются одинково
            run();                              // это называется "multi-catch"
        } catch (IOException | ParseException e) {
            throw new RuntimeException(e);
        }
    }


    public static void readFile() throws FileNotFoundException {       // здесь таким способом сделали обработку
        File file2 = new File("doc0.txt");                   // Исключения
        Scanner sc2 = new Scanner(file2);
    }

    // один метод может выбрасывать несколько исключений
    // и если мы вызовем это метод в "ru.alishev.base.Main", нам нужно будет и там включить обработку исключений
    // (либо так же (с помощью "throws"), либо с помощью "try-catch" - см. выше
    public static void run() throws IOException, ParseException, IllegalArgumentException {

    }

}
