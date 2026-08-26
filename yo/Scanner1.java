package yo;
import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Como te llamas?");
        String nombre = scanner.nextLine();
        System.out.println("Cual es tu edad?");
        int edad1 = Integer.parseInt(scanner.nextLine());
        int edad2 = edad1 + 10;

        System.out.println("Hola " + nombre + ", En 10 años tendras " + edad2 );

        
    }
}
