
package eva1_24_califas;

import java.util.Scanner;

public class EVA1_24_CALIFAS {

    public static void main(String[] args) {
        int califa;
        Scanner captu = new Scanner(System.in);
        System.out.println("Ingrese la calificación: ");
        califa = captu.nextInt();
        System.out.println(" ");
        
        if(califa >= 90 && califa <= 100)
            System.out.println("A");
        else if(califa >= 80 && califa <= 89)
            System.out.println("B");
        else if(califa >= 70 && califa <= 79)
            System.out.println("C");
        else if(califa >= 60 && califa <= 69)
            System.out.println("D");
        else if(califa >= 0 && califa <= 59)
            System.out.println("F");    
        else
            System.out.println("El número de calificación no es valido.");

    }
}
    
