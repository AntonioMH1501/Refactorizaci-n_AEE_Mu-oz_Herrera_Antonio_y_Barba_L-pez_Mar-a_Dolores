package facturacion;

/**
 * Clase Legacy del sistema de facturación.
 * ADVERTENCIA: Código con alta deuda técnica. No modificar la firma del método.
 */

public class FacturacionLegacy{
    
    //Método a refactorizar
    public double calcularTotal(double importeBase, int tipoCliente, boolean esSocioVip) {
    if (importeBase > 0) {
        if (tipoCliente == 1) {
            if (esSocioVip == true) return importeBase - (importeBase * DESCUENTO_VIP);
            else return importeBase - (importeBase * DESCUENTO_ESTANDAR);
        } else {
            if (tipoCliente == 2) {
                return importeBase - (importeBase * DESCUENTO_CLIENTE);
            } else {
                return importeBase;
            }
        }
    } else {
        return 0;
    }
}
    private static final double DESCUENTO_CLIENTE = 0.05;
    private static final double DESCUENTO_ESTANDAR = 0.15;
    private static final double DESCUENTO_VIP = 0.25;
}