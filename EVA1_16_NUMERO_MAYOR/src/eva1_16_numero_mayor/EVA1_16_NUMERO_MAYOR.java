
package eva1_16_numero_mayor;

import java.util.Scanner;

public class EVA1_16_NUMERO_MAYOR {

    public static void main(String[] args) {
        int num1, num2;
        Scanner captu = new Scanner(System.in);
        System.out.println("Captura el número 1: ");
        num1 = captu.nextInt();
        System.out.println("Captura el número 2: ");
        num2 = captu.nextInt();
        System.out.println(" ");
        
        if(num1 > num2){
            System.out.print("El número mayor es: ");
            System.out.println(num1);
        } else { //nos queda que num2 > num1 o num2 == num1
            //if anidado
            if(num2 > num1){
            System.out.print("El número mayor es: ");
            System.out.println(num2);
        } else {
            System.out.println("Los numeros son iguales. ");  
            
          }
        }
    }
    
}
