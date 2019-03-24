package com.ears.principle.dip;

public class TomConstructor {
    private ICourse course;
    public TomConstructor(ICourse course) {
        this.course = course;
    }

    public void study() {
        this.course.study();
    }
}
