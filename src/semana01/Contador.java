package semana01;

public class Contador {
    
	// variable estática (compartida por todos los objetos)
    private static int contador = 0;
    
    // constructor (se ejecuta al crear un objeto)
    public Contador() {
        contador++;         
    }
    
    // método para obtener el valor del contador
    public static int getContador() {
        return contador;
    }
}
