package prueba;

public class Main {

    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        
        System.out.println("Ingrese su mes de nacimiento usando numeros (del 1 al 12)");
        int mes = input.nextInt();
        
        System.out.println("Ingrese su dia de nacimiento");
        int dia = input.nextInt();
        
        System.out.println("Su signo es: " + new Signo(mes, dia).ObtenerSigno() + "\n");
        
        main(null);
    }
    
}
