import java.util.Arrays;

public class anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s1 = "Grab";
        String s2 = "Brag";
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        if(s1.length()!=s2.length()){
        	System.out.println("Not Anagram");
        }
        else{
        	char[] ch1 = s1.toCharArray();
        	char[] ch2 = s2.toCharArray();
        	Arrays.sort(ch1);
        	Arrays.sort(ch2);
        	if(Arrays.equals(ch1, ch2)==true){
        		System.out.println("Anagram");
        	}
        	else{
        		System.out.println("Not Anagram");
        	}
        }
	}

}
