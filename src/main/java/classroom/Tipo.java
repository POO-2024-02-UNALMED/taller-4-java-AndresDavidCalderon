package classroom;

public enum Tipo {
	DISCIPLINAR(10),FUNDAMENTACION(20),ELECTIVA(30);
	
	private int codigo;
	private String nombre;
	Tipo(int codigo,String nombre) { // Los constructores de enum no pueden ser publicos.
		this.codigo = codigo;
		this.nombre = nombre;
	}
	Tipo(int codigo){ // añadimos un constructor con solo codigo
		this.codigo = codigo;
	}
}
