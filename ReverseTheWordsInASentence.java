import java.util.StringTokenizer;

public class ReverseTheWordsInASentence {


    public static void main(String[] args) {
        String s="this is india true";

        StringTokenizer token=new StringTokenizer(s," ");

        while(token.hasMoreTokens()==true){

            String word=token.nextToken();
//            System.out.print(word+" ");

            for(int j=word.length()-1; j>=0;j--)
            {
                System.out.print(word.charAt(j));
//                System.out.print(j+" ");
            }
            System.out.print(" ");
        }
    }
}
