import java.security.spec.RSAOtherPrimeInfo;

/*Se crea  new cuenta para crea algo nuevo en base a la clase cuenta
Para poder manipular los datos que hay en NewCuenta  se debe de guardar en una variable en este caso primeraCuenta
y luego se le debe de indicar  de que tipo de tado va hacer que es Cuenta  (objeto)
* Variable (referenci DE LUGAR EN LA MEMORIA)
 con CTR + click en el metodo (seria link directo.)*/
public class Main {
    public static void main(String[] args) {
/*
        //Variable          =  Valor
        Cuenta primeraCuenta = new Cuenta();
        primeraCuenta.saldo = 1000;
        //System.out.println(primeraCuenta.saldo);

        Cuenta segundaCuenta = new Cuenta();

        //System.out.println(primeraCuenta);
        //System.out.println(segundaCuenta);

        primeraCuenta.retirar(100);
       // System.out.println(primeraCuenta.saldo);
*/
/*
        //Ejemplo de cuenta cliente momento uno--->>>>

        Cuenta miCuenta = new Cuenta();
        miCuenta.saldo = 300;
        miCuenta.depositar(200);



        Cuenta cuentaDeJimena = new Cuenta();
        cuentaDeJimena.depositar(1000);
       // System.out.println("Primer momento: ");
      //  System.out.println( "El saldo de mi cuenta es: " + miCuenta.saldo);
       // System.out.println("El saldo de la cuenta de Jimena es: " + cuentaDeJimena.saldo);

        boolean puedeTransferir = cuentaDeJimena.transferir(400, miCuenta);
        if (puedeTransferir){
            //System.out.println("Se realizo con exito la transferencia. ");
        }


        //System.out.println("segundo momento: ");
        //System.out.println("El saldo de la cuenta de Jimena es: " + cuentaDeJimena.saldo);
       // System.out.println("El saldo de mi cuenta es: " + miCuenta.saldo);
*/

/*        //Ejemplo de cuenta cliente momento dos--->>>>

        Cliente diego = new Cliente();
        diego.nombre = "Diego";
        diego.documento = "101";
        diego.telefono = "99992";

        Cuenta cuentaDiego = new Cuenta();
        cuentaDiego.agencia = 1;
        cuentaDiego.titular = diego;
        //System.out.println("Este es el dato que tiene almacenado  el objeto diego " + cuentaDiego.titular.documento);
        //System.out.println("Este es el espacio en memoria de titular " +cuentaDiego.titular);
      //  System.out.println("Este es el espacio en memoria de diego " + diego);

       // Cualquier cambio que se realicé en  el objeto Diego afectara directamente al el titular
        // por su relacion en la clase Cuenta en el atributo (Cliente titular;)

 */

        /*
        //Ejemplo de cuenta cliente momento tres--->>>>

        Cuenta cuentadesimon = new Cuenta();
        Cliente cliente1 = new Cliente();

*/
        //Ejemplo de Escapsulamiento New moment  ---->>>
        //Consultar modificadores de acceso.

        Cuenta cuenta2 = new Cuenta(555);
        //cuenta2.saldo = 200;
        cuenta2.depositar(400);
        cuenta2.retirar(300);
       // System.out.println(cuenta2.saldo);

        System.out.println(cuenta2.getSaldo());

        // el set

        System.out.println(cuenta2.getAgencia());
    }
}