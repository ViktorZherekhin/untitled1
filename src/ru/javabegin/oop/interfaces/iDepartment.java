package ru.javabegin.oop.interfaces;

import java.util.ArrayList;

public interface iDepartment {

    String getName();

    ArrayList<iEmployee> getEmployeeList();  // благодаря такой записи, мы можем добавлять любые коллекции
                                            // которые реализовывают этот интерфейс,
                                            // т.е. в будущем можем масштабировать наше приложение
                                            // без изменения базового кода

    ArrayList<iGoods> getGoodsList();
}
