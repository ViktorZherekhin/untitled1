package ru.alishev.base.Nasledovanie;



public class Person01 {
    public String firstName;
    public String lastName;
    public int age;

    public static void main(String[] args) {
        Person01 pers1 = new Person01("Ivan", "Petrov", 80);
        Emploee01 emp1 = new Emploee01("Viktor", "Zherekhin", 35,
                                        2345667, 1111111, 000);  // надо все это задать
                                                                                // потому что у нас такой конструктор
        Developer01 dev1 = new Developer01("Bob", "Brown", 19,
                                           4578, 487874, 7987,
                                            "Junior", "Java");

        dev1.getFullName();  // таким образом, метод прописан для родительского класса, но работает и
                            // в классе-наследнике
        pers1.greeting();  // это тоже, как понял, проялвение Полиморфизма
        emp1.greeting();    // но на канале "Ulbi TV" есть еще вариант через создание массива
        dev1.greeting();     // (у меня не получилось сделать)


    }

    public Person01(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFullName(){  // метод сам придумал - потом подумать. Сейчас не работает.
        String str1;                        // но при его вызове   (см. выше) ошибки не возникает
        str1 = this.firstName;
        return str1;
    }


    public void greeting(){
        System.out.println("Привет! Я - человек! Меня зовут " + this.firstName);
    }

}
