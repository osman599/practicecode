package InheritancePrivate;

public class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    void School (){
        System.out.println("Name is : "+getName());
        System.out.println("Age is : "+getAge());

    }

}
