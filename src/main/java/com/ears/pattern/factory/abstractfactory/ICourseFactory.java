package com.ears.pattern.factory.abstractfactory;

import com.ears.pattern.factory.ICourse;

public interface ICourseFactory {
    ICourse createCourse();

    INote createNote();

    IVideo createVideo();
}
