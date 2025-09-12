
package eva1_8_temperatura;

public class EVA1_8_TEMPERATURA {

    public static void main(String[] args) {      
        double C, K, Menos;
        K = 15;
        Menos = 273;
        C = (K - Menos);
        System.out.println("3.Pasar de escala Kelvin a Celsius: ");
        System.out.print("°C = K(15) - 273: ");  
        System.out.println(C);
        System.out.println(" ");
    }
    static{
        double K, C, Más; 
        C = 0;
        Más = 273;
        K = (C + Más);
        System.out.println("1.Pasar de escala Celsius a Kelvin: ");
        System.out.print("K = °C(0) + 273: ");
        System.out.println(K);
        System.out.println(" ");
    }
    static{
        double F, C, Más, Multi; 
        C = 5;
        Multi = 1.8;
        Más = 32;
        F = (C * Multi) + Más;
        System.out.println("2.Pasar de escala Celsius a Fahrenheit: ");
        System.out.print("°F = °C(5) x 1.8 + 32: ");  
        System.out.println(F);
        System.out.println(" ");
    }
}
