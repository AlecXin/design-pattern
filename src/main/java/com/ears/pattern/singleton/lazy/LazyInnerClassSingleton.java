package com.ears.pattern.singleton.lazy;


// 未使用synchronize关键字，性能上不会打折扣
public class LazyInnerClassSingleton {
    private LazyInnerClassSingleton() {

        // 下面的考虑点将会在构造中的空判断进行解决
        // 问题：有可能会被反射私有化
        // 构造是被私有化了，但是逃不过反射的攻击

        // 这里解决反射的方式构造单例的实例，解决不走寻常路的反射攻击方式
        if (LazyHolder.LAZY != null) {
            throw new RuntimeException("不允许构建多个实例");
        }
    }

    // 懒汉式单例
    // LazyHolder 需要等到外部的方法
    // JVM 底层的实现逻辑，完美避免线程安全问题
    public static final LazyInnerClassSingleton getInstance() {
        return LazyHolder.LAZY;
    }

    private static class LazyHolder{
        private static final LazyInnerClassSingleton LAZY = new LazyInnerClassSingleton();
    }

//    重写readResolve方法，只不过是覆盖了反序列化出来的对象
//    最终还是创建了两次，但是发生在JVM底层，相对来说还是比较安全的
//    之前反序列化的结果将会被GC进行回收
    private Object readResolve() {
        return LazyHolder.LAZY;
    }
}
