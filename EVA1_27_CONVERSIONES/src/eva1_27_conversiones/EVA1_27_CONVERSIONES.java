
package eva1_27_conversiones;

public class EVA1_27_CONVERSIONES {

    public static void main(String[] args) {
        int temp;
        double tempDec = 25.7;
        temp = (int)tempDec;
        System.out.println(temp);
        
        double tempDec2;
        tempDec2 = temp;
        System.out.println(tempDec2);
        
        String cade, mensaje;
        cade = "La temperatura es ";
        mensaje = cade + true;//Concatenación
        System.out.println(mensaje);
    }
    
}
