
public class FrequencyOfCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str = "picture perfect";
        int fre[] = new int[str.length()];
        char ch[] = str.toCharArray();
        for(int i=0;i<str.length();i++){
        	fre[i] = 1;
        	for(int j=i+1;j<str.length();j++){
        		if(ch[i]==ch[j]){
        			fre[i]++;
        			ch[j]='0';
        		}
        	}
        }
        for(int i=0;i<fre.length;i++){
        	if(ch[i]!=' ' && ch[i]!='0'){
        	System.out.println(ch[i]+" == "+fre[i]);
        	}
        }
	}

}
