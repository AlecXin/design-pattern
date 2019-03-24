package com.ears.principle.dip;

public class PythonCourse implements ICourse {
    @Override
    public void study() {
        System.out.println("Tom 在学习 Python 课程");
    }
}
