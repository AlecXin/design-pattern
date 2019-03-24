package com.ears.pattern.factory.factorymethod;

import com.ears.pattern.factory.ICourse;
import com.ears.pattern.factory.PythonCourse;

public class PythonCourseFactory extends ICourseFactory {
    @Override
    public ICourse create() {
        return new PythonCourse();
    }
}
