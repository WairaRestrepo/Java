
public class TestConexion {
	
	public static void main(String[] args) throws Exception {
		
		try (Conexion con = new Conexion()) {
			con.leerDatos();
		} catch (IllegalStateException ex) {
			//se utiliza para atrapar el error
			System.out.println("Ejecutando catch");
			ex.printStackTrace();
		}
		
		
//		Conexion con = null; //esta nula
//		try {
//			con = new Conexion(); // se crea la conexion
//			con.leerDatos();
//		} 
//		catch (IllegalStateException ex) {
//			ex.printStackTrace();
//		}
//		finally {
//		De una manera u otra se cierra la conexion.
//			System.out.println("Ejecutando finally");
//			if (con != null) {
//				con.cerrar();
//			}
//		} 

	}
	
}
