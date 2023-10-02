public class TestFuncionario {
    public static void main(String[] args) {

        Funcionario alejandro = new Contador();
        alejandro.setNombre("Alejandro");
        alejandro.setDocumento("123");
        alejandro.setSalario(3000);
        alejandro.setTipo(0);

        System.out.println(alejandro.getSalario());
        System.out.println(alejandro.getbonificacion());

    }
}