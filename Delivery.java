package modelo.dto;

import java.util.Date;

/**
 *
 * @author salar
 */
public class Delivery {
    private Long deliveryID;
    private Long pedidoID;  // Referencia al pedido
    private Date fechaDelivery;
    private String direccionDelivery;

    // Getters y Setters
    public Long getDeliveryID() {
        return deliveryID;
    }

    public void setDeliveryID(Long deliveryID) {
        this.deliveryID = deliveryID;
    }

    public Long getPedidoID() {
        return pedidoID;
    }

    public void setPedidoID(Long pedidoID) {
        this.pedidoID = pedidoID;
    }

    public Date getFechaDelivery() {
        return fechaDelivery;
    }

    public void setFechaDelivery(Date fechaDelivery) {
        this.fechaDelivery = fechaDelivery;
    }

    public String getDireccionDelivery() {
        return direccionDelivery;
    }

    public void setDireccionDelivery(String direccionDelivery) {
        this.direccionDelivery = direccionDelivery;
    }
}

