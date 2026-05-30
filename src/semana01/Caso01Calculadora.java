package semana01;
import java.util.Scanner;

public class Caso01Calculadora {
    public static double sumar(double a, double b) { 
        return a + b; 
    }
    
    public static double restar(double a, double b) { 
        return a - b; 
    }
    
    public static double multiplicar(double a, double b) { 
        return a * b; 
    }
    public static double dividir(double a, double b) { 
        if (b == 0) { 
            System.out.println("No se puede dividir entre cero."); 
            return 0; 
        }  
        return a / b;
    }
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el primer número: "); double num1 = sc.nextDouble();
        System.out.print("Ingrese el segundo número: "); double num2 = sc.nextDouble();
        System.out.println("\n===== MENU =====");
        System.out.print("Seleccione una operación:\n");
        System.out.println("1. Suma"); 
        System.out.println("2. Resta"); 
        System.out.println("3. Multiplicación"); 
        System.out.println("4. División"); 
        System.out.print("Opcion Seleccionada:"); int opcion = sc.nextInt();
  
      switch (opcion) {     
            case 1:
                System.out.println("\nResultado de Suma es: " + sumar(num1, num2)); break;
            case 2:
                System.out.println("\nResultado de Resta es: " + restar(num1, num2)); break; 
            case 3:
                System.out.println("\nResultado de Multiplicación es: " + multiplicar(num1, num2));  break;
            case 4:
                System.out.println("\nResultado de División es: " + dividir(num1, num2)); break; 
            default:
                System.out.println("\nOpción inválida."); 
        }
        sc.close();
    }
}
