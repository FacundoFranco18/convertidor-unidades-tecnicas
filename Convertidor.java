import java.util.Scanner;

public class Convertidor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("--- Convertidor Técnico: BTU a Frigorías ---");
        System.out.print("Ingrese el valor en BTU: ");
        double btu = sc.nextDouble();
        
        // 1 BTU ≈ 0.252 kcal (frigorías)
        double frigorias = btu * 0.252;
        
        System.out.println("Resultado: " + btu + " BTU equivalen a " + Math.round(frigorias) + " frigorías.");
    }
}
