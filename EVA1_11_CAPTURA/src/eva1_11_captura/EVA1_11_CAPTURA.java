
package eva1_11_captura;

import java.util.Scanner;

public class EVA1_11_CAPTURA {

    public static void main(String[] args) {
        //CALCULO DE VELOCIDAD
        //SOLICITAR DISTANCIA (M) Y TIEMPO (S)
        //CALCULAR LA VELOCIDAD (M/S)
        //DECLARACION VARIABLES Y SCANNER
        Scanner input = new Scanner (System.in);
        double distancia, velocidad, tiempo, velocidadKmH;
        
        //SOLICITAR DATOS
        System.out.println("Captura la distancia (en metros): ");
        distancia = input.nextDouble();
        System.out.println("Captura el tiempo (en segundos): ");
        tiempo = input.nextDouble();
        System.out.println(" ");
        
        //REALIZAR CÁLCULOS
        velocidad = distancia / tiempo;
        
        //MOSTRAR RESULTADOS
        System.out.println("La velocidad (m/s) es: ");
        System.out.println(velocidad);
        
        //dar resultado en km/hr
        velocidadKmH = velocidad * 3.6;
        System.out.println("La velocidad en hm/hr es: ");
        System.out.println(velocidadKmH);
    }
    
}
