package CustomizedException;

//Creamos una clase que extienda de Exception. En el constructor, llamamos a super (Exception) pasándole el mensaje de error.
public class CustomizedException extends Exception {
	
	public CustomizedException(String mensaje) {
		super(mensaje);
	}

}
