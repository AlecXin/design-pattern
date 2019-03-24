package com.ears.pattern.factory;

public class PythonCourse implements ICourse {
    @Override
    public void record() {
        System.out.println("Start record for python course");
    }
}
