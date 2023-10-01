
// classse  se utiliza para representar un tipo, una entidad ,un objeto.


public class Cuenta {

   private double saldo;
    private int    agencia;
    private int    numero ;
    Cliente titular = new Cliente();
    private String sexo;

    public Cuenta(int agencia){

        if(agencia >= 0 ) {
            System.out.println("Se ha creado una agencia ");
        }

        }



    //Cuando usas void no retorna nada
      public void depositar (double valor){

            this.saldo = this.saldo + valor;
        }

      public boolean retirar (double valor) {

          if(this.saldo >= valor){
              this.saldo -= valor;

                return true;
          }
          return false;

      }

    public boolean transferir(double valor, Cuenta cuenta){
          if(this.saldo >= valor ) {
              this.saldo = this.saldo - valor;
              //cuenta.saldo = cuenta.saldo + valor;
              cuenta.depositar(valor);
              return true;

          }else {
              return false;
          }
      }

      public double getSaldo(){
        return  this.saldo;

      }



    public int getAgencia() {
        return agencia;
    }
}
