package com.ears.pattern.singleton.lazy;

/**
 * 懒汉式的写法
 *
 * 在多线程的情况下将会出现问题
 */
public class LazySingle {

    private static LazySingle lazy = null;

    private LazySingle() {
    }

//    不可避免的会出现性能问题
    public static LazySingle getInstance() {
        if (lazy == null) {
//            避免多次重复创建被覆盖
            lazy = new LazySingle();
        }
        return lazy;
    }
}
