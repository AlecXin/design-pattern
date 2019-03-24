package com.ears.pattern.factory.factorymethod;

import com.ears.pattern.factory.ICourse;

public class FactoryMethodTest {
    public static void main(String[] args) {
        ICourseFactory factory = new PythonCourseFactory();
        ICourse iCourse = factory.create();
        iCourse.record();
    }
}
