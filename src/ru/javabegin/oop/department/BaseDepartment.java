package ru.javabegin.oop.department;

import java.util.ArrayList;
import ru.javabegin.oop.interfaces.iDepartment;
import ru.javabegin.oop.interfaces.iEmployee;
import ru.javabegin.oop.interfaces.iGoods;

public class BaseDepartment implements iDepartment {

    private String name;
    private ArrayList<iEmployee> employeeList;  // здесь указали интерфейсы (iEmployee, iGoods)
    private ArrayList<iGoods> goodsList;        // чтобы код был гибким,
                                                // чтобы мы могли сделать любую реализацию интерфейса.

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployeeList(ArrayList<iEmployee> employeeList) {
        this.employeeList = employeeList;
    }

    public void setGoodsList(ArrayList<iGoods> goodsList) {
        this.goodsList = goodsList;
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public ArrayList<iEmployee> getEmployeeList() {
        return employeeList;
    }

    @Override
    public ArrayList<iGoods> getGoodsList() {
        return goodsList;
    }
}
