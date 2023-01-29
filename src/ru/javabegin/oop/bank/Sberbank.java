package ru.javabegin.oop.bank;

public class Sberbank extends BaseBank {
    @Override
    public void checkInfo() {       // Сбербанк по-своему делает проверку
        super.checkInfo();          // и по своему выдает кредит
    }                               // т.е. здесь переопределили методы
                                    // но строго согласно интерфейсу
    @Override
    public void giveCredit() {
        super.giveCredit();
    }
}
