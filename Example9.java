import java.util.*;
public class Example9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  LinkedList<String> l_list = new LinkedList<String>();
		          l_list.add("Asish");
		          l_list.add("jhanshi");
		          l_list.add("amala");
		     System.out.println("Original linked list:" + l_list);    
		    l_list.addFirst("saswat");
		 
		    l_list.addLast("Ramesh");
		     System.out.println("Final linked list:" + l_list);
	}

}
