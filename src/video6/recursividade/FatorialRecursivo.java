package video6.recursividade;

public class FatorialRecursivo {

	public long fatorialRecursivo(long numero) {
		System.out.println("FATORIAL DO NUMERO " + numero);
		if(numero == 1) {
			return 1;
		}
		
		return numero * fatorialRecursivo(numero - 1);
	}
	
}
