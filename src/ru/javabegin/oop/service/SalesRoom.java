package ru.javabegin.oop.service;

import java.util.ArrayList;

import ru.javabegin.oop.employees.Administrator;
import ru.javabegin.oop.interfaces.iDepartment;
import ru.javabegin.oop.interfaces.iVisitor;

public class SalesRoom {    // Торговый зал (он единственный объект, поэтому для него нет смысла создавать интерфейс

    private ArrayList<iDepartment> departmentList;  // в каждом отделе свои сотрудники
    private String name;
    private ArrayList<iVisitor> visitorList;
    private Administrator administrator;

}
