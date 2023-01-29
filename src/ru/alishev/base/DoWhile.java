package ru.alishev.base;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args){
        // напишем программу, которая будет считывать цифры с клавиатуры до тех пор, пока не считает "5":

        Scanner s = new Scanner(System.in);
        System.out.println("Введите 5:");
        int value = s.nextInt();
        while(value != 5) {
            System.out.println("Введите 5:");  // это получается дублирование кода
            value = s.nextInt();                    // будем решать это с помощью "DO - WHILE"
        }
        System.out.println("Вы наконец-то ввели 5!");

        // альтернативный вариант:

        int value2;
        do {
            System.out.println("2) Введи 5:");              // он сначала выполняет инструкции (как минимум один раз)
            value2 = s.nextInt();                                             // , а потом проверяет условие

        } while (value2 != 5);
        System.out.println("2) Вы наконец-то ввели 5!");



    }
}
