public class ArrayOfStings {
    public static void main(String[] args) {

        String[] str1 = new String[5];    // задали массив из строк
        // их также все надо инициализировать
        str1[0] = "Привет!";
        str1[1] = "Пока!";
        str1[2] = "Вообще!";
        for (int i = 0; i < str1.length; i++){
            System.out.println(str1[i]);
        }
        System.out.println();  // вывели пустую строку

        // но для массивов более удобен цикл "FOR-EACH"
        for (String s:str1) {    // тип данных, имя переменной : имя массива
            System.out.println(s);
        }
        System.out.println();

        int[] arr1 = {1, 2, 7};
        int sum = 0;
        for (int x:arr1) {
            System.out.println(x);
            sum = sum + x;              // НЕ ПОНЯЛ почему вместо "х" у нас значения элементов массива ??????
        }
        System.out.println(sum);
    }
}
