
public class largestAndSamllestWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hardships often prepare ordinary people for an extraordinary destiny";
		String [] word = str.split(" ");
		int Largest = word[0].length(),Smallest = word[0].length(),count = 0;
		for(int i=0;i<word.length;i++){
			count = word[i].length();
			if(Largest<count){
				Largest = count;
			}
			if(Smallest>count){
				Smallest = count;
			}
		}
		System.out.println(Largest+" "+Smallest);
	}

}
