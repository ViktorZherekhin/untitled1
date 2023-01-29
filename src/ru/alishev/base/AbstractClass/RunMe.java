package ru.alishev.base.AbstractClass;

public class RunMe {
    public static void main(String[] args) {
        Cow cow1 = new Cow();
        Mouse mouse1 = new Mouse();
        cow1.makingSound();
        mouse1.makingSound();
        cow1.eat();             // и корова и мышь будут наследовать один и тот же метод "eat()"
        mouse1.eat();
    }
}
