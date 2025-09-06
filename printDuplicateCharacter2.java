import java.util.HashMap;
import java.util.Map;

public class printDuplicateCharacter2 {

    public static void main(String[] args) {
        String s1="programming";
        s1=s1.toLowerCase();
        char arr[]=s1.toCharArray();
        Integer count=1;

        Map <Character, Integer> hash=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            hash.put(arr[i], hash.getOrDefault(arr[i],0)+count);
        }
        for(char c1: hash.keySet()){
            if(hash.get(c1)>1){
                System.out.println("duplicate chars "+ c1+ " "+ hash.get(c1));
            }
        }
    }
}
