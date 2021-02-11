import java.util.*;
class LongestSubString{
    public static void main(String ar[]){
        String str="abcdaeb";
        String res=Longest(str);
        System.out.println("Longest Sub-String is  :"+res);
    }
    private static String Longest(String str)
    {
        HashSet<Character> set=new HashSet<>();
        String longestOverall="";
        String longestTillnow="";
        for(int i=0;i<str.length();i++)
        {
            for(int j=i;j<str.length();j++)
            {
                char c=str.charAt(j);
                if(set.contains(c))
                {
                    longestTillnow="";
                    set.clear();
                }
                set.add(c);
                longestTillnow+=c;
                if(longestOverall.length()<longestTillnow.length())
                {
                    longestOverall=longestTillnow;
                }
            }
        }
        return longestOverall;
    }
}

