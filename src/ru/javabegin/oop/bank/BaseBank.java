package ru.javabegin.oop.bank;

import ru.javabegin.oop.interfaces.iBank;

public class BaseBank implements iBank {    // "BaseBank" является прмежуточным звеном между
                                                    // интерфейсом и классами "Sberbank" и "VTB"
                                                    // такая структура лучше, чтобы для каждого конкретного банка
                                                   // не прописывать методы ("name()", и т.д.)
                                                    // и поля ("name", и т.д.)

    String name;                // это будут общие свойства
    String creditDescription;   // для всех дочерних классов, чтобы в каждом их не прописывать

    @Override                       // эта метка означает, что метод переопределен
    public void checkInfo() {

    }

    @Override
    public void giveCredit() {

    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getCreditDescription() {
        return creditDescription;
    }
}
