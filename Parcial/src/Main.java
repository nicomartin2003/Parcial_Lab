import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Le pedi el nombre al usuario y le di la Bienvenida
        System.out.print("Por favor, introduzca su nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("¡Bienvenido, " + nombre + "!");
        //Le di las opciones de la calculadora
        while (true) {
            System.out.println("¿Qué operación desea realizar hoy?");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. División");
            System.out.println("4. Multiplicación");
            System.out.println("5. Salir");

            int opcion = scanner.nextInt();
            //cree un if para cada opcione que elija el usuario
            if (opcion == 5) {
                System.out.println("¡Adiós, " + nombre + "!");
                break;
            }

            System.out.print("Por favor, ingrese el primer número: ");
            int num1 = scanner.nextInt();

            System.out.print("Por favor, ingrese el segundo número: ");
            int num2 = scanner.nextInt();

            if (opcion == 1) {
                System.out.println("La suma de los números es " + (num1 + num2));
            } else if (opcion == 2) {
                System.out.println("La resta de los números es " + (num1 - num2));
            } else if (opcion == 3) {
                if (num2 != 0) {
                    System.out.println("La división de los números es " + (num1 / num2));
                } else {
                    System.out.println("No es posible dividir por cero.");
                }
            } else if (opcion == 4) {
                System.out.println("La multiplicación de los números es " + (num1 * num2));
            }
        }}
}