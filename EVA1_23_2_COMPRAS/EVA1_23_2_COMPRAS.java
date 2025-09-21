
package eva1_23_2_compras;

import java.util.Scanner;

public class EVA1_23_2_COMPRAS {
    final static String ACCESO_EFE = "Y";
    final static String ACCESO_CRE = "Y";
    
    public static void main(String[] args) {
        String efectivo, credito;
        Scanner input = new Scanner(System.in);
        
        System.out.println("**Buenas tardes, bievenido a cajas.**");
        System.out.println("Walmasts.");
        System.out.print("¿Tiene efectivo? (Y/N): ");
        efectivo = input.nextLine(); 
        System.out.print("¿Tienes crédito? (Y/N): ");
        credito = input.nextLine();
        System.out.println();
        if(efectivo.equals(ACCESO_EFE) || credito.equals(ACCESO_CRE)){
                System.out.println("Puedes comprar.");    
        } else {
                System.out.println("No puedes comprar. FUCHILA!"); 
        }   
    }
    
}
