package Cuentas;

/**
 * Este es el constructor principal para que se inice la aplicacion.
 */
public class Main {

    /**
     * Es el constructor por defecto de la clase main.*/

    public Main() {
        // aqui podemos no implementar nada si es necesario
    }

    /**
     * Método principal de la aplicación.
     * Este método se ejecuta al iniciar la aplicación.
     *
     * @param args Los argumentos de línea de comandos pasados a la aplicación.
     */


    public static void main(String[] args) {
        // Aquí va la lógica principal de tu aplicación
        operativa_cuenta();
    }

    /**
     * Aqui se simula las operaciones bancarias:
     * primero se crea una cuenta
     * Segundo se retira dinero
     * tercero se ingresa dinero
     */
    public static void operativa_cuenta(){
        CCuenta Cuenta1;
        double saldoActual;

        Cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = Cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        try {
            Cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            Cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
