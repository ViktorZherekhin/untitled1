package ru.fixgroup.gruz;
import ru.fixgroup.interfaces.iGruz;

public class Gruz implements iGruz {

    private int weight;                      // масса в кг
    private int volume;                     // объем в м3

    public Gruz(int weight, int volume) {
        this.weight = weight;
        this.volume = volume;
    }

    @Override
    public double getWeght() {
        return weight;
    }
}
