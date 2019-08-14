package Palindrome;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str = "aabababaa";
        int i=0,j=str.length()-1;
        while(i<j){
        	if(str.charAt(i) != str.charAt(j)){
        		System.out.println("Not Palindrome");
        		break;
        	}
        	i++;
        	j--;
        }	
        if(i>=j){
       	System.out.println("Palindrome");
        }
        
	}

}
