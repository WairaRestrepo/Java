public class ControlBonificacion {

    private  double suma;
    public  double registrarSalario (Funcionario funcionario){
        this.suma = funcionario.getbonificacion() + this.suma;
        System.out.println("Calculo actutal :" + this.suma);
        return  this.suma;

    }








}
