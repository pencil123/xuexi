package cn.gud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author 张鲁燕
 * @since 2019/7/26 11:26
 */
@Component("la")   // <bean id="la" class="xx.LoginAction"/>
public class LoginAction {

  @Autowired
  private UserDaoImpl ud;
  /**
   * 首先根据被标注属性的属性名'ud'
   * 在ioc容器中查找一个 id="ud" 的bean进行注入
   * 再根据被标注属性的属性类型 'UserDaoImpl'
   * 在ioc容器中查找一个 class="UserDaoImpl" 的bean进行注入
   * @return
   */


  public String execute() {
    System.out.println("处理客户端提交的login.action请求");
    ud.login();
    return "success";
  }
}