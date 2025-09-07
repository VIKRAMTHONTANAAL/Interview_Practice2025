public class PrimeNumberCheck {

    public static void main(String[] args) {

        int n = 13;
        boolean isPrime=true;

        if(n<=1){
            System.out.println("not a prime");;
        }else {

            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println("it is prime");
            } else {
                System.out.println("it is not prime");
            }
        }
    }
}
