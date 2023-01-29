package ru.javabegin.oop.goods;
import ru.javabegin.oop.interfaces.iElectronicDevice;

public class ElectronicDevice extends BaseGoods implements iElectronicDevice {

    @Override
    public void on() {
            // общая реализация
    }

    @Override
    public void off() {
        // общая реализация
    }
}
