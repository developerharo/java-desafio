
import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nombre = "José Haro";
        String tipoDeCuenta = "Cheques";
        double saldo = 999999.00;
        int opcion = 0;

        System.out.println("***************************");
        System.out.println("\n");
        System.out.println("Cliente: " + nombre);
        System.out.println("Tipo de cuenta: " + tipoDeCuenta);
        System.out.println("Saldo: $ " + saldo);
        System.out.println("\n");
        System.out.println("***************************");

        String menu = """
                *** Escribe el número de la opción deseada ***
                1 - Consultar saldo
                2 - Retirar
                3 - Depositar
                9 - Salir
                """;

        Scanner teclado = new Scanner(System.in);
        while (opcion != 9) {
            System.out.println(menu);
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("El saldo actual es: $" + saldo);
                    break;
                case 2:
                    System.out.println("Monto a retirar: ");
                    double valorARetirar = teclado.nextDouble();
                    if (saldo < valorARetirar) {
                        System.out.println("Saldo insuficiente");
                    } else {
                        saldo = saldo - valorARetirar;
                        System.out.println("El saldo actualizado es: $" + saldo );
                    }
                    break;
                case 3:
                    System.out.println("Monto a depositar: ");
                    double valorADepositar = teclado.nextDouble();
                    saldo += valorADepositar;
                    System.out.println("El saldo actualizado es: $" + saldo );
                    break;
                case 9:
                    System.out.println("Saliendo, gracias por utilizar nuestros servicios");
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;


            }
        }
    }
}