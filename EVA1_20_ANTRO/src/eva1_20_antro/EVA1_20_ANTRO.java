
package eva1_20_antro;

import java.util.Scanner;

public class EVA1_20_ANTRO {
    final static String ACCESO_Y = "Y";

    public static void main(String[] args) {
        String credencial;
        int edad;
        Scanner input = new Scanner(System.in);
        System.out.println("******BIENVENIDO******");
        System.out.println("Sistema de venta Antro La Cucaracha Crocante.");
        System.out.print("Introduce tu edad: ");
        edad = input.nextInt(); 
        input.nextLine();//evitar error de captura
        System.out.print("¿Tienes credencial de elector? (Y/N): ");
        credencial = input.nextLine();
        //equals --> compara texto
        if(edad >= 18){//MAYOR DE EDAD
            if(credencial.equals(ACCESO_Y)){//Tienes credencial
                System.out.println("Puedes entrar.");
              } else { //Contraseña incorrecta
                System.out.println("Vas pa fuera!");
            }
        } else { //Contraseña incorrecta
                System.out.println("Vas pa fuera!");
        }
    }
    
}
