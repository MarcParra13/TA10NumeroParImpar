import CustomizedException.CustomizedException;

class NumeroParImpar {
	//Atributos de la clase NumeroAleatorio
	static int numMin = 0;
	static int numMax = 999;
	static int numeroAleatorio = generarNumero();
	
	//Método para generar un número aletorio
	public static int generarNumero() {
		
		int numeroAleatorio = (int) (Math.random() * numMax + numMin);
		
		return numeroAleatorio;
	}
	
	//Método para comprobar si el número aleatorio es par o impar y lanzar la excepción
	@SuppressWarnings("finally")
	public static void comprobarNumero() throws CustomizedException {
		
		try {
			System.out.println("Generando número aleatorio...");
			System.out.println("El número aleatorio es: " + NumeroParImpar.numeroAleatorio);
			throw new CustomizedException("Saltamos a la excepción");
		} catch (CustomizedException ce){
			if(numeroAleatorio % 2 == 0) {
				System.out.println("Es par");
			} else {
				System.out.println("Es impar");
			}
		} 
	}
}

public class Main {

	public static void main(String[] args) throws CustomizedException {
		
		//Printar los resultados
		NumeroParImpar.comprobarNumero();

	}

}
