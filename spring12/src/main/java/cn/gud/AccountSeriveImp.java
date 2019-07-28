package cn.gud;

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