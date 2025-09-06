import java.util.StringTokenizer;

public class NumberOfWords {


    public static void main(String[] args) {
        String s="raja ram mohan roy";
        int count=0;

        StringTokenizer tokenizer=new StringTokenizer(s," ");
        while(tokenizer.hasMoreTokens()==true){
            String token= tokenizer.nextToken();
            System.out.println(token);
            count++;
        }
        System.out.println(count);
    }
}
