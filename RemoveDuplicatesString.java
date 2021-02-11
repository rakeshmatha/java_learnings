import java.util.HashSet;

public class RemoveDuplicatesString {

        public static String removeDuplicates(String str){
            HashSet<Character> set = new HashSet<>();
            StringBuffer stringBuffer = new StringBuffer();
            for (int i=0;i<str.length();i++){
                Character c = str.charAt(i);
                if(!set.contains(c)){
                     set.add(c);
                     stringBuffer.append(c);
                     stringBuffer.toString();
                }
            }
            return stringBuffer.toString();
        }


    public static void main(String[] args) {

        String str ="RakeshRakesh";
        System.out.printf(removeDuplicates(str));


    }
}
