package com.ears.pattern.singleton.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


/**
 * 注册时单例
 */
public class ContainerSingleton {
    private static Map<String, Object> ioc = new ConcurrentHashMap<String, Object>();

    private ContainerSingleton() {
    }

    public static Object getBeanS(String className) {
//        虽然有性能的问题，但是兼顾使用与管理问题，spring就是这样做的
        synchronized (ContainerSingleton.class) {
            if (!ioc.containsKey(className)) {
                Object obj = null;
                try {
                    // 通过反射的方式进行获取bean对象，使用到了工厂模式
                    obj = Class.forName(className).newInstance();
                    ioc.put(className, obj);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            return ioc.get(className);
        }
    }
}
