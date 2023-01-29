package ru.javabegin.oop.client;
import ru.javabegin.oop.interfaces.iVisitor;

public class BaseVisitor implements iVisitor {

    private String name;

    @Override
    public void buy() {

    }

    @Override
    public void returnGoods() {

    }

    @Override
    public String getName() {       // это геттер, по сути
        return name;
    }
}
