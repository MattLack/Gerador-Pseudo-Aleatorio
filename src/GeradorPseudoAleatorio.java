
public class GeradorPseudoAleatorio {

	public static void main(String[] args){
	
		/*
		m = modulo
		a = multiplicador
		c = incremento
		x = semente
		
		
		sendo: 
		
		m > a >2  e m > c >= 0;
		*/
		
		
		long[] sequenciaNumerica = new long[9];
		long m = (int) (Math.pow(2, 31) - 1);
		long a =(int) Math.pow(7, 5) ;
		int c = 0;
		long x = 1;
		
		
		
		sequenciaNumerica[0] = x;
		
		for(int i = 1; i< sequenciaNumerica.length; i++){
			sequenciaNumerica[i] = ((a * x) + c) % m;
			
			x = sequenciaNumerica[i];
			
		}
		for(int i = 0; i< sequenciaNumerica.length;i++){
			System.out.println(sequenciaNumerica[i]);
		}
		
		
	}
}
