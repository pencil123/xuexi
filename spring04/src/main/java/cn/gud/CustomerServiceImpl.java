package cn.gud;

public class CustomerServiceImpl implements CustomerService {
    private String name ;
    private Integer age;

    public CustomerServiceImpl(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void saveCustomer() {
        System.out.println("CustomerServiceImpl-saveCustomer-" + name + "-" + age);
    }
}
