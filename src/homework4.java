
public class homework4 {
	
	String binary = "101110101101";
	String decimal= "";
	String hex="";
	int bin=Integer.parseInt(binary);
	
	//binary to decimal
	public static int BinarytoDecimal(int bin)
	
	{
		int decimal = 0;  
	    int n = 0;  
	    while(true){  
	      if(bin == 0){  
	        break;  
	      } else {  
	          int temp = bin%10;  
	          decimal += temp*Math.pow(2, n);  
	          bin = bin/10;  
	          n++;  
	       }  
	    }
	    return decimal;
	}
	//decimal to hexadecimal
	public static String decimalToHex(int decimal)
	{
		String answer = "";
		String map = "0123456789ABCDEF";
		while(decimal != 0)
		{
			int temp = (decimal % 16);
			answer = map.charAt(temp) + answer;
			decimal = decimal / 16;
		}
		return answer;
		
		
	}
	System.out.println("Hex:" + answer);
}
