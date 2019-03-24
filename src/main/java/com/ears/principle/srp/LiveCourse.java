package com.ears.principle.srp;

public class LiveCourse implements ICourse {

    @Override
    public void study(String courseName) {
        System.out.println(courseName +"不能快进看");
    }
}
