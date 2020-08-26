package variable;

public class CodeChallenge {
	public static void main(String[] args) {
		
		try {
			while(true) {
				System.out.println(1);
			}
			
		} 
		catch (OutOfMemoryError e) {
			System.out.println(2);
		}
		
		finally {
			System.out.println(3);
		}
	}

}
