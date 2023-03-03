package Static;

public class Static2 {// Static2 replace with Student
    String name= "Osman";
    int id= 101;
    static String UniversityName="Royal University";

    public static void main (String[]args){

        Static2 ob= new Static2 ();
        System.out.println("Name : "+ob.name);
        System.out.println("ID : "+ob.id);

        System.out.println("Name : "+Static2.UniversityName);//without object declare execute by class
    }
}
