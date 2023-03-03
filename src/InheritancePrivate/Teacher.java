package InheritancePrivate;

public class Teacher extends Person{

    private String qualification;

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }
    void School2 (){
        School();
        System.out.println("Qualification is : "+qualification);
    }
}
