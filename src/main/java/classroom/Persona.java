package classroom;

public class Persona {

    final long cedula;
    String nombre;
    static int totalPersonas;
    
    static {
        totalPersonas = 0;
        // Eliminamos la asignación atomatica de cedula.
    }

    public Persona(long cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
        totalPersonas++;
    }
    
    public Persona(String nombre, long cedula) {
        this.cedula = cedula;
        this.nombre = nombre;
        totalPersonas++;
    }

    public Persona(long cedula) {
        this.cedula = cedula;
        this.nombre = "";
        totalPersonas++;
    }

    public Persona(String nombre) {
    	this.cedula = 1; // Añadimos un valor por defecto para cedula.
        this.nombre = "";
        totalPersonas++;
    }
    
    public Persona() { // Añadimos el constructor vacio que necesita Taller 4.
    	this.cedula = 1; // Añadimos un valor por defecto para cedula.
    	this.nombre="";
    	totalPersonas++;
    }
    
    public long getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
