public class divideStringNequalsPart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str = "Akashgupta";
        int n = 5;
        String []str1 = new String[n];
        int k = 0;
        if(str.length()%n==0){
        	for(int i=0;i<str.length();i=i+str.length()/n){
        		String part = str.substring(i, i+str.length()/n);
        		str1[k] = part;
        		k++;
        	}
        	for(int i = 0;i<str1.length;i++){
            	System.out.println(str1[i]);
            }
        }
        else{
        	System.out.println("Not divided");
        }
        
	}

}
