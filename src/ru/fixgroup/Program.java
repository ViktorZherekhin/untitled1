package ru.fixgroup;

import ru.fixgroup.calculator.CostCalculator;
import ru.fixgroup.gruz.Gruz;
import ru.fixgroup.gruz.Table;
import ru.fixgroup.gruz.Box;

public class Program {

    public static void main(String[] args) {

        Table table1 = new Table(12, 2);
        Box box1 = new Box(20, 3);
        CostCalculator сс1 = new CostCalculator(2, 10);


        double cost1 = сс1.calcCost(table1, 20);
        double cost2 = сс1.calcCost(box1, 100);

        System.out.println(cost1);
        System.out.println(cost2);

        }

    }



