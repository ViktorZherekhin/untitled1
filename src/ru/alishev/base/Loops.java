package ru.alishev.base;

public class Loops {
    public static void main(String[] args) {
        /** цикл WHILE
         * выполняется, пока условие == true
         */
        int i = 0;
        while (i < 5) {  // в круглых скобках - условие, в фигурных - тело цикла
            System.out.println("while " + i);   // получится безконечный цикл, т.к. 0 всегда меньше 5
            i = i + 1;  // с этим действием, цикл станет конечным
        }
/** цикл FOR
 * условие делится на 3 блока:
 * в 1-м - декалрирется переменнная-счетчик,
 * во 2-м - до каких пор будет вполняться цикл
 * в 3-м - что будем производить с переменной-счетчиком каждую итерацию уикла
 *
 */
        for(int j = 0; j <= 3; j = j + 1) {
            System.out.println("ForA " + j);// i = i + 1 КОРОЧЕ ЗАПИСЫВАЕТСЯ КАК I++
        }

        for(int k = 10; k >= 0; k = k - 3) {
            System.out.println("ForB " + k);
        }

        /** оператор IF
         *
         */

        if (5 < 5){
            System.out.println("IF выполнился");
        } else if (i == 0) {
            System.out.println("выполнился ELSE IF " + i);
        }
        else {
            System.out.println("выполнился ELSE " + i);
        }

    }
}
