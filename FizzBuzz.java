import java.util.HashMap;
import java.util.Map;

public class FizzBuzz {

    public static void main(String[] args) {

        int num=20;
        int div1=3;
        int div2=5;

        for(int i=1;i<=num;i++){
            if(i%div1==0 && i%div2==0){
                System.out.print("FizzBuzz ");
            }else if(i%div1==0){
                System.out.print("Fizz ");
            }else if(i%div2==0){
                System.out.print("Buzz ");
            }else{
                System.out.print(i+" ");
            }
        }

    }
}
