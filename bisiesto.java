import java.util.Scanner;

public class bisiesto {
 public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    System.out.println("Introduce el año: ");
    int año = scanner.nextInt(); 

    if (año % 400 == 0) {
        
        if(año % 100 != 0){
            System.out.println("El año " + año + " es bisiesto");
        }
        System.out.println("El año " + año + " es bisiesto");
    } else {
        System.out.println("No es bisiesto");
    }
    scanner.close();
 }   
}
