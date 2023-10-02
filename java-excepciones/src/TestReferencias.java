public class TestReferencias {
    public static void main(String[] args) {

        Funcionario funcionario = new Contador();
        funcionario.setNombre("Simon");

        Gerente gerente = new Gerente();
        gerente.setNombre("Jimena");

        funcionario.setSalario(2000);
        gerente.setSalario(10000);

        gerente.iniciarSesion("_ddddd");
    }
}
