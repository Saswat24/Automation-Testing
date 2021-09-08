import java.util.*;
public class Example6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			LinkedList<String> linkedList = new LinkedList<String>();
			linkedList.add("saswat");
			linkedList.add("sekhar");
			linkedList.add("panda");
			linkedList.add("ramesh");
			linkedList.add("suresh");
	 
			System.out.println("ListIterator Approach: ==========");
			ListIterator<String> listIterator = linkedList.listIterator();
			while (listIterator.hasNext()) {
				System.out.println(listIterator.next());
			}
			System.out.println("\nLoop Approach: ==========");
			for (int i = 0; i < linkedList.size(); i++) {
				System.out.println(linkedList.get(i));
			}
	 
			
	 
			linkedList.forEach(System.out::println);
	}
	}


