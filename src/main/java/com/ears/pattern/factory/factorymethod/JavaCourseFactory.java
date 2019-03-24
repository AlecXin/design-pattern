package com.ears.pattern.factory.factorymethod;

import com.ears.pattern.factory.ICourse;
import com.ears.pattern.factory.JavaCourse;

public class JavaCourseFactory extends ICourseFactory {
    @Override
    public ICourse create() {
        return new JavaCourse();
    }
}
