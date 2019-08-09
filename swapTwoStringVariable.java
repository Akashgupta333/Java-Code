
public class swapTwoStringVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str1 = "Akash";
        String str2 = "Gupta";
        str1 = str1.concat(str2);
        str2 = str1.substring(0,(str1.length()-str2.length()));
        str1 = str1.substring(str2.length());
        System.out.print(str1 + "  " + str2);
	}

}
