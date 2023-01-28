package Nasledovanie;

public class Developer01 extends Emploee01 {
    public String level;
    public String language;



    public Developer01(String firstName, String lastName, int age, int inn, int number,
                       int snils, String level, String language) {
        super(firstName, lastName, age, inn, number, snils);
        this.level = level;
        this.language = language;
    }
    public void greeting(){
        System.out.println("Привет! Я - программист! Меня зовут " + this.firstName);
    }
}
