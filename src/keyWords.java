import java.text.MessageFormat;

public class keyWords {
    public static void main(String[] args) {
        Human human1 = new Human();             // создали объект класса "Human" (а сам класс задан ниже)
        human1.setAge(18);
        human1.setName("Viktor");
        human1.getInfo();
    }
}
        // ключевое слово "This"

class Human {
    String name;
    int age;

    // создадим Сеттеры и Геттеры
             // public void setName(String myName){    - так задавали раньше.
             //     name = myName;                      Но нагляднее использовать такое же имя параметра
             //  }                                      как и у объекта (класса). Это best practices.
             //                                          Для этого надо использовать ключевое слово "This":
             //                                         Оно вызывает объект этого класса (для которого вызвали метод0
            //                                                      "SetName", к примеру)
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void getInfo(){
        //System.out.println(name + ", " + age + "__" + name);
        System.out.println(MessageFormat.format("Имя: {0}, возраст: {1}",
                name,
                age));
    }

}




