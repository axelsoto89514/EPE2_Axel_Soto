package com.mycompany.epe2_axel_soto;

import java.util.Scanner;

public class EPE2_Axel_Soto {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Presentación inicial
        System.out.println("¡Bienvenido!");
        System.out.println("------------");
        System.out.println("MENU DE INGRESO DE FACTURAS");

        // Solicitar información del cliente
        System.out.print("Nombre del cliente: ");
        String nombreCliente = scanner.nextLine();
        System.out.print("Apellido del cliente: ");
        String apellidoCliente = scanner.nextLine();
        System.out.print("Edad del cliente: ");
        String edadCliente = scanner.nextLine();
        System.out.print("RUT del cliente: ");
        String rutCliente = scanner.nextLine();

        // Solicitar información de la empresa
        System.out.print("Nombre de la empresa: ");
        String nombreEmpresa = scanner.nextLine();
        System.out.print("RUT de la empresa: ");
        String rutEmpresa = scanner.nextLine();
        System.out.print("Giro de la empresa: ");
        String giroEmpresa = scanner.nextLine();

        // Solicitar datos de ventas
        System.out.print("Total de ventas: ");
        Integer totalVentas = scanner.nextInt();
        System.out.print("Monto total: ");
        double montoVentas = scanner.nextDouble();

        // Cerrar el lector de entrada (Scanner)
        scanner.close();

        // Crear objetos para almacenar los datos
        Datos_Factura factura = new Datos_Factura(nombreCliente, apellidoCliente, edadCliente, rutCliente, nombreEmpresa, rutEmpresa, giroEmpresa);
        Ventas ventas = new Ventas(totalVentas, montoVentas);

        // Calcular el IVA y las utilidades
        double montoIva = ventas.calcularIva();
        double montoUtilidades = ventas.calcularUtilidades();

        // Mostrar los resultados
        System.out.println("Información del Cliente:");
        System.out.println("Nombre: " + factura.getNombreCliente());
        System.out.println("Apellido: " + factura.getApellidosCliente());
        System.out.println("Edad: " + factura.getEdadCliente());
        System.out.println("RUT del Cliente: " + factura.getRutCliente());
        System.out.println("Información de la Empresa:");
        System.out.println("Nombre de la Empresa: " + factura.getNombreEmpresa());
        System.out.println("RUT de la Empresa: " + factura.getRutEmpresa());
        System.out.println("Giro de la Empresa: " + factura.getGiroEmpresa());
        System.out.println("Monto en IVA a pagar: " + montoIva);
        System.out.println("Monto de utilidades: " + montoUtilidades);
    }
}
