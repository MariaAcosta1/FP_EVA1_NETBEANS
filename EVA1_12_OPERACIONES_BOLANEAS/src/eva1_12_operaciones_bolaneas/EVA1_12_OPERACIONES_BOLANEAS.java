
package eva1_12_operaciones_bolaneas;

public class EVA1_12_OPERACIONES_BOLANEAS {

    public static void main(String[] args) {
        int radio = 5;//declaro e inicializo
        boolean resu;//true-false
        //USO DE OPERADORES BOOLEANOS:
        
        resu = radio < 0;
        System.out.print("Radio (5) < 0 es: ");
        System.out.println(resu);
        System.out.println(" ");
        
        resu = radio > 0;//radio (5) > 0
        System.out.print("Radio (5) > 0 es: ");
        System.out.println(resu);
        System.out.println(" ");
        
        resu = radio == 0;//radio (5) == 0
        System.out.print("Radio (5) = 0 es: ");
        System.out.println(resu);
        System.out.println(" ");
        
        resu = radio !=0;//radio (5) !=0
        System.out.print("Radio (5) !=0 es: ");
        System.out.println(resu);
    }
    
}
