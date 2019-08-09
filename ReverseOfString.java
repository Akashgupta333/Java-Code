
public class ReverseOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str = "Dream big";
        String rev = "";
        //String []words = str.split(" ");
        for(int i=str.length()-1;i>=0;i--){
        	rev = rev + str.charAt(i);
        }
        for(int i=0;i<rev.length();i++){
        	System.out.print(rev.charAt(i));
        }
	}

}
