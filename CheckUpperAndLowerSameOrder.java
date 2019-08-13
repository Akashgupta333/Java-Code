package Conversion;

public class CheckUpperAndLowerSameOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str = "geeGkEEsKS";
        String Upper = "";
        String Lower = "";
        for(int i=0;i<str.length();i++){
        	if(str.charAt(i)>='A' && str.charAt(i)<='Z'){
        		Upper = Upper + str.charAt(i);
        	}
        	else{
        		Lower = Lower + str.charAt(i);
        	}
        }
        if(Upper.equals(Lower.toUpperCase())){
        	System.out.println("Yes");
        }
        else
        System.out.println("No");
	}

}
