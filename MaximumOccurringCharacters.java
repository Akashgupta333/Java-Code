package ArthimeticOperation;

public class MaximumOccurringCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str = "akash";
        int count[] = new int[256];
        for(int i=0;i<str.length();i++){
        	count[str.charAt(i)]++;
        }
        int max = -1;
        char result = ' ';
        for(int i=0;i<str.length();i++){
        	  if (max < count[str.charAt(i)]) { 
                  max = count[str.charAt(i)]; 
                  result = str.charAt(i); 
              } 
        	}
        System.out.println(result);
        }
	}


