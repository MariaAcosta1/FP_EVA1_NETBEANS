
package eva1_14_if_votar;

import java.util.Scanner;

public class EVA1_14_IF_VOTAR {

    public static void main(String[] args) {
        int annio_nac;
        int edad; 
        Scanner captu = new Scanner(System.in);
        System.out.println("Captura tu año de nacimiento: ");
        annio_nac = captu.nextInt();
        edad = 2025 - annio_nac;
        if(edad >= 18){
            System.out.println("Puedes votar.");
        }else{
            System.out.println("No puedes votar. Menor de edad.");
        }
    }
    
}
