package ru.alishev.base.Polymorthyzm;

public class Polymorthyzm {
    public static int add(int a1, int a2){
        int a3 = a1 + a2;
        return a3;
    }
    public static String add(String a1, String a2){     // это, как понял, называется "Перегрузка методов"
        String a3 = a1 + a2;
        return a3;
    }

    public static void main(String[] args) {        // это т.н. мнимый (ad-hoc) Полиморфизм
        System.out.println(add(12,12));             // когда методы с одним и тем же названием
        System.out.println(add("12","12"));        // выполняют различные действия в зависимости от входных
        // параметров (от типов данных)
    }
}
