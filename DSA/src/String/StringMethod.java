package String;

public class StringMethod {
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
//		String name = "abc";
//		String s = null;
//		String s2 = "";
		
		// 1 . length method
//		System.out.println(name.length());   // o/p = 3
//		System.out.println(s.length());		//  o/p = exception null pointer
//		System.out.println(s2.length());    // 0/p = 0
		
		
//		// 2 . isEmpty()
//		System.out.println(name.isEmpty());		// flase
//		System.out.println(s.isEmpty());		// exception
//		System.out.println(s2.isEmpty());		// true
		
		// 3. trim()
		
//		String name = " abc ";
//		String s = null;
//		String s2 = "";
//		String s3 = "  abc    xyz";
//		
//		System.out.println(name.trim());   // abc
////		System.out.println(s.trim());      // exception
//		System.out.println(s2.trim());     // nothing it will print it will remove space
//		System.out.println(s3.trim());		//abc    xyz -> it will remove before and after space of string not in between space
//		
//		if(name.trim().length() == 0) {
//			System.out.println("name is empty");
//			
//		}else {
//			System.out.println("name is not empty");
//		}
		
//	 4 . equals 
		
//		String s = new String("deepak");
//		String s2 = new String("Deepak");
//		
//		System.out.println(s.equals(s2));
		
//		5 . compareTo
//		String s = new String("a");
//		String s2 = new String("");
//		
//		System.out.println(s.compareTo(s2));
		
//		String s = "deepak";
//		System.out.println(s+10+20);
//		System.out.println(10+s+20);
//		System.out.println(10+20+s);
//		System.out.println(s+20/10);
//		System.out.println(s+20*10);
////		System.out.println(s+109-2);
//		
//		String s2 = "java";
//		
//		System.out.println(s.concat(s2));
//		
//		System.out.println(String.join(",",s2, s,s2,s,s2)); 
		
//		10. subSequence -> It return a charsequence
		
		String str = "this is demo";
//		System.out.println(str.subSequence(3, 9));  
	
//		11. substring
		
//		System.out.println(str.substring(3));
//		System.out.println(str.substring(0,9 ));
//		
//		update method string 
		
//	1 . replace
		
		System.out.println(str.replace("is", "was"));
		
//	2. replaceFirst
		
		System.out.println(str.replaceFirst("is", "was"));
		
//  3 . replaceAll()
		
		System.out.println(str.replaceAll("is", "was"));
		System.out.println(str.replaceAll("is(.)","was"));
		System.out.println(str.replaceAll("is(.*)' ","was"));
		
		  String email = "rohit45@gmail.com";
		  
		  int a = 10;
		  String inttoString = String.valueOf(a);
		  System.out.println(inttoString);
		  
		  char [] ch = email.toCharArray();
		  System.out.println(ch);
		
		
		
	}

}
