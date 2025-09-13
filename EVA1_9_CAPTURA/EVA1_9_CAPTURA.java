
package eva1_9_captura;

import java.util.Scanner;

public class EVA1_9_CAPTURA {

    public static void main(String[] args) {
        String nombre;
        int edad;
        double promedio;
        Scanner input = new Scanner(System.in);//CREAMOS EL SCANNER
        
        //COMO CAPTURAR EN JAVA;
        System.out.println("Introduce el nombre completo: ");
        nombre = input.nextLine();//nextLine() --> CAPTURA TEXTO
        
        System.out.println("Introduce la edad: ");
        edad = input.nextInt();
        
        System.out.println("Captura el promedio: ");
        promedio = input.nextDouble();
        System.out.println(" ");
        
        System.out.print("El nombre capturado es: ");
        System.out.println(nombre);
        System.out.print("La edad es: ");
        System.out.println(edad);
        System.out.print("El promedio es: ");
        System.out.println(promedio);
    }
    
}
