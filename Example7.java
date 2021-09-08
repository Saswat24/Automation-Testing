import java.util.*;
public class Example7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> l_list = new LinkedList<String>();
		          l_list.add("Red");
		          l_list.add("Green");
		          l_list.add("Black");
		          l_list.add("White");
		          l_list.add("Pink");
		   Iterator p = l_list.listIterator(1);

		   while (p.hasNext()) {
		   System.out.println(p.next());

	}

}
}