package cn.gud;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 剧组类,主方法
 */
public class Client {
    public static void main(String[] args) {
        final Actor actor = new Actor();
        /**
         * 涉及的类：Enhancer
         * 创建代理对象的方法：create()
         * 该方法的参数：
         *        Class:被代理对象的字节码
         *        Callback:如何代理，作用同方法一的InvocationHandler
         */
        Actor proxyActor  = (Actor) Enhancer.create(actor.getClass(), new MethodInterceptor() {
            /**
             * 执行被代理对象的方法都会经过该方法，作用同方法一的invoke()
             * Object proxy：代理对象的引用。不一定每次都会有
             * Method method：当前执行的方法
             * Object[] args：当前执行方法所需的参数
             * MethodProxy methodProxy:当前执行方法的代理对象，一般不用
             * @return
             * @throws Throwable
             */
            public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
                Object ret=null;
                //1.取出执行方法中的参数
                Float money = (Float) args[0];
                //2.判断当前执行的什么方法
                if ("basicAct".equals(method.getName())){
                    if (money>10000)
                        ret = method.invoke(actor,money);
                }
                if ("advancedAct".equals(method.getName())){
                    if (money>50000)
                        ret = method.invoke(actor,money);
                }
                return ret;
            }
        });
        proxyActor.advancedAct(500000);
    }
}
