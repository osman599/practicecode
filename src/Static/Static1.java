package Static;

public class Static1 { //Static1 replace with Student
    String name;
    int id;
    static String UniversityName="Royal University";

    Static1(String n, int i){
        name= n;
        id= i;
    }
    void displayInformation (){
        System.out.println("Name : "+name);
        System.out.println("ID : "+id);
        System.out.println("University Name : "+UniversityName);
    }
    public static void main (String[]args){
        Static1 s1 = new Static1("Osman", 101);
        s1.displayInformation();

        Static1 s2 = new Static1("Osaman", 102);
        s2.displayInformation();
    }
}
