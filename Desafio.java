import java.util.Scanner;

public class Desafio{
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        String nombre = "John M";
        String tipoCuenta = " Corriente";
        double saldo = 1599.99;
        int opcion = 0;
        
        System.out.println("*********************************");
        System.out.println("\nNombre del cliente: " + nombre);
        System.out.println("El tipo de cuenta es: " + tipoCuenta);
        System.out.println("Su saldo es: " + saldo + "$");
        System.out.println("\n*********************************");

        String menu = """
               *** Escriba el numero de la opcion deseada***
               1 - Consultar Saldo
               2 - Retirar
               3 - Despositar
               4 - Salir 
                """;

        Scanner teclado = new Scanner(System.in);
        while (opcion != 4) {
            System.out.println(menu);
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Su saldo actualizado es: " + saldo + "$");
                    break;
                case 2:
                    System.out.println("¿Cual es el valor que desea retirar?: ");
                    double valorARetirar = teclado.nextDouble();
                    if (saldo < valorARetirar){
                        System.out.println("Saldo Insuficiente");
                    } else {
                        saldo = saldo - valorARetirar;
                        System.out.println("El saldo actualizado es: " + saldo + "$");
                    
                    }
                    break;
                case 3:
                    System.out.println("¿Cual es el valor que desea depositar?: ");
                    double valorADepositar = teclado.nextDouble();
                    saldo = saldo + valorADepositar;
                    System.out.println("El saldo actualizado es: " + saldo + "$");
                    break;
                case 4:
                    System.out.println("Saliendo del programa, gracias por utilizar nuestros servicios");
                    break;
                default: 
                System.out.println(" Opcion no valida");
                break;
                          
            }

            
        }


    }

    
}