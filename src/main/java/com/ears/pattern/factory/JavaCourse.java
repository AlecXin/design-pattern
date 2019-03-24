package com.ears.pattern.factory;

public class JavaCourse implements ICourse {
    @Override
    public void record() {
        System.out.println("Start record for java course");
    }
}
