package com.mycompany.epe2_axel_soto;

// Declaración de la clase Ventas
public class Ventas extends Datos_Factura {

    // Declaración de variables de instancia
    private Integer totalVentas;
    private double montoVentas;

    // Constructor vacío
    public Ventas() {
    }

    // Constructor con datos de ventas
    public Ventas(Integer totalVentas, double montoVentas) {
        this.totalVentas = totalVentas;
        this.montoVentas = montoVentas;
    }

    // Constructor que toma datos de ventas y datos de la factura (heredados de Datos_Factura)
    public Ventas(Integer totalVentas, double montoVentas, String nombreCliente, String apellidosCliente, String edadCliente, String rutCliente, String nombreEmpresa, String rutEmpresa, String giroEmpresa) {
        super(nombreCliente, apellidosCliente, edadCliente, rutCliente, nombreEmpresa, rutEmpresa, giroEmpresa);
        this.totalVentas = totalVentas;
        this.montoVentas = montoVentas;
    }

    // Métodos getter y setter para acceder y modificar datos de ventas

    // Getter para el total de ventas
    public Integer getTotalVentas() {
        return totalVentas;
    }

    // Setter para el total de ventas
    public void setTotalVentas(Integer totalVentas) {
        this.totalVentas = totalVentas;
    }

    // Getter para el monto total de ventas
    public double getMontoVentas() {
        return montoVentas;
    }

    // Setter para el monto total de ventas
    public void setMontoVentas(double montoVentas) {
        this.montoVentas = montoVentas;
    }

    // Método para calcular el monto del IVA
    public double calcularIva() {
        return montoVentas * 0.19; // IVA del 19%
    }

    // Método para calcular las utilidades restando el IVA
    public double calcularUtilidades() {
        double montoIva = calcularIva();
        return montoVentas - montoIva;
    }
}
