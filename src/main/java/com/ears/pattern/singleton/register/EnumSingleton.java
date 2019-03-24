package com.ears.pattern.singleton.register;


/**
 * 枚举实现单例
 *
 * 1. 创建对象的时候是使用饿汉式单例的写法
 * 2. 在单例对象获取的过程中使用功能的是注册式单例的写法
 *    Enum.valueOf((Class)c1, name)  这个是底层的实现方法
 *      c1 是枚举的类名
 *      name 是枚举的属性
 *
 *
 *  在编译之后的代码中不会存在空构造的构造函数，并且在源码中处理的时候
 *  clazz.getModifiers() & Modifier.ENUM != 0 成立的时候，将会抛出IllegalArgumentException 异常
 *
 *
 *  从jdk层面就为诶局不背序列化和反射破坏保驾护航  NB
 */
public enum  EnumSingleton {
    INSTANCE;

    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumSingleton getInstance() {
        return INSTANCE;
    }

}
