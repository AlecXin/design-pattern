package com.ears.principle.srp;

public class ReplayCourse implements ICourse {
    @Override
    public void study(String courseName) {
        System.out.println(courseName + "可以反复看");
    }
}
