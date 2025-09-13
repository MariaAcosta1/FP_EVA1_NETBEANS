
package eva1_19_acceso;

import java.util.Scanner;

public class EVA1_19_ACCESO {
    //CONSTANTES
    final static String ACCESO_USU = "MARIANA";
    final static String ACCESO_CONTRA = "1234";
    //final static double PI = 3.1416;

    public static void main(String[] args) {
        String usuario, contra;
        Scanner captu = new Scanner(System.in);
        System.out.println("*****CONTROL DE ACCESO*****");
        System.out.println("Restaurante la Cucaracha Crocante.");
        System.out.print("Usuario: ");
        usuario = captu.nextLine();
        System.out.print("Contraseña: ");    
        contra = captu.nextLine();
        if(usuario.equals(ACCESO_USU))
        if(contra.equals(ACCESO_CONTRA)){
            System.out.println();
            System.out.println("ACCESO CONCEDIDO!");
        }else{
            System.out.println();
            System.out.println("ACCESO DENEGADO!");
    }
    }
    
}
