package com.ears.pattern.factory.factorymethod;

import com.ears.pattern.factory.ICourse;

public abstract class ICourseFactory {

    public void preCreate() {
//        创建对象前的预处理工作
    }

    public abstract ICourse create();
}
