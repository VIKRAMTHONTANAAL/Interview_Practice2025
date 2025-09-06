public class Fibonacciagain {
    public static void main(String[] args) {
        int num=7;
        System.out.println(fibonacci(num));
    }
    public static int fibonacci(int num){
        if(num<=1){
            return num;
        }
        int fibonacci1=0;
        int fibonacci2=1;
        int current=0;
        for(int i=2;i<=num;i++){
            current=fibonacci1+fibonacci2;
            fibonacci1=fibonacci2;
            fibonacci2=current;
        }
        return current;
    }
}
