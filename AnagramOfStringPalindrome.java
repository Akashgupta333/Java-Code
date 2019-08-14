package Palindrome;

public class AnagramOfStringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str = "geeksjgeeks";
        int freq[] = new int[26];
        for(int i=0;i<str.length();i++){
        	freq[str.charAt(i)-'a']++;
        }
        int count = 0;
        for(int i=0;i<freq.length;i++){
        	if((freq[i] & 1) != 0){
        		count++;
        	}
        }
        if(count>1){
        	System.out.println("NO");
        }
        else{
        	System.out.println("YES");
        }
	}

}
