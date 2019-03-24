package com.ears.principle.lsp;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setHeihgt(10);
        rectangle.setWidth(20);
        resize(rectangle);

        System.out.println("----------------");

        Square square = new Square();
        square.setLength(10);
        resize(square);

    }

    public static void resize(Rectangle rectangle) {
        while (rectangle.getWidth() >= rectangle.getHeihgt()) {
            rectangle.setHeihgt(rectangle.getHeihgt() + 1);
            System.out.println("width: "+ rectangle.getWidth() + ",height:" + rectangle.getHeihgt());
        }

        System.out.println("resize方法结束\n width: " +rectangle.getWidth() + ",height:"+ rectangle.getHeihgt());
    }
}
