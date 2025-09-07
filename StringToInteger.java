public class StringToInteger {

    public static void main(String[] args) {
        String s="1234";
        char[] c=new char[s.length()];
        c=s.toCharArray();
        int sum=0;
        for(int i=0;i<s.length();i++){
            int digit=(c[i]-'0');
            sum=(sum*10)+digit;
        }
        System.out.println(sum);
    }
}
