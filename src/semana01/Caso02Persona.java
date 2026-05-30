package semana01;

public class Caso02Persona {
    public static void main(String[] args) {
        Persona p1 = new Persona();
        p1.nombre = "Percy";
        p1.edad = 30;

        Persona p2 = new Persona();
        p2.nombre = "Maria";
        p2.edad = 29;

        p1.mostrarDatos();
        p2.mostrarDatos();
    }
}
