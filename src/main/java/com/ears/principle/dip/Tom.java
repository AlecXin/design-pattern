package com.ears.principle.dip;

public class Tom {
    public void study(ICourse course) {
        course.study();
    }
}
