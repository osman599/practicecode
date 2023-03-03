package Static;

public class StaticMethod {


        void display1 (){
            System.out.println(" I am non Static method ");

        }
        static void display2 (){
            System.out.println( " I am Static method ");
        }

        public static void main (String[]args){

            StaticMethod s1= new StaticMethod();
            s1.display1 ();

            StaticMethod.display2 ();// when work with static method you have no need object declare

        }
    }


