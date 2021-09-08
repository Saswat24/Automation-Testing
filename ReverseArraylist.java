
public class ReverseArraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<String> l = new ArrayList<String>();  
	        l.add("saswat");  
	        l.add("sekhar");  
	        l.add("panda");  
	        l.add("Ramesh");  
	        System.out.println("Before Reversing");  
	        System.out.println(l.toString());  
	          
	        Collections.reverse(l);  
	        System.out.println("After Reversing");  
	        System.out.println(l);  

	}

}
