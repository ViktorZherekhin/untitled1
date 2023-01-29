package ru.javabegin.oop.interfaces;

public interface iVisitor {
    void buy();
    void returnGoods();
    String getName();   // чтобы все посетители имели имя
}
