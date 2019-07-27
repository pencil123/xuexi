import cn.gud.LoginAction;
import cn.gud.UserDaoImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 张鲁燕
 * @since 2019/7/26 11:28
 */
public class Test {

  public static void main(String[] args) {

    ApplicationContext ac = new
        ClassPathXmlApplicationContext("applicationContext.xml");

    /**
     * 1 在使用注解方式实例化bean对象时
     * 由于没有为其设置具体的ID值
     */
    LoginAction la = ac.getBean(LoginAction.class);
    la.execute();
    /**
     * 2 虽然没有手动为其设置ID值
     * 但是注解会自动为其提供一个ID值
     *      类名 首字母小写
     */
    UserDaoImpl ud =
        (UserDaoImpl)ac.getBean("userDaoImpl");

    /**
     * 3 手动为其设置一个ID值
     */
    LoginAction la2 = (LoginAction)ac.getBean("la");
  }
}