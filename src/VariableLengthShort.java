public class VariableLengthShort {

        void add (int ... num){
            int sum = 0;
            for ( int x:num){
                sum = sum + x;
            }

            System.out.println(sum);
        }

        public static void main(String[] args) {
            VariableLengthShort ob = new VariableLengthShort();
            ob.add (10, 20);
            ob.add (10, 20, 30);
            ob.add (10, 20, 30, 40);
            ob.add (10, 20, 30, 40, 50);
            ob.add (10, 20, 30, 40, 50, 60);
        }
    }


