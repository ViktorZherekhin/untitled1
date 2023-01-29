package ru.javabegin.oop.employees;

import ru.javabegin.oop.bank.BaseBank;
import ru.javabegin.oop.interfaces.iBank;

public class Banker extends BaseEmployee {

    private iBank bank;         // сюда мы можем записать любой банк, который реализовывает "iBank"

    public void sendRequest() {

    }
}
