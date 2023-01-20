package Interfaces;

public interface Info {
    public void showInfo();   // здесь задали только сигнатуру метода
}

/*
    Интерфес не задает реализацию - он задает каркас.
    Поэтому у не может быть тела метода, а только сигнатура
    Реализация метода showInfo() у классов "Animal" и "Person"
    будет разной, т.к. у них разные поля (String VS int)
 */