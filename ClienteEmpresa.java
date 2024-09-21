package modelo.dto;

/**
 *
 * @author salar
 */
public class ClienteEmpresa extends Cliente {
    private String razonSocial;

    private ClienteEmpresa(int id, String direccion, String telefono, String email) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getRazonSocial() { return razonSocial; }
    public void setRazonSocial(String razonSocial) { this.razonSocial = razonSocial; }

   
    public String getTipoCliente() {
        return "Empresa";
    }
}
