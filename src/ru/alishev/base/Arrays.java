package ru.alishev.base;

public class Arrays {
    public static void main(String[] args){
        int number = 10;
        char character = 'a';
        String str = "Java rush";
        String s1 = "Hello Java"; // новые объекты класса создаются таким способом обычно

        // масив - это тоже ссылочный тип данных
        int[] arr1 = new int[5];  // "5" - это размер массива
                                    // переменная "arr1" ссылается на целочисленный объект (массив), расположенный где-то
        // инициализируем массив, т.к. в "arr1" сейчас пять пустых ячеек, но
        //  Java целочисленный за нас сама инициализирует его (т.е. в нем в каждой ячейке - ноль)
        System.out.println(arr1[0]);  // отсчет элементов идет с "0"
        arr1[0] = 10;
        arr1[1] = 20;  // так долго инициализировать, особенно если в нем 100 значений
                        // поэтому использует цикл "FOR"...

        for (int i = 0; i < arr1.length; i++){          // length = 5   в нашем случа
            arr1[i] = i * 10;
            System.out.println(arr1[i]);
        }
        // альтернативный способ создания массива
        // (когда мы заранее знаем значения
        int[] arr2 = {number, 10, 20, 30};
        printArray(arr2);


    }

    private static void printArray(int[] arr2) {
        for (int i : arr2) {
            System.out.println(i);
        }
    }
}
