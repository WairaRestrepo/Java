public class Principal {

    //Se genera el nombre de las constantes  en mayusculas
    // ESTE YA NO SE UTILIZA POR QUE SE DECLARAN EN UNA CLASE DE TIPO ENUM ->>> public static final String DIA_LUNES = "lunes";
    // EJp: se utiliza para los colores , enumeracion de planetas o menus.
    //Enum funciona como un arrys y solo tiene en cuenta los datos declarados dentro de la clase
    public static void main(String[] args) {
        for (Dia dia : Dia.values()){
            System.out.println("El dia de la semana es: " + dia);
        }

        Dia domingo = Dia.DOMINGO;
        System.out.println(domingo.name());
        System.out.println(domingo.ordinal());
        System.out.println(domingo.toString());


    }
}
