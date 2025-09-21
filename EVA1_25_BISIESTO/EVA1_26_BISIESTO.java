
package eva1_26_bisiesto;

import java.util.Scanner;

public class EVA1_26_BISIESTO {

    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        int year, resi4, resi100, resi400;
        System.out.println("Captura el año: ");
        year = captu.nextInt();
        resi4 = year % 4;
        resi100 = year % 100;
        resi400 = year % 400;
        //CONDICIONES PARA QUE SEA BISIESTO:
        //DIVISIBLE ENTRE 4
        if(resi4 == 0){
            // DIVISIBLE ENTRE 100 (NO ES BISIESTO)
            if(resi100 == 0){
            // EXCEPTO SI ES DIVISIBLE ENTRE 400 (BISIESTO)
            if(resi400 == 0){
                 System.out.println("El año " + year + " es bisiesto!");
            }else{
                System.out.println("El año " + year + " no es bisiesto!");
            }
        }else{
                 System.out.println("El año " + year + " es bisiesto");
            }
        }else{
            System.out.println("El año: " + year + " no es bisiesto!");
        }
    }
    
}
