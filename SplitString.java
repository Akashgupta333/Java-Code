package Conversion;

public class SplitString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str = "akash12cd5@5g$f";
        StringBuffer name = new StringBuffer();
        StringBuffer digit = new StringBuffer();
        StringBuffer special = new StringBuffer();
        for(int i=0;i<str.length();i++){
        	if(str.charAt(i)>='a' && str.charAt(i)<='z'){
        		name.append(str.charAt(i));
        	}
        	else if(str.charAt(i)>='0' && str.charAt(i)<='9'){
        		digit.append(str.charAt(i));
        	}
        	else{
        		special.append(str.charAt(i));
        	}
        }
        System.out.print(name+ "   " +digit+"   "+special);
	}

}
