package ru.alishev.base.Exceptions;     // Выбрасывание исключений

import java.io.IOException;
import java.util.Scanner;

public class ExceptionsThrow {
    public static void main(String[] args) throws ScannerException {
        // ПОльзователь будет вводить числа
        // И если они будут отличны от нуля - мы будем выбрасывать исключение.
        Scanner sc1 = new Scanner(System.in);
        while (true) {      // безконечный цикл
            int x = Integer.parseInt(sc1.nextLine());
            if (x != 9) {
                try {
                    throw new IOException();    // "IOException" - это подкласс (Subclass) класса "Exception"
                } catch (IOException e) {       // полный перечень есть на сайте "Oracle"
                    System.out.println("Введите число \"9\":");
                }
            }
          //  if (x == 0) throw new IOException();  // выведется КРАСНЫЙ ТЕКСТ и программа завершит работу
            if (x == 7) throw new ScannerException("Пользователь ввел \"7\""); // Выведется КРАСНЫЙ текст с доп.
                                                                                // описанием

        }
    }
}

// Если среди стандартных подклассов мы не нашли подходящий,
// мы можем создать свое исключение
// Для этого создадим новый класс "ScannerException.java".
// И оно так же при выбросе будет выводить КРАСНЫЙ текст


