package main;


public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String myString="abpor";
		String revString="";
		Stringrev(myString,revString,myString.length()-1);
		

	}
	
	// Reversing the String Using Recurssion
	public static  void Stringrev(String myString,String revString,int n) {
		if (n==0) {
			
			revString += myString.charAt(n);
			System.out.println("Rev. String is- > "+revString);
			return ;
		}
		
		revString += myString.charAt(n);
		 Stringrev(myString,revString,n-1);

	}

}
