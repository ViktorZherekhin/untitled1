package Nasledovanie;



public class Person01 {
    public String firstName;
    public String lastName;
    public int age;

    public static void main(String[] args) {
        Emploee01 emp1 = new Emploee01("Viktor", "Zherekhin", 35,
                                        2345667, 1111111, 000);  // надо все это задать
                                                                                // потому что у нас такой конструктор
    }

    public Person01(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
}
