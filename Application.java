package main;


public class Application {
	public static boolean map[]=new boolean[26];
	public static String [] newmap = {".","abc","def","ghi","jkl","mno","pqrs","tu","vw","yz"};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String myString="abc";
		String newString="";
		int n=3;
		int m=3;
		
		//Stringrev(myString,newString,myString.length()-1);
		//RemoveDuplicates(myString,newString,0);
		//subsequences(myString,newString,0);
		//keypadcombination(myString,newString,0);
		//permutation(myString,"");
		int totalpaths = countpath(0,0,n,m);
		System.out.println(totalpaths);
		

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
	
	// Combinations of possible outcomes
	public static void permutation(String myString,String permutation) {
		if(myString.length()==0) {
			System.out.println(permutation);
			return;
		}
		for (int i=0; i<myString.length();i++) {
			char currChar = myString.charAt(i);
			String newStr = myString.substring(0,i) + myString.substring(i+1);
			permutation(newStr,permutation+currChar);
		}
		
	}
	
	//Maize path problem to find the total possible paths 
	public static int countpath (int i,int j,int m,int n) {
		if(i==m || j==n) {
			return 0 ;
		}
		
		if(i==m-1 && j==n-1) {
			return 1;
		}
		int rightmove = countpath(i+1,j,m,n);
		int downmove = countpath(i,j+1,m,n);
		
		return rightmove+downmove;
		
	}
}
