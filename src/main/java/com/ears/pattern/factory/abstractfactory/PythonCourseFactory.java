package com.ears.pattern.factory.abstractfactory;

import com.ears.pattern.factory.ICourse;
import com.ears.pattern.factory.JavaCourse;
import com.ears.pattern.factory.PythonCourse;

public class PythonCourseFactory implements ICourseFactory{
    @Override
    public ICourse createCourse() {
        return new PythonCourse();
    }

    @Override
    public INote createNote() {
        return new PythonNote();
    }

    @Override
    public IVideo createVideo() {
        return new PythonVideo();
    }
}
