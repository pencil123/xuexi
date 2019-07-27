package cn.gud;

import org.springframework.stereotype.Component;

/**
 * @author 张鲁燕
 * @since 2019/7/26 11:27
 */
@Component     // <bean id="userDaoImpl" class="xx.UserDaoImpl"/>
public class UserDaoImpl {

  public boolean login(){
    System.out.println("连接数据库判断登录是否成功");
    return true;
  }
}