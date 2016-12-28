package sumarNumeros;

public class Substract {
	
	public static int sub2numeros(int a, int b) {
		
		int result = 0;
		result = a - b;
		
		return result;
	}

	public static int subNumeros(int... numbers) {
		
		int result = 0;
		boolean aux = true;
		
		for (int n :numbers){
			
			if(aux == true){
				
				result = n;
				aux = false;
				
			}else{
				result -= n;
			}
		}
		return result;
	}
}
