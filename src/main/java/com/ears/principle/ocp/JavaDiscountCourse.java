package com.ears.principle.ocp;

public class JavaDiscountCourse extends  JavaCourse {

    public JavaDiscountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }

    public Double getOriginPrice() {
        return super.getPrice();
    }

    public Double getPrice() {
        return super.getPrice();
    }

}
