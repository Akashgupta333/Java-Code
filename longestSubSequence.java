package ArthimeticOperation;

public class longestSubSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str = "aabbaabacabb";
        int k = 5;
        int freq[] = new int[26];
        for(int i = 0;i<str.length();i++){
        	freq[str.charAt(i)-'a']++;
        }
        for(int i = 0;i<str.length();i++){
        	if(freq[str.charAt(i)-'a']>=k){
        		System.out.print(str.charAt(i));
        	}
        }
	}

}
