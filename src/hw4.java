
public class hw4 
{
	String binary = "101110101101";
	//binary to decimal
	
	//decimal to hexadecimal
	public static String decimalToHex(int numberAsAnInt)
	{
		String answer = "";
		String map = "0123456789ABCDEF";
		while(numberAsAnInt != 0)
		{
			int temp = (numberAsAnInt % 16);
			answer = map.charAt(temp) + answer;
			numberAsAnInt = numberAsAnInt / 16;
		}
		return answer;
	}
}