package cn.gud;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component("logger")
@Aspect
public class Logger
{
    @Pointcut(value="execution(* cn.gud.AccountSeriveImp.*(..))")
    public void pt() {}
    /*
     * @Description //TODO 打印日志, 让其在切入点方法执行之前执行
     **/
    @Before("pt()")
    public void printLog(){
        System.out.println("Logger[printLog] is stating.....");
    }
}
