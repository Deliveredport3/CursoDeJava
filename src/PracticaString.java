public class PracticaString {
    public static void main(String[] args) {
        //Calculando si los valores del objeto son iguales
        String nombrePractica = "PruebaString";
        String nombrePractica2 = new String("PruebaString");
        boolean nombreCurso = nombrePractica == nombrePractica2;
        System.out.println("nombrePractica == nombrePractica2 = " + nombreCurso);

        //Calculando si los datos son iguales
        nombreCurso = nombrePractica.equals(nombrePractica2);
        System.out.println("nombrePractica.equals(nombrePractica2) = " + nombreCurso);

        //Practicando con mayúsculas y minusculas
        nombreCurso = nombrePractica.equalsIgnoreCase(nombrePractica2);
        System.out.println("nombrePractica.equals(nombrePractica2) = " + nombreCurso);
        System.out.println("nombrePractica.equalsIgnoreCase(nombrePractica2) = " + nombreCurso);
    }
}
