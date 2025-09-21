
package eva1_25_operaciones;


public class EVA1_25_OPERACIONES {

    public static void main(String[] args) {
        //DIVISIONES:
        int val1 = 7, val2= 3;
        int resul;
        resul = val1 / val2;
        System.out.print("7 / 3 = ");
        System.out.print(resul);
        System.out.println(" ");

        double va1 = 7.0, va2= 3.0;
        double resu;
        resu = va1 / va2;
        System.out.print("7.0 / 3.0 = ");
        System.out.print(resu);
        System.out.println(" ");

        //CALCULAR RESIDUO
        //RESIDUO = MODULO = %
        int num1 = 2024, num2= 4;
        int resultado;
        resultado = num1 % num2;//CALCULO DE RESIDUO
        System.out.print("Residuo de 2024 % 4 = ");
        System.out.print(resultado);
        System.out.println(" ");
        if(resultado == 0){//División exacta entre 4
            System.out.println("Puede que sea bisiesto!!");
        }
       
    }
    
}