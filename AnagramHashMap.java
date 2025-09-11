import java.util.HashMap;
import java.util.Map;

public class AnagramHashMap {
    public static void main(String[] args) {
        String s1="listen";
        String s2="silentp";

        if(isAnagram(s1,s2)){
            System.out.println("This is anagram");
        }else {
            System.out.println("This is not an anagram");
        }
    }

    public static boolean isAnagram(String s1, String s2){
        s1=s1.replaceAll(" ","");
        s2=s2.replaceAll(" ", "");
        if(s1.length()!=s2.length()){
            return false;
        }
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        Map<Character,Integer> map=new HashMap<>();
Integer count=1;
        for(int i=0;i<s1.length();i++){
            map.put(s1.charAt(i),map.getOrDefault(s1.charAt(i),0)+count);
        }

        for(int i=0;i<s2.length();i++){
          if(map.containsKey(s2.charAt(i))){
              if(map.get(s2.charAt(i))==1){
                  map.remove(s2.charAt(i));
                }else{
                  map.put(s2.charAt(i), map.get(s2.charAt(i))-1);
                }

            }
        }
return map.isEmpty();




    }
}
