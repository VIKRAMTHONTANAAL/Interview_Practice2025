public class VowelAndConsonantCount {
    public static void main(String[] args) {
        String s="programming";
        int vowelCount=0;
        int consonantCount=0;
        s=s.replaceAll(" ", "");
        s=s.toLowerCase();
        char arr[]=s.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u'){
                vowelCount++;
            }else if(arr[i]>='a' && arr[i]<='z'){
                consonantCount++;
            }
        }
        System.out.println("vowels "+vowelCount);
        System.out.println("consonants "+consonantCount);
    }
}
