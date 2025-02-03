package cuentas;

/** 
 * Esta clase se encarga de iniciar la ejecución del programa.
 * @author ALVARO MARTINEZ LESMES
 * @version v1.0 03/02/2025 
 *  */

public class Main {
	
	/**
	 * El método operativa void se encarga de llamar al método operativa_cuenta.
	 */

    public static void main(String[] args) {
        operativa_cuenta(null);
    }
    
    /* 
     * Método que se encarga de crear una cuenta bancaria, llamar al cálculo del saldo actual
     * Como la cantidad es fija de 2500, siempre enta por ingreso en cuenta
     * 
     * @param cantidad se utiliza para introducir una cantidad (no se está utilizando).
     */

	public static void operativa_cuenta(Float cantidad) {
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
