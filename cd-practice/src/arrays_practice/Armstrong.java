package arrays_practice;

public class Armstrong {

	public static void main(String[] args) {
		int number = 1634;
		//length of number
		int length = String.valueOf(number).length();
		int temp = number, result = 0, remainder;
		while(temp>0) {
			remainder = temp%10 ;
			result += Math.pow(remainder, length);
			temp =temp/10;
		}
		if(result == number) {
			System.out.println(true);
		}else
			System.out.println(false);
	}
}
