package com.ears.pattern.factory.simplefactory;

import com.ears.pattern.factory.ICourse;

public class CourseFactory {
    public ICourse create(Class clazz) {

        try {
            return (ICourse) clazz.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
