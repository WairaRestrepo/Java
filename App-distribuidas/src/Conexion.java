
public class Conexion implements AutoCloseable {
// conexión se simula la conexión con un BD

	public Conexion() {
        System.out.println("Abriendo conexion");
        //Se crea el constructor  y se abre la conexion a laBD
    }

    public void leerDatos() {
        System.out.println("Recibiendo datos");
        throw new IllegalStateException();
    }

    public void cerrar() {
        System.out.println("Cerrando conexion");
    }

	@Override
	public void close() throws Exception {
		cerrar();// llama a el meto cerrar
	}

}
