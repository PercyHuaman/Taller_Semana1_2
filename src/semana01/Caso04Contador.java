package semana01;

public class Caso04Contador {

    public static void main(String[] args) {

        // creación de objetos
        Contador c1 = new Contador();
        Contador c2 = new Contador();
        Contador c3 = new Contador();
        Contador c4 = new Contador();

        // mostrar cuántos objetos se crearon
        System.out.println("Objetos creados: " + Contador.getContador());
    }
}
