package semana01;

public class Caso03Operacion {
 
	public static void main(String[] args) {
        Operacion op = new Operacion();
        System.out.println("Suma de 2 enteros: " + op.sumar(5, 3));
        System.out.println("Suma de 2 decimales: " + op.sumar(5.5, 3.2));
        System.out.println("Suma de 3 enteros: " + op.sumar(5, 3, 2));
    }
}
