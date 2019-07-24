package cn.gud;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

public class Index {
    public static void main(String args[]) throws SQLException {
        ApplicationContext act = new ClassPathXmlApplicationContext("applicationContext.xml");
        Car car = (Car) act.getBean("car");
        System.out.println(car);
    }
}