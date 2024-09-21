package modelo.dto;

import java.util.Date;

/**
 *
 * @author salar
 */
public class Pago {
    private Long pagoID;
    private Long pedidoID;  // Referencia al pedido
    private Date fechaPago;
    private Double monto;
    private String metodoPago;

    // Getters y Setters
    public Long getPagoID() {
        return pagoID;
    }

    public void setPagoID(Long pagoID) {
        this.pagoID = pagoID;
    }

    public Long getPedidoID() {
        return pedidoID;
    }

    public void setPedidoID(Long pedidoID) {
        this.pedidoID = pedidoID;
    }

    public Date getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(Date fechaPago) {
        this.fechaPago = fechaPago;
    }

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }
}
