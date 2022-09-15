import CustomizedException.CustomizedException;

public class Main {

	public static void main(String[] args) throws CustomizedException{
		
		//Intenta printar un mensaje y la excepción customizada. Finalmente imprime un mensaje.
		try {
			System.out.println("Mensaje mostrado por pantalla");
			throw new CustomizedException("Exception capturada con mensaje: Esto es un objeto Exception");
		} finally {
			System.out.println("Programa terminado");
		}
		
	}
}
