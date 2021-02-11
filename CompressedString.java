import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class CompressedString {
    public static void main(String[] args) {

        String str ="Kavya";
        Map<Character,Integer> map = new LinkedHashMap<>();
        for(int i =0;i<str.length();i++){
            if(map.get(str.charAt(i))!=null){
                map.put(str.charAt(i),map.get(str.charAt(i))+1);
            }else{
                map.put(str.charAt(i),1);
            }
        }
        StringBuilder stringBuilder =new StringBuilder();
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            stringBuilder.append(entry.getKey());
            stringBuilder.append(entry.getValue());
        }
        System.out.println(stringBuilder.toString());
    }
}
