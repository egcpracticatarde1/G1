package sumarNumeros;

public class Sum {
	
	public static int sum3numeros(int a, int b, int c) {
		
		int result = 0;
		result = a + b + c;
		return result;
	}

	public static int sumNumeros(int... numbers) {
		
		int result = 0;
		for (int n :numbers){
			
			result += n;
		}
		return result;
	}
}
