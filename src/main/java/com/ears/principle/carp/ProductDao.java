package com.ears.principle.carp;

public class ProductDao {
    private DBConection dbConection;

    public void setDbConection(DBConection dbConection) {
        this.dbConection = dbConection;
    }

    public void addProduct() {
        String connection = dbConection.getConnection();
        System.out.println("使用 " + connection + " 增加产品");
    }
}
