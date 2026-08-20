package exceptions;

public class Errors {

	public static void main(String[] args) {
		try {
			throw new OutOfMemoryError("out of memory");
		}catch (Throwable t) {
			System.out.println(t);
		}
		
		try {
			throw new CustomException("Custom Exception");
		}catch(CustomException ex){
			System.out.println(ex + " is catched");
		}
	}
}
