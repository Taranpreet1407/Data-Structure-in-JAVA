package main;


public class Application {
	public static boolean map[]=new boolean[26];
	public static String [] newmap = {".","abc","def","ghi","jkl","mno","pqrs","tu","vw","yz"};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String myString="23";
		String newString="";
		
		//Stringrev(myString,newString,myString.length()-1);
		//RemoveDuplicates(myString,newString,0);
		//subsequences(myString,newString,0);
		keypadcombination(myString,newString,0);
		

	}
	
	// Reversing the String Using Recurssion
	public static  void Stringrev(String myString,String newString,int n) {
		if (n==0) {
			
			newString += myString.charAt(n);
			System.out.println("Rev. String is- > "+newString);
			return ;
		}
		
		newString += myString.charAt(n);
		 Stringrev(myString,newString,n-1);

	}
	
	// Remove Duplicate From String
	public static void RemoveDuplicates (String myString, String newString,int indx){
		
		if (indx==myString.length()) {
			System.out.println("New String Is -> "+ newString);
			return;
		}
		
		char currChar = myString.charAt(indx);
		if (map[currChar-'a']) {
			RemoveDuplicates(myString,newString,indx+1);
			
		} else {
			
			newString += currChar;
			map[currChar-'a']=true;
			RemoveDuplicates(myString,newString,indx+1);
			
			
		}
		
		
		
	}
	
	// Code to print Subsequences from String 
	public static void subsequences (String myString, String newString, int indx) {
		if (indx==myString.length()) {
			System.out.println(newString);
			return;
		}
		
		char currChar = myString.charAt(indx);
		
		subsequences(myString,newString+currChar,indx+1);
		subsequences(myString,newString,indx+1);
		
		
		
	}
	
	// kEYPAD phone combinations 
	public static void keypadcombination (String myString ,String newString,int indx) {
		if (indx== myString.length()) {
			System.out.println(newString);
			return;
		}
		char currChar = myString.charAt(indx);
		String mapping= newmap[currChar -'0'];
		
		for(int i=0;i<mapping.length();i++) {
			keypadcombination(myString,newString+mapping.charAt(i),indx+1);
			
		}
		
	}
}
