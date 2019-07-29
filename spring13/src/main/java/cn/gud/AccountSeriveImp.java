package cn.gud;

import org.springframework.stereotype.Service;

@Service("accountService")
public class AccountSeriveImp implements AccountService
{
    public void saveAccount() {
        System.out.println("执行了保存");
    }
    public void updateAccount(int i) {
        System.out.println("执行了更新" + i);
    }
    public int deleteAccount() {
        int i =1;
        System.out.println("执行了删除");
        return i;
    }
}