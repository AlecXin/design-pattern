###### 单例模式

> 确保一个类在所有模式下绝对都只有一个实例

- ServletContext
- ServletConfig
- ApplicationContext
- DBPool


###### 常见写法
- 饿汉式单例 ： 这种方式实现需要考虑序列化与反序列化破坏单例的case
- 懒汉式单例： 需要考虑多线程（线程间的时间片争取，导致初始化对象和对象建立关联的两个步骤出现重排序）问题
- 注册式单例： 
- ThreadLocal单例：  使用ThreadLocal来动态切换数据源（数据源路由）


###### 单例优缺
- 优

1. 内存中只有一个实例，减少内存开销
2. 可以避免资源的多重占用
3. 设置全局访问点，严格控制访问

- 缺

1. 没有接口，扩展困难，修改单例对象，只能修改代码

###### 单例考虑点
1. 构造私有化
2. 线程安全
3. 延迟加载
4. 序列化和反序列化的破坏
5. 反射攻击