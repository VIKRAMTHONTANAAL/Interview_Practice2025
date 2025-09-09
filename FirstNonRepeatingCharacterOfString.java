public class FirstNonRepeatingCharacterOfString
{
    public static void main(String[] args) {
        String s = "swiss";
        boolean duplicateFound=false;
        int count=0;

        for (int i=0;i<s.length();i++){
            for(int j=0;j<s.length();j++){
                if(i!=j){
                    if(s.charAt(i)==s.charAt(j)){
                        duplicateFound=true;
                    }
                }
            }
            if(!duplicateFound){
                System.out.println("found the first non repeating character "+s.charAt(i));
                count++;
                break;
            }else {
                duplicateFound=false;
            }
        }
        if(count==0){
            System.out.println("$");
        }
    }
}
