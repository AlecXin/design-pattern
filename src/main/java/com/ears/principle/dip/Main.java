package com.ears.principle.dip;

public class Main {
    public static void main(String[] args) {
//        依赖注入
        Tom tom = new Tom();
        tom.study(new JavaCourse());
        tom.study(new PythonCourse());

        System.out.println("============");

//        构造注入
        TomConstructor tomConstructor = new TomConstructor(new JavaCourse());
        tomConstructor.study();

        System.out.println("============");

//        setter方式注入
        TomSetter tomSetter = new TomSetter();
        tomSetter.setCourse(new JavaCourse());
        tomSetter.study();

        tomSetter.setCourse(new PythonCourse());
        tomSetter.study();
    }
}
