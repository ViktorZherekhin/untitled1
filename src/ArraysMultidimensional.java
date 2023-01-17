public class ArraysMultidimensional {
    public static void main(String[] args) {
        int[] num = {1, 2, 3};  // одномерный массив создали
        int[] num2 = new int[5];  // альтернативная запись
        System.out.println(num[1]);

        int[][] matrice = new int[3][5];
        String[][] str1 = new String[2][3];
        str1[0][1] = "Privet";                      // инициализация одного из элементов 2-мерного массива
        int[][] matrice2 = {{1, 2, 3, 17, 90},       // матрица не обязательно должна быть квадратной
                            {4},
                            {7, 8, 9}};
        System.out.println(matrice2[0][4]);    // выведем элемент 1-й строки, 5-го столбца
                                            // т.е. сначала выбираем строку, а затем нужный элемент 1-мерного массива

        int[][] matrice3 = {{1, 2, 3},
                            {4, 5, 6},
                            {7, 8, 9}};
        // чтобы его вывести на экран, надо использовать вложенный цикл
        // при этом внутренний цикл будет проходить по строкам, а внешний - по столбцам
        for (int i = 0; i < matrice3.length; i++){   // это внешний цикл. Matrice.Length = 3
            for (int k = 0; k < matrice3[i].length; k++) {  // matrice3[0] - это обращение к 1-й строке массива
                System.out.print(matrice3[i][k] + ", ");
            }
            System.out.println();
        }
    }
}
