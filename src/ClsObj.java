
public class ClsObj {

        String name;
        String department;
        int phone;

        public static void main (String[]args){

            ClsObj teacher1 = new ClsObj();
            teacher1.name = "Mainul Hasan";
            teacher1.department = "JVM";
            teacher1.phone = 1798684399;

            System.out.println("Name : "+teacher1.name);
            System.out.println("department : "+teacher1.department);
            System.out.println("phone : "+teacher1.phone);

            ClsObj teacher2 = new  ClsObj ();
            teacher2.name = "Robiul Islam";
            teacher2.department = "JVM";
            teacher2.phone = 1798684396;

            System.out.println("Name : "+teacher2.name);
            System.out.println("department : "+teacher2.department);
            System.out.println("phone : "+teacher2.phone);

            ClsObj  teacher3 = new  ClsObj ();
            teacher3.name = " Shadhin";
            teacher3.department = "JVM";
            teacher3.phone = 1798684395;

            System.out.println("Name : "+teacher3.name);
            System.out.println("department : "+teacher3.department);
            System.out.println("phone : "+teacher3.phone);

        }

    }

