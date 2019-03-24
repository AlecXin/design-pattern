
###### 原型模式

原型实例指定创建对象的种类，通过拷贝这些原型创建新的对象


调用者不需要知道任何细节，不调用构造函数

##### 使用场景
1. 类初始化消耗资源多
2. new产生一个对象需要非常繁杂的过程（数据准备、访问权限等）
3. 构造函数比较复杂
4. 循环体中产生大量对象时

###### 现有demo
1. BeanUtils.copy()
2. JSON.parseObject()
3. Guava 工具类

原型模式就是快速构建对象方法的总结，简单工厂，将getter和setter封装到某个方法中，用户调用无须关心

JDK实现cloneable接口，实现快速复制

