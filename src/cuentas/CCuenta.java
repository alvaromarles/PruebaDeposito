package cuentas;

/** 
 * Esta clase se encarga de hacer los cálculos de la cuenta, del saldo, de la cantidad a ingresar o retirar.
 * @author ALVARO MARTINEZ LESMES
 * @version v1.0 03/02/2025 
 *  */


public class CCuenta {

	private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     * Método get para el atributo tipoInterés.
     * @return Tipo Double Retorna el tipo de interés
     */
    
    public double getTipoInterés() {
		return tipoInterés;
	}
    
    /**
     * Método set para el atributo tipoInterés.
     * @param tipoInterés Tipo Double. Asigna valor al atributo de clase con el valor del parámetro tipo de Inerés.
     */
	public void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}

    /**
     * Método get para el atributo saldo.
     * @return Tipo Double Retorna el saldo.
     */	
	public double getSaldo() {
		return saldo;
	}

    /**
     * Método set para el atributo saldo.
     * @param saldo Tipo Double. Asigna valor al atributo de clase con el valor del parámetro saldo.
     */	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

    /**
     * Método get para el atributo cuenta.
     * @return cuenta Tipo String. Retorna la cuenta.
     */		
	public String getCuenta() {
		return cuenta;
	}

    /**
     * Método set para el atributo cuenta.
     * @param cuenta Tipo String.  Asigna valor al atributo de clase con el valor del parámetro cuenta.
     */		
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	public String getNombre() {
		return nombre;
	}

    /**
     * Método set para el atributo nombre.
     * @param cuenta nombre String.  Asigna valor al atributo de clase con el valor del parámetro nombre.
     */	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * Constructor Vacio 
	 * 	 */
	public CCuenta()
    {
    }
	
	/**
	 * Constructor que informa los atributos de la clase
	 * @param nom Nombre del Titutar de la Cuenta
	 * @param cue Código de la cuenta bancaria
	 * @param sal Saldo de la cuenta.
	 * @param tipo El tipo de interés.
	 */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }

    /**
     * Calcula El estado mediante el saldo
     * @return Tipo Double. Devuleve el Saldo.
     */
    public double estado()
    {
        return getSaldo();
    }
    
    /**
     * Calcula la cantidad a Ingresar
     * @param cantidad Se informa la cantidad para hacer la comprobación
     * @throws Exception Si la cantidad es menor a 0 devuleve un mensaje de que no se puede ingresarr una cantidad negativa.
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
    /**
     * Calcula la cantidad a retirar
     * @param cantidad Double. Se informa la cantidad a evaluar.
     * @throws Exception Si la cantidad es menor o igual a 0 informa que no puede ser negativo y si la cantidad es mayor que el estado informa que no hay suficiente saldo.
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
}
