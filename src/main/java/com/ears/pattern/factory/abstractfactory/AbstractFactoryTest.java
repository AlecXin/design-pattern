package com.ears.pattern.factory.abstractfactory;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        ICourseFactory factory = new JavaCourseFactory();
        factory.createCourse().record();
        factory.createNote();
        factory.createVideo();

        ICourseFactory pythonFactory = new PythonCourseFactory();
        factory.createCourse().record();
        factory.createNote();
        factory.createVideo();
    }
}
