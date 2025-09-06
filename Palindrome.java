import java.util.Arrays;

public class Palindrome {
    public static void main(String[] args) {
        String s1="abc";

        char org[]=s1.toCharArray();
        char rev[]=new char[s1.length()];
        for(int m=s1.length()-1,n=0;m>=0;m--,n++){
            rev[n]=org[m];

        }
        if(Arrays.equals(org,rev)){
            System.out.println("string is a palindrome");
        }else{
            System.out.println("string is not a palindrome");
        }

    }
}
