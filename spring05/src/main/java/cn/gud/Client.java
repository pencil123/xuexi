package cn.gud;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * set方法注入
 */
public class Client {
    public static void main(String[] args) {
        //创建容器
        ClassPathXmlApplicationContext cac = new ClassPathXmlApplicationContext("service.xml");
        //获取bean对象
        CustomerServiceImpl cs = (CustomerServiceImpl) cac.getBean("CustomerServiceImpl");
        //调用方法
        cs.saveCustomer();
    }
}
