package com.mycompany.epe2_axel_soto;

// Definición de la clase Datos_Factura
public class Datos_Factura {

    // Variables de instancia de la clase
    private String nombreCliente;
    private String apellidosCliente;
    private String edadCliente;
    private String rutCliente;
    private String nombreEmpresa;
    private String rutEmpresa;
    private String giroEmpresa;

    // Constructor vacío
    public Datos_Factura() {
    }

    // Constructor con validación de datos
    public Datos_Factura(String nombreCliente, String apellidosCliente, String edadCliente, String rutCliente, String nombreEmpresa, String rutEmpresa, String giroEmpresa) {
        try {
            // Validación de campos no vacíos
            if (nombreCliente.isEmpty() || apellidosCliente.isEmpty() || edadCliente.isEmpty() || rutCliente.isEmpty() || nombreEmpresa.isEmpty() || rutEmpresa.isEmpty() || giroEmpresa.isEmpty()) {
                throw new IllegalArgumentException("Es necesario llenar todos los campos. Por favor, proporcione la información requerida.");
            }
            
            // Asignación de valores a las variables de instancia
            this.nombreCliente = nombreCliente;
            this.apellidosCliente = apellidosCliente;
            this.edadCliente = edadCliente;
            this.rutCliente = rutCliente;
            this.nombreEmpresa = nombreEmpresa;
            this.rutEmpresa = rutEmpresa;
            this.giroEmpresa = giroEmpresa;
        } catch (IllegalArgumentException e) {
            // Manejo de excepciones en caso de datos incorrectos
            System.err.println("Error: " + e.getMessage());
        }
    }

    // Métodos getter y setter para acceder y modificar los datos

    // Getter para el nombre del cliente
    public String getNombreCliente() {
        return nombreCliente;
    }

    // Setter para el nombre del cliente
    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    // Getter para los apellidos del cliente
    public String getApellidosCliente() {
        return apellidosCliente;
    }

    // Setter para los apellidos del cliente
    public void setApellidosCliente(String apellidosCliente) {
        this.apellidosCliente = apellidosCliente;
    }

    // Getter para la edad del cliente
    public String getEdadCliente() {
        return edadCliente;
    }

    // Setter para la edad del cliente
    public void setEdadCliente(String edadCliente) {
        this.edadCliente = edadCliente;
    }

    // Getter para el RUT del cliente
    public String getRutCliente() {
        return rutCliente;
    }

    // Setter para el RUT del cliente
    public void setRutCliente(String rutCliente) {
        this.rutCliente = rutCliente;
    }

    // Getter para el nombre de la empresa
    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    // Setter para el nombre de la empresa
    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    // Getter para el RUT de la empresa
    public String getRutEmpresa() {
        return rutEmpresa;
    }

    // Setter para el RUT de la empresa
    public void setRutEmpresa(String rutEmpresa) {
        this.rutEmpresa = rutEmpresa;
    }

    // Getter para el giro de la empresa
    public String getGiroEmpresa() {
        return giroEmpresa;
    }

    // Setter para el giro de la empresa
    public void setGiroEmpresa(String giroEmpresa) {
        this.giroEmpresa = giroEmpresa;
    }
}
