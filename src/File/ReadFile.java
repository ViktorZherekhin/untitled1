package File;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) throws FileNotFoundException {  // это т.н. Exception, на случай
                                                                            // если файл не будет найден
                                                                            // создался помощником автоматически
                                                                            // когда в качестве входного потока
                                                                            // указывали "file1"
        // Считывать из файла можно разными способами
        // Есть специальный класс "File" для работы с файлами:
        String sep1 = File.separator;  // это разделитель в названии пути к файлу (на Macos он такой "/")
        File file1 = new File("C:\\Users\\sova\\IdeaProjects\\untitled1\\doc1.txt");
        Scanner sc1 = new Scanner(file1);
        // если файл находится в корневой папке, то можно просто указать:
        // Scanner sc1 = new Scanner("doc1.txt");

        // Теперь считаем все строки в файле с помощью цикла:
        while (sc1.hasNextLine()) {                // метод "hasNextLine" возвращает "Истина",
            System.out.println(sc1.nextLine());    // если еще есть строки, которые еще не считали
        }
        sc1.close();                            // в коце работы надо закрывать "Scanner"
                                                // чтобы освобождались ресурсы и поток не оставался открытым

        // Считаем числа из файла
        File file2 = new File("C:\\Users\\sova\\IdeaProjects\\untitled1\\doc2int.txt");
        Scanner sc2 = new Scanner(file2);
        String str1 = sc2.nextLine();       // считали и сохранили строку из файла в переменную "str1"
        // Теперь получим каждое число в отдельности, создав массив, класса "String"
        // но это все равно будут строки "1", "2" и "3" (в итоге)
        String[] stringOfNumbers = str1.split(" ");     // у нас числа в файле разделены пробелом, поэтому здесь
                                                    // в качестве разделителя указали пробел (можно было любой символ)
                                                    // т.е. он вырежет все пробелы
        System.out.println(Arrays.toString(stringOfNumbers));
        // Преобразуем каждое из чисел в переменную типа "int"
        // (через метод "parseInt()", находящийся в классе "Integer")
        // с помощью цикла "For-each" и массива чисел?
        int[] numbers = new int[3];
        int i = 0;
        for (String number : stringOfNumbers ) {
            numbers[i++] = Integer.parseInt(number);
        }
        i = numbers[1] + 100;
        System.out.println(Arrays.toString(numbers));
        System.out.println(i);

    }



}
