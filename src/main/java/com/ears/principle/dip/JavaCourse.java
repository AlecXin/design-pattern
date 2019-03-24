package com.ears.principle.dip;

public class JavaCourse implements ICourse {
    @Override
    public void study() {
        System.out.println("Tom 在学习 java 课程");
    }
}
