
package eva1_15_descuento;

import java.util.Scanner;
        
public class EVA1_15_DESCUENTO {

    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        double venta;
        double montoPagar;
        System.out.println("Monto de la venta: ");
        venta = captu.nextDouble();
        if(venta > 1000) {//Le damos 15% de descuento
            montoPagar = venta * 0.85;
            System.out.print("El monto a pagar es: ");
            System.out.println(montoPagar);
        }
    }
    
}
