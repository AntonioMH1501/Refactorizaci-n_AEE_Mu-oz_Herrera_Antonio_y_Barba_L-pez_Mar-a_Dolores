package facturacion;

/**
 * Clase Legacy del sistema de facturación.
 * ADVERTENCIA: Código con alta deuda técnica. No modificar la firma del método.
 */

public class FacturacionLegacy{
    //Entorno: 
        private static final double DESCUENTO_CLIENTE = 0.05;
        private static final double DESCUENTO_ESTANDAR = 0.15;
        private static final double DESCUENTO_VIP = 0.25;
    /**
     * 
     * @param importeBase En este caso, se recibe el importe sin ningún descuento, que se usará como base para los descuentos. 
     * @param tipoCliente Este parametro se encarga de establecer que tipo de cliente es para saber que descuento se le va a aplicar al final. 
     * @param esSocioVip Esta alternativa se refiere al descuento que se le hace al cliente si es VIP.
     * @return Una vez hecho los cálculos, se devolverá el importe total con los descuentos aplicados. 
     * 
     */
    public double calcularTotal(double importeBase, int tipoCliente, boolean esSocioVip) {
    if (importeBase <= 0){
        return 0;
    }
    
    if (tipoCliente == 1){
        return importeBase - (importeBase * DESCUENTO_ESTANDAR);
    }
    
    if (tipoCliente == 1 && esSocioVip){
        return importeBase - (importeBase * DESCUENTO_VIP);
    }
    
    if (tipoCliente == 2){
        return importeBase - (importeBase * DESCUENTO_CLIENTE);
    }
    
    return importeBase;
    }
}