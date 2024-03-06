package Exception;

public class NullPointerExceptionExample {
	public static void main(String[] args) {
		String s="Feriha in turkey";
		try {
			s=null;
			System.out.println(s.length());
		}
		catch(ArithmeticException Emir) {
			System.out.println("Feriha is living in turkey");
	}
		catch(NullPointerException Emir) {
			System.out.println("feriha is busy");
		}
		
	}

}
