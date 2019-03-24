package com.ears.principle.dip;

public class TomSetter {
    private ICourse course;

    public void setCourse(ICourse course) {
        this.course = course;
    }

    public void study() {
        this.course.study();
    }
}
