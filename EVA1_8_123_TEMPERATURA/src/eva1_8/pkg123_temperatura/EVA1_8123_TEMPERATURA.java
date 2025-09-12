
package eva1_8.pkg123_temperatura;

public class EVA1_8123_TEMPERATURA {

    public static void main(String[] args) {
        double K, C; 
        C = 69;
        K = (C + 273.15);
        System.out.println("De Celsius a Kelvin: ");
        System.out.print("°C + 273.15 = °K ");
        System.out.println(K);
        System.out.println(" ");
    }
    static{ 
        double F, C;
        F = 34;
        C = 5*(F - 32) / 9;
        System.out.println("De Fahrenheit a Celsius: ");
        System.out.print("5(°F-32)/9 = °C ");
        System.out.println(C);
        System.out.println(" ");     
    }
    static{ 
        double F, C;
        C = 77;
        F = 9*C /5 +32;
        System.out.println("De Celsius a Fahrenheit: ");
        System.out.print("9°C/5 +32 = °F ");
        System.out.println(F);
        System.out.println(" "); 
    }   
    
    
}
