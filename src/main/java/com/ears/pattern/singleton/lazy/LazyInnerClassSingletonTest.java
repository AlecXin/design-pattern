package com.ears.pattern.singleton.lazy;

import java.lang.reflect.Constructor;

public class LazyInnerClassSingletonTest {
    public static void main(String[] args) {
        try {
            // 使用反射的方式，不走寻常路，破坏了单例
            Class<?> clazz = LazyInnerClassSingleton.class;
            Constructor c = clazz.getDeclaredConstructor(null);
            c.setAccessible(true);
            Object o1 = c.newInstance();

            LazyInnerClassSingleton o2 = LazyInnerClassSingleton.getInstance();

            System.out.println(o1 == o2);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
