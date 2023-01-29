package ru.alishev.base;

public class BreakContinue {
    public static void main(String[] args){
        // Break используется для выхода из цикла
        int i = 0;
        while(true){            // создали безконечный цикл
            if (i == 15) {
                break;
            }
            System.out.println(i);
            i++;
        }
        System.out.println("Мы вышли из цикла!");

        for (int k = 0; k <= 15; k++) {
            if (k%2 == 0) {     // остаток от деления (т.е. если четное число, то переходим на след. итерацию)
                continue;  // все команды после "continue" (в цикле "FOR") не выполняются.
                            // "COntinue" просто еще раз инкрементирует счетчик
            }
            System.out.println("Это нечетное число! " + k);
        }
    }
}
