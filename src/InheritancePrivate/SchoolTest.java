package InheritancePrivate;

public class SchoolTest {
    public static void main(String[] args) {

        Teacher t1=new Teacher();
        t1.setName("Anis");
        t1.setAge(50);
        t1.setQualification("MBA");

        System.out.println("Name is : "+t1.getName());
        System.out.println("Age is : "+t1.getAge());
        System.out.println("Qualification is : "+t1.getQualification());
    }
}
