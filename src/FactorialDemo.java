public class FactorialDemo {
    int fact (int n){
        if (n==1)
            return 1;
        else
            return n*fact(n-1);

    }
    public static void main(String[] args) {
        int num=5, fact=1;
        for (int i=1; i<=num; i++){
            fact=fact*i;
        }
        System.out.println(fact);
    }
}
