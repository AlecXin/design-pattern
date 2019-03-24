package com.ears.principle.carp;

public class Main {
    public static void main(String[] args) {
        ProductDao productDao = new ProductDao();
        productDao.setDbConection(new OracleConnection());
        productDao.addProduct();
    }
}
