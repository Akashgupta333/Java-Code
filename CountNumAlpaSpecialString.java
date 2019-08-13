package Conversion;

public class CountNumAlpaSpecialString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str = "#GeeKs01fOr@gEEks07";
        int Ucount = 0,Lcount = 0,Ncount = 0,Scount = 0;
        for(int i=0;i<str.length();i++){
        	if(str.charAt(i)>='A' && str.charAt(i)<='Z'){
        		Ucount++;
        	}
        	else if(str.charAt(i)>='a' && str.charAt(i)<='z'){
        		Lcount++;
        	}
        	else if(str.charAt(i)>='0' && str.charAt(i)<='9'){
        		Ncount++;
        	}
        	else{
        		Scount++;
        	}
        }
        System.out.print(Ucount+"  "+Lcount+"  "+Ncount+"  "+Scount);
	}

}
