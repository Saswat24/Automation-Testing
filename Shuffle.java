import java.util.*;
public class Shuffle {
	 public static void main(String[] args) {  
	List<String> list = Arrays.asList("saswat", "sekhar", "panda");  
    System.out.println("List before Shuffle : "+list);  
    Collections.shuffle(list);  
    System.out.println("List after shuffle : "+list);
	 }
}
