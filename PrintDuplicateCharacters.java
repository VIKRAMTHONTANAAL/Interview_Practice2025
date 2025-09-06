import java.util.HashMap;
import java.util.Map;

public class PrintDuplicateCharacters {
    public static void main(String[] args) {
        String s = "programming";

        char arr[]=s.toCharArray();
        Integer count=1;

         Map<Character, Integer> duplicate=new HashMap<>();

        for(int i=0;i< arr.length;i++){
            duplicate.put(arr[i], duplicate.getOrDefault(arr[i],0)+count);

        }

        for(char c1: duplicate.keySet()){
            if(duplicate.get(c1)>1){
                System.out.println(c1+" "+duplicate.get(c1));
            }
        }
    }
}
