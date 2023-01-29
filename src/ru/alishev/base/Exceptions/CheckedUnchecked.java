package ru.alishev.base.Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CheckedUnchecked {

    public static void main(String[] args) {

        // Checked- исключения (или Compile-time exceptions)
        // возникающие во время компиляции
        // т.е. без обработки таких исключений программа не скомпилируется.
        // Как и на прошлых уроках, сама Java вынуждала нас обработать исключение
        // на случай, если файл не будет найден:

        File file1 = new File("doc1.txt");
        try {
            Scanner scan1 = new Scanner(file1);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден!");
        }

        // Unckecked-исключения (или Run-time exceptions)
        // возникающие во время выполнения программы
        // В нашем случае, программа скомпилируется, несмотря на операцию деления на ноль

      //  int a = 1/0;      // здесь выбросится исключение ("ArithmeticException"): "/ by zero"
                            // это, по идее, ошибка в программе, и ее не надо обрабатывать
                            // прописывать для нее исключение
                            // она не должна возникать в программе в принципе

/*      String s1 = null;
        s1.length();        // здесь снова выбросится исключние ("NullPoinerException"):
                            // "Cannot invoke "String.length()" because "s1" is null"*/

        int[] array = new int[2];       // в составе всего два элемента с индексами 0 и 1
        System.out.println(array[2]);   // здесь выбросится исключение ("ArrayIndexOutOfBoundsException"):
                                        // "Index 2 out of bounds for length 2"


    }








}
