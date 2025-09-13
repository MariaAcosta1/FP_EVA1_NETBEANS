
package eva1_13_if;

import java.util.Scanner;

public class EVA1_13_IF {

    public static void main(String[] args) {
        //DECLARACIÓN DE VARIABLES
        double califa;
        Scanner captu = new Scanner(System.in);
        //CAPTURA
        System.out.println("Introduce la calificación: ");
        califa = captu.nextDouble();
        //ESTRUCTURA DE CONTROL IF-THEN-ELSE
        //SOLO EVALUA VERDADERO (true) o FALSO (false)
        if (califa >= 70) {
            //AQUI VA LO QUE CORRESPONDE A VERDADERO
            System.out.println("Felicitaciones, acreditaste!!");
        } else {      //SECCIÓN FALSO (opcional)
            System.out.println("Azotes!!");
        }
    }
    
}
