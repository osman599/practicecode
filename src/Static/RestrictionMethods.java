package Static;

public class RestrictionMethods { //RestrictionMethods replace with Student

        static int x=10;
        void display1 (){
                            // non-static method are supporting to static method
            System.out.println(" I am non Static method ");

        }
        static void display2 (){
                                      // static method are not support to non-static method
            System.out.println(" "+x);
            System.out.println( " I am Static method ");
        }

        public static void main (String[]args){

            RestrictionMethods.display2 ();// when work with static method you have no need object declare

        }
    }

