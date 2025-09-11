import java.util.ArrayList;
import java.util.List;

public class FibonacciRecursion {
    public static void main(String[] args) {
        int count=0;
        //0,1,1,2,3,5,8,13,21,34,55
        System.out.println(fibonacci(count));
    }
    public static int fibonacci(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }

        return fibonacci(n-1)+fibonacci(n-2);
    }
}

