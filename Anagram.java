import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String s1=args[0];
        String s2=args[1];

        if(isAnagram(s1,s2)){
            System.out.println("This is an anagram");
        }else{
            System.out.println("This is not an anagram");
        }
    }

    public static boolean isAnagram(String s1, String s2){

        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        s1=s1.replaceAll(" ","");
        s2=s2.replaceAll(" ","");

        if(s1.length()==s2.length()){
        char firstArray[]=s1.toCharArray();
        char secondArray[]=s2.toCharArray();

        Arrays.sort(firstArray);
        Arrays.sort(secondArray);

        return Arrays.equals(firstArray,secondArray);
        }else {
            return false;
        }
    }
}
