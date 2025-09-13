
package eva1_22_acceso_tablas;

import java.util.Scanner;

public class EVA1_22_ACCESO_TABLAS {
    //CONSTANTES
    final static String ACCESO_USU = "MARIANA";
    final static String ACCESO_CONTRA = "12345";
    //final static double PI = 3.1416;
    
    public static void main(String[] args) {
        String usuario, contra;
        Scanner captu = new Scanner(System.in);
        System.out.println("*****CONTROL DE ACCESO*****");
        System.out.println("Restaurante la cucaracha Crocante");
        System.out.print("Usuario: ");
        usuario = captu.nextLine();
        System.out.print("Contraseña: ");
        contra = captu.nextLine();
        //OPERADOR AND (y)
        if(usuario.equals(ACCESO_USU) && contra.equals(ACCESO_CONTRA)){
            System.out.println();
            System.out.println("ACCESO CONCEDIDO!");
        }else{
            System.out.println();
            System.out.println("ACCESO DENEGADO!");
    }
    }
    
}
