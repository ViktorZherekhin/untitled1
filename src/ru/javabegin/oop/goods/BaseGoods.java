package ru.javabegin.oop.goods;
import ru.javabegin.oop.department.BaseDepartment;
import ru.javabegin.oop.interfaces.iDepartment;
import ru.javabegin.oop.interfaces.iGoods;
public class BaseGoods implements iGoods {

    private double price;
    private boolean hasGuarantee;
    private String name;
    private String company;
    private BaseDepartment department;

    public void setPrice(double price) {
        this.price = price;
    }

    public void setHasGuarantee(boolean hasGuarantee) {
        this.hasGuarantee = hasGuarantee;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setDepartment(BaseDepartment department) {
        this.department = department;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public boolean hasGuarantee() {
        return hasGuarantee;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getCompany() {
        return company;
    }

    @Override
    public iDepartment getDepartment() {
        return department;
    }
}
