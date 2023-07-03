package NewMaven;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class App 
{
    public static void main( String[] args ) {
    	List<String>strings = new ArrayList<String>();
        strings.add("Python");
        strings.add("Java");
        strings.add("Asp.Net");
        strings.add("Salesforce");
        strings.add("Generative AI");

        Collections.sort(strings,(s1,s2) -> s1.compareTo(s2));

        System.out.println("Sorted List:");
        for(String str : strings) {
            System.out.println(str);
        }
    }
}       

