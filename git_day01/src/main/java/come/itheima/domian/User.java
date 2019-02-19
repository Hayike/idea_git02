package come.itheima.domian;

public class User {

    private  String name;
    private  String id;

    private int age;
    private String phone;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public User(String name, String id, int age, String phone) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.phone = phone;
    }
}
