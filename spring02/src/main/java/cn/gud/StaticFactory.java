package cn.gud;

/**
 * 方式二、使用静态工厂中的方法创建对象
 * 需要使用bean标签的factory-method 属性，指定静态工厂中创建对象的方法
 */
public class StaticFactory {
    public static Car getCar(){
        return new Car();
    }
}