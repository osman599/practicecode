public class Method {

        String name;
        String department;
        int phone;

    void displayInformation (){
        System.out.println("Name : "+name);
        System.out.println("department : "+department);
        System.out.println("phone : "+phone);
    }

    public static void main (String[]args){

            Method teacher1 = new Method();
            teacher1.name = "Mainul Hasan";
            teacher1.department = "JVM";
            teacher1.phone = 1798684399;
            teacher1.displayInformation ();

            Method teacher2 = new Method();
            teacher2.name = "Robiul Islam";
            teacher2.department = "JVM";
            teacher2.phone = 1798684396;
            teacher2.displayInformation ();

            Method teacher3 = new Method();
            teacher3.name = " Shadhin";
            teacher3.department = "JVM";
            teacher3.phone = 1798684395;
            teacher3.displayInformation ();

        }

    }