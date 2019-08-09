
public class reverseWords {
    static String reverse(String s){
    	String str[] = s.split(" ");
    	String result = "";
    	for(int i=0;i<str.length;i++){
    		if(i == str.length-1){
    			result = str[i]+result;
    		}
    		else{
    			result = " " + str[i] + result;
    		}
    	}
    	return result;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s = "I love Java Programming";
        System.out.println(reverse(s));
	}
}
