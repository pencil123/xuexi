package cn.gud;

public class CustomerServiceImpl implements CustomerService {
    private String name ;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public void saveCustomer() {
        System.out.println("CustomerServiceImpl-saveCustomer-" + name + "-" + age);
    }
}