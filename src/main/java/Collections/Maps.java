package Collections;

import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        Map<String,String> toDoList = new HashMap<>();
        if(toDoList.containsKey("Java")){
            System.out.println("Java description already exists");
        }
        else {
            toDoList.put("Java","One should be good with JVM internals and Data Structures to improve language proficiency");
            System.out.println("Successfully added the Java key \n");
        }
        //Key and values
        toDoList.put("Java","One should be good with JVM internals and Data Structures to improve language proficiency");
        toDoList.put("Pyton","Interpreted light weighted language");
        toDoList.hashCode();

        for (String key: toDoList.keySet()) {
            System.out.println(key +" : "+toDoList.get(key));
        }


    }
}
