package modelo.dto;

import java.util.Date;

/**
 *
 * @author salar
 */
public class GuiaDeRemision {
    private long GuiRemid;
    private String numeroGuia;
    private Date fechaEmision;
    private Cliente cliente; // Puede ser ClientePersona o ClienteEmpresa

    public GuiaDeRemision() {
    }

    public GuiaDeRemision(long GuiRemid, String numeroGuia, Date fechaEmision, Cliente cliente) {
        this.GuiRemid = GuiRemid;
        this.numeroGuia = numeroGuia;
        this.fechaEmision = fechaEmision;
        this.cliente = cliente;
    }
    
    
    public long getGuiRemid() { return GuiRemid; }

    // Getters y setters
    public void setGuiRemid(long GuiRemid) {this.GuiRemid = GuiRemid;}

    public String getNumeroGuia() {return numeroGuia;}
    public void setNumeroGuia(String numeroGuia) { this.numeroGuia = numeroGuia; }

    public Date getFechaEmision() { return fechaEmision; }
    public void setFechaEmision(Date fechaEmision) { this.fechaEmision = fechaEmision; }

    public Cliente getCliente() { return cliente; }
    public void setCliente(Cliente cliente) { this.cliente = cliente; }
}
