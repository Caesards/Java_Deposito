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
        // Aquí el método operativa_cuenta,
        // que englobe las sentencias de la clase Main que operan con el objeto cuenta1.
        operativa_cuenta(0);
    }
    /**
     * Aqui se simula las operaciones bancarias:
     * primero se crea una cuenta "new CCuenta"
     * Segundo se retira dinero "cuenta1.retirar"
     * tercero se ingresa dinero "cuenta1.ingresar"
     */
    private static void operativa_cuenta(float cantidad) {
        CCuenta cuenta1;
        double saldoActual;

        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
