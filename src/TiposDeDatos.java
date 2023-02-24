public class TiposDeDatos {
    public static void main(String[] args) {
       //Datos de una persona con definicion de datos
        String nombres = "Carlos Antonio ";
        String apellidos = "Garcia Ruiz ";
        int age = 21;
        String persona = nombres + apellidos;
        System.out.println("Nombre Completo: " + persona);
        System.out.println("Edad: " + age);

        //Suma con datos Int
        int numero_1 = 5;
        int numero_2 = 57;
        System.out.println("La suma de numero 1 y numero 2 da como resultado: " + (numero_1 + numero_2));

        //Multiplicacion con datos int
        int numero_3 = 45;
        int numero_4 = 23;
        System.out.println("La multiplicacion de numero 3 y numero 4 da como resultado: " + (numero_3 * numero_4));

        //Division con datos tipo Float
        float numero_5 = 785;
        float numero_6 = 24;
        float resultado;
        resultado = numero_5 / numero_6;
        System.out.println("La division de numero 5 y numero 6 da como resultado: " + resultado);

        //suma y multipliacion juntas
        int suma1 = 24;
        int suma2 = 33;
        int datoDeMultiplicacion = 145;
        int resultadoDeCaso2;
        resultadoDeCaso2 = (suma1 + suma2) * datoDeMultiplicacion;
        System.out.println("Resultado de la operacion: " + (suma1 + suma2) * datoDeMultiplicacion);
        System.out.println("El resultado de la suma junto con la multiplicacion es:  " + resultadoDeCaso2);

    }
}