public class CompareString {

    public static void main(String[] args) {
        String s1="bala";
        String s2="balu";
        int m=s1.compareTo(s2);

        if(m==0){
            System.out.println(m);
        }else if(m>0){
            System.out.println("s1 is greater than s2");
        } else{
            System.out.println("s1 is less than s2");
        }
    }
}
