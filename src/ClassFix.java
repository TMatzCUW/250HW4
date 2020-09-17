
public class ClassFix {
	public static void main(String[] args) {
		
	}
static String decimaltoHex(int dec) {
	String answer="";
	String map = "0123456789ABCDEF";
	while(dec>0) {
		answer=map.charAt(dec%16)+answer;
		dec/=16;
	}
	return answer;
}
static int binarytoDecimal(String bin)
{
	int place=1;
	int sum=0;
	for(int i =bin.length()-1; i>=0; i--) {
		if(bin.charAt(i)=='1') {
			sum+= place;
		}
		place*=2;
	}
	return sum;
}
}