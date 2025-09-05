public class ArmstrongNumber {
    public static void main(String[] args) {
        int num=372;

        if(isArmstrongNumber(num)){
            System.out.println("this is an armstrong number");
        }else{
            System.out.println("this is not an armstrong number");
        }
    }
    public static boolean isArmstrongNumber(int n){
        int number=n;
        int armstrongNumber=0;
        int count=0;

        while(n!=0){
            n=n/10;
            count++;
        }
        n=number;

        while(n!=0){
            int digit=n%10;
            n=n/10;
            armstrongNumber=armstrongNumber+(int)Math.pow(digit,count);
        }
        System.out.println("number "+number);
        System.out.println();
        System.out.println("armstrong "+armstrongNumber);

        if(number==armstrongNumber){
            return true;
        }
        else {
            return false;
        }

    }

}
