package NullConceptpackage;

public class NullConceptClass{
	
	
	static Object obj;
	static String str;
	static NullConceptClass nc;
	
	public static void main(String[] args) {
		
		
		//1. case sensitive
		//Object obj = null;
		//Object obj = NULL/Null;---not
		
		//2. default reference value will be null
		//System.out.println(obj);
		//System.out.println(str);
		//System.out.println(nc);
		
		//3.
//		Integer i = null;
//		int j = i;
		
		//4. instance of
//		Integer i = null;
//		Integer j =10;
//		
//		System.out.println(j instanceof Integer);
//		System.out.println(i instanceof Integer);
		
		//5.Static Non Static
		
		NullConceptClass obj = null;
		//obj.sum();
		obj.sub();
		
		//6. == and !=
		System.out.println(null ==null);
		
		System.out.println(null != null);
		
		
		//7. 
		String str = null;
		Integer i1 = null;
		Double d = null;
		
		//8. Typecast null into string?
		String s1 = (String) null;
		System.out.println(s1);
		System.out.println(s1+"Jack");
		//System.out.println(s1.length()); --error
		
		Integer i2 = (Integer) null;
		
		Double d2 = (Double) null;
		
	}
	
	public void sum() {
		System.out.println("In Sum Method....");
	}
	
	public static void sub() {
		System.out.println("In Sub Method....");
	}
	
}