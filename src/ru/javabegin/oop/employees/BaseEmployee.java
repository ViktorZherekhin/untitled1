package ru.javabegin.oop.employees;
import ru.javabegin.oop.interfaces.iEmployee;
import ru.javabegin.oop.interfaces.iDepartment;
public class BaseEmployee implements iEmployee {

    private String name;
    private iDepartment department;
    private boolean free;

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(iDepartment department) {
        this.department = department;
    }

    public void setFree(boolean free) {
        this.free = free;
    }

    @Override
    public String getName() {           // общий метод, доступный для всех дочерних классов
        return name;
    }

    @Override
    public iDepartment getDepartment() {
        return department;
    }

    @Override
    public boolean isFree() {
        return free;
    }
}
