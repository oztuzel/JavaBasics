import com.sun.jdi.Value;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String, String> languages = new HashMap<>();
        // this is not requirement, <Object, Object> this will be any object we want
        // 

        if(languages.containsKey("Java")){
            // containsKey method
            System.out.println("Java already exists.");
        }else {
            languages.put("Java", "a complied high level");
            System.out.println("Java added succesfully");
        }

        languages.put("Python", "an interpreted, object-oriented");
        languages.put("Algol", "an algorithmic language");
        // put method

        languages.remove("Lisp");
        languages.remove("Algol", "is value equal to algol value? ");
        // remove method

        System.out.println(languages.replace("Lisp","this is new value"));
        System.out.println(languages.replace("scala", "this will not be added"));
        // replace method
        for(String key : languages.keySet()){
            System.out.println(key + " : " + languages.get(key));
        }
    }
}