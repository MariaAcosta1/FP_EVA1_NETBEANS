
package eva1_21_errores_comunes;

public class EVA1_21_ERRORES_COMUNES {

    public static void main(String[] args) {
        int num1 = 1, num2 = 2;
        
        if(num1 > num2);//ERROR, TERMINA EN IF,
                System.out.println("Ups, fuera del if"); 
        
        if(num1 > num2)
            if(num1 > num2)
                System.out.println("Num1 es mayor");
        else //PARECE QUE PERTENECE AL PRIMER IF PERO ES DEL SEGUNDO
                System.out.println("Num2 es mayor");
        
        if(num1 > num2){
            if(num1 > num2)
                System.out.println("Num1 es mayor");
        else //PERTENECE AL PRIMER IF
                System.out.println("Num2 es mayor");
        }
    }
    
}
