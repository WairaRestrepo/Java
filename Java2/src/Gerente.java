public class Gerente extends Funcionario implements Autenticable {

    //sobre escritura de metodos
 public  double getbonificacion (){
     //Le estoy indicando que va hacer igual a salario + lo que hay en el
     // metodo  bonificacion de la clase padre.
     System.out.println("Ejecutando desde gerente ");
        return 2000;

 }
    @Override
    public void setClave(String clave) {

    }

    @Override
    public boolean iniciarSesion(String clave) {
        return false;
    }


}
