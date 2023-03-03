package OOPsConcept;

public class EncapTest {

    private String name;
    private int age;
    private  int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

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


    public static void main(String[] args) {
        EncapTest s1= new EncapTest ();

        s1.setName ("Osman");
        s1.setAge (25);
        s1.setId(125);

        System.out.println(s1.getName());
        System.out.println(s1.getAge());
        System.out.println(s1.getId());

    }
}
