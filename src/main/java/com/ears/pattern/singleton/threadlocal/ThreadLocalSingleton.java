package com.ears.pattern.singleton.threadlocal;


/**
 * 本质是容器是单例
 *
 * 能够保证线程内的全局唯一，一个线程内部是能够保证线程安全，不是全局的线程安全
 *
 * 同一个线程是安全的，能够保证一个线程实例化的所有单例对象是相同的
 * 跨线程间的单例对象是不同的值
 *
 * 存在一个map对象
 * threadLocalMap<Thread, (initialValue() method return value)> 这种方法就保证了当前前程是唯一的
 *
 *
 * 应用场景： 使用ThreadLocal来动态切换数据源
 */
public class ThreadLocalSingleton {

    private ThreadLocalSingleton() {}

    private static final  ThreadLocal<ThreadLocalSingleton> threadLocalInstance = new ThreadLocal<ThreadLocalSingleton>() {
        @Override
        protected ThreadLocalSingleton initialValue() {
            return new ThreadLocalSingleton();
        }
    };


    public static ThreadLocalSingleton getInstance() {
        return threadLocalInstance.get();
    }


}
