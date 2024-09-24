
public class First {
	public static  String reverseString(String word) {
		String reve="";
		for(int i=word.length()-1;i>0;i--) {
		
			char charAt = word.charAt(i);
		 reve=reve+charAt;
		    return reve;
		  //  System.out.println();
		}
		System.out.println(reve);
		return reve;
		
		
  
	}
	public static String reverse(String str)
	{
	String reversed = "";
	for (int i = str.length() - 1; i >= 0; i--)
	{
	reversed += str.charAt(i);
	}
	return reversed;
	}
	
	
	static String str="i am unique";
	static String str1="i am unique";
	
public static void main(String[] args) {
	First frt=new First();
	frt.reverseString("hai");
	System.out.println("good morning");
	String original = "Hello, world!";
	String reversed = reverse(original);
	System.out.println("Original string: " + original);
	System.out.println("Reversed string: " + reversed);
	System.out.println("currect0  "+str==str1);
}
}
