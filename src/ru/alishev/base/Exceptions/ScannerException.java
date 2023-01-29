package ru.alishev.base.Exceptions;

public class ScannerException extends Throwable {
    // изменим класс, чтобы при создании объекта он принимал на входе message
    public ScannerException(String description1){
        super(description1);  // этот description мы можем передать в класс "Exception",
                             // т.к. если посмотреть описание этого класса, у него перегружены методы,
                            // т.е. можно в качестве аргументов ничего не передавать, можно передать строку, и т.д.
    }
}
