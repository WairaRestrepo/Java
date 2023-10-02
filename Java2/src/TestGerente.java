public class TestGerente {
    public static void main(String[] args) {

        Gerente gerente = new Gerente();
        //gerente.setSalario(5000);
        //System.out.println(gerente.getbonificacion());

        //Funcionario gerente = new Funcionario();
        gerente.setSalario(6000);
        gerente.setClave("Alaura");
        gerente.setTipo(1);

        System.out.println(gerente.getbonificacion());
        System.out.println(gerente.iniciarSesion("Alaura"));

    }
}
