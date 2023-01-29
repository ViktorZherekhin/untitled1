package ru.javabegin.oop.goods;

public class HardDrive extends ElectronicDevice {

    private int volume;

    public void copy() {

    }

    public void delete() {

    }

    @Override
    public void on() {
        // super.on();   по-умолчанию
        // специфичное включение жесткого диска
    }

    @Override
    public void off() {
        // super.off();
        // специфичное отключение жесткого диска
    }
}
