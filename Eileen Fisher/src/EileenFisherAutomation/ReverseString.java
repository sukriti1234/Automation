package EileenFisherAutomation;

public class ReverseString {

	public static void main(String[] args) {
		
	String s="Automation";
	//int len=s.length();
   // String rev="";
    
   // for(int i=len-1;i>=0;i--) {
   //  rev=rev+ s.charAt(i);
   // }
   // System.out.println(rev);

	
	
	//2) Using String buffer class
	
	
	StringBuffer sf=new StringBuffer(s);
	sf.reverse();
	System.out.println(sf.reverse());
	
    }
}