package PolymorphismOverride;

public class SchoolMain {

    public static void main(String[]args){

        Student s=new Student();
        Teacher t=new Teacher();
        Guardian g=new Guardian();

        s.learnIt();
        t.learnIt();
        g.learnIt();
    }
}

