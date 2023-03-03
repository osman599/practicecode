package Static;

public class Static3 { //Static3 replace with Student
    static int count= 0;

    Static3(){
        count++;

    }
    void totalStudent (){
        System.out.println("Total student = "+count);
    }

    public static void main (String[]args){

        Static3 s1= new Static3();
        s1.totalStudent();

        Static3 s2= new Static3();
        s2.totalStudent();

        Static3 s3= new Static3();
        s3.totalStudent();


    }
}
