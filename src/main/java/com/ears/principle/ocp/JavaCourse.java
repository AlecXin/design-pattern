package com.ears.principle.ocp;

public class JavaCourse implements ICourse {

    private Integer Id;
    private String name;
    private Double price;

    public JavaCourse(Integer id, String name, Double price) {
        Id = id;
        this.name = name;
        this.price = price;
    }

    public Integer getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }
}
