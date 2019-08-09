
public class swapFirstAndLastCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str = "Geeks for Geeks";
        System.out.println(count(str));
	}
	static String count(String str){
		char ch[] = str.toCharArray();
		for(int i = 0; i<ch.length; i++){
			int k = i;
            while(i<ch.length && ch[i]!=' ')
            	i++;
            char temp = ch[k]; 
            ch[k] = ch[i - 1]; 
            ch[i - 1] = temp; 
		}
		return new String(ch);
	}
}

