import java.util.Locale;

public class Panagrams {
    public static void main(String[] args) {
        String str = "A Quick Brown fox jumps over the lazy dog";
        System.out.println(panagram(str.toLowerCase(Locale.ROOT)));

    }
    public static boolean panagram(String str){
                if(str.length()<26)
                {
                    return false;
                }
                else
                    {
                    for (char ch ='a';ch<='z';ch++)
                    {
              if(str.indexOf(ch)<0)
              {
                  return false;
              }
            }
        }
                return true;
    }
}
