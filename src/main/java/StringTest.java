import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringTest {

    private String APPROVED;

    public void StringTest(String[] args) {

//substring value isnt stored anywhere so it will get destoryed********************************
        StringBuilder s1 = new StringBuilder("Java");
        StringBuffer s2 = new StringBuffer("Love");
//        String s2 = "Love";
        s1.append(s2);
        s1.substring(4, 6);
        s1.substring(3, 7);
        int foundAt = s1.indexOf(String.valueOf(s2));
        System.out.println(foundAt);

//polymorphism ********************************
        Base x = new Base();
//        Derived y = new Derived();
//        Derived z = new Derived();
//        Main.DoPrint(x);
//        MultiThreading.DoPrint(y);
//        MultiThreading.DoPrint(z);


//contructor default necessary if we have parameterized contructor and through object we call default constructor
//        Derived w = new Derived(3, 5);
//        System.out.println("x = " + w.x + ", y = " + z.y);
        //practice geeks of geeks sets
        Base.Test2 result = new Base.Test2(10);
        System.out.println(result);

        String s21 = "abc";
        String s22 = s21;
        s21 += "d";
        System.out.println(s1 + " " + s2 + " " + (s21 == s22));

        StringBuffer sb1 = new StringBuffer("abc");
        StringBuffer sb2 = sb1;
        sb1.append("d");
        System.out.println(sb1 + " " + sb2 + " " + (sb1 == sb2));

        Base.Second n = new Base.Second(20);
        System.out.println("main" + n.i);
        Base.Person p = new Base.Kid();
        p.whoAmI();
        p.whoAreYou();


//String Matcher Pattern
//wont go to cached string pool because u create new object
        String x1 = new String("Hello Java why are you so complex in this world.Hello alien it should be  hard for because you dont use your brain matter much.");
        //goes to cached string pool
        String x2 = "Hello Alien";
        String s3 = "Hello Alien";
        System.out.println("Same Reference in cached pool :" + (x2 == s3)); //true
        String s4 = new String("Hello Alien");
        String s5 = new String("Hello Alien");
        System.out.println("constructor string == constructor string :" + (s4 == s5)); // constructor string == constructor string
        System.out.println("cached pool == object string :" + (s3 == s4)); //cached pool == object string
        String s6 = new String("Hello Alien").intern(); // interned makes the object search for cached pool if i already exists
        System.out.println("Interned == cached pool string :" + (x2 == s6));
        System.out.println("Interned == constructor string : " + (s4 == s6));
//search how many times string is in given file
        Pattern pattern = Pattern.compile("Hello");
        Matcher matcher = pattern.matcher(s1);
        int occurances = 0;
        while (matcher.find()) {
            occurances++;
        }
        System.out.println(occurances);
        System.out.println(s1.substring(0, 5)); //print exact string
        System.out.println(s1.substring(5)); //remove first 5 indexes and print remaining
        //Pattern finder in whole string
        Pattern findthis = Pattern.compile("HELLO");
        Matcher matched = findthis.matcher(s1);

//Memory Leak
//substring - it will create a whole new char[] array - It is referring to the origianl value string.
        String main = "Ro,cky";
        String substring = main.substring(2);
        System.out.println("substring: " + substring);
        String betweenstring = main.substring(2, 5);
        System.out.println("betweenstring : " + betweenstring);
        //new string object will be created in constant pool or heap and value[] char array will be shared among the two objects  but count & off set will differ based in index
        //jdk 7 substring will create new char[] and use it rather than referring to old original string
        //jdk 6 memory leak for substring , jdk 7 no memory leak dor substring
        String[] split = main.split(",");
        System.out.println(split);
        String s = new String("Hello");
        if (APPROVED.equals(s)) {
            System.out.println("Both are equal");
        }
        System.out.println("Both arent equal");

        //strings are not good way to store passwords but u can do with char[] and make them null later
        // strings are sotred in string poo which used cached memory for some time to get collected by garbage collector..but in char array u can use it as seperate referrence and u can make them deleted immediately or make them null.

    }
}
