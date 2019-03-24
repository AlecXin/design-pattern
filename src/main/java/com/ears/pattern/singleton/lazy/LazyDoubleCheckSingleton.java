package com.ears.pattern.singleton.lazy;

public class LazyDoubleCheckSingleton {
    // volative 解决指令重排序
    private volatile static LazyDoubleCheckSingleton lazy = null;

    private LazyDoubleCheckSingleton() {
    }

    /**
     * 双重检查锁
     * @return
     */
    public static LazyDoubleCheckSingleton getInstance() {
        if (lazy == null) { // 保证县城能够进入
            synchronized (LazyDoubleCheckSingleton.class) {
                if(lazy == null) {  // 避免多次重复创建被覆盖
                    lazy = new LazyDoubleCheckSingleton();
                    // CPU执行时就会转换成JVM指令执行
                    // 1. 分配内存给对象
                    // 2. 初始化对象
                    // 3. 将初始化的对象和内存地址建立关联
                    // 4. 用户初次访问

                    // 2.3 执行顺序可能会打乱，出现指定重排序
                }
            }
        }
        return lazy;
    }
}
