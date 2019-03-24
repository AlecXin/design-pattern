package com.ears.pattern.factory.simplefactory;

import com.ears.pattern.factory.JavaCourse;

public class SimpleFactoryTest {
    public static void main(String[] args) {

        CourseFactory courseFactory = new CourseFactory();
        JavaCourse java = (JavaCourse) courseFactory.create(JavaCourse.class);
        java.record();
    }
}
