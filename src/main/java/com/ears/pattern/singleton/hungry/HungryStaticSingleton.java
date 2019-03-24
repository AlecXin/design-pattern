package com.ears.pattern.singleton.hungry;

/**
 * 饿汉式单例
 *
 * 这种方式有浪费内存空间的嫌疑
 */
public class HungryStaticSingleton {

    private static final HungryStaticSingleton instance;

    static {
        instance = new HungryStaticSingleton();
    }

    private HungryStaticSingleton() {
    }

    public static HungryStaticSingleton getInstance() {
        return instance;
    }
}
