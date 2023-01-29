package ru.javabegin.oop.client;

public class VipVisitor extends BaseVisitor {

 // private String name;  - эту переменную не нужно дублировать. Она уже есть в классе-родителе
    private int discount;

    private boolean checkDiscount() {
        return (discount > 0);
    }

    @Override
    public void buy() {
        if (!checkDiscount()) {
            super.buy();
        } else {
            // купить со скидкой
        }
    }
}
