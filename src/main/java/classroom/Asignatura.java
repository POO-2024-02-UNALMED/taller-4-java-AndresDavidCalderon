package classroom;

public class Asignatura {

    public String nombre;
    String n = nombre;
    public int codigoInterno;
    public int codigoExterno;
    public Tipo tipo;

    public Asignatura() {
        this("Sin nombre",Tipo.FUNDAMENTACION);
        // Eliminamos this inutil e invalido.
    }

    public Asignatura(int codigoInterno,Tipo tipo) {
        this("Sin nombre", codigoInterno, codigoInterno ,tipo); //Que el codigo interno haga también de codigo externo.
    }

    // Eliminamos metodo duplicado
    
    public Asignatura(String nombre, Tipo tipo) {
        this(nombre, 0, 0,tipo);
    }

    public Asignatura(String nombre, int codigoInterno, int codigoExterno,Tipo tipo) {
        this.nombre = nombre;
        this.codigoInterno = codigoInterno;
        this.codigoExterno = codigoExterno;
        this.tipo = tipo;
    }

    public void cambiarDatos(int codigoInterno, int codigoExterno, String nombre,Tipo tipo) {
        this.codigoInterno = codigoInterno;
        this.codigoExterno = codigoExterno;
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public void cambiarDatos(int codigoInterno) {
        this.codigoInterno = codigoInterno;
        this.codigoExterno = codigoInterno; // Que el codigo externo sea el mismo interno, como Taller4 lo espera.
    }

    // Eliminamos metodo duplicado
    
    public void cambiarDatos(String nombre) {
        this.nombre = nombre;
    }

    public void setCodigoInterno(int codigoInterno) {
        this.codigoInterno = codigoInterno;
    }
    
    public void setCodigoInterno(double codigoInterno) {
        this.codigoInterno = (int) codigoInterno;
    }
}
