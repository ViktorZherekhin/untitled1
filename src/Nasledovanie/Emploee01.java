package Nasledovanie;

public class Emploee01 extends Person01 {
    public int inn;
    public int number;
    public int snils;

    public Emploee01(String firstName, String lastName, int age, int inn, int number, int snils) {
        super(firstName, lastName, age);                // Конструктор по-умолчнию наследуется
        this.inn = inn;                                 // т.е. при создании объекта этого класса
        this.number = number;                           // нужно будет задать конкретные значения
        this.snils = snils;                             // полей "firstName", "lastName" и "age".
    }                                                   // т.е. класс "Emploee" унаследовал все
                                                        // свойства и методы класса "Person".
                                                        // Плюсом к нему добавились его собственные поля.
                                                        // "super" означает, что в первую очередь будет вызван
                                                        // родительский конструктор

    // Такая же система будет если дальше продолжим иерархию (от общего к частному):
    // Человек -> Сотрудник -> Разработчик
    // к последнему можно добавить свойства (уровень - junior, middle, senio; язык разработки - Java, Python).

}
